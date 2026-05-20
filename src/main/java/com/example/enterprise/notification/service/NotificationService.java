package com.example.enterprise.notification.service;

import com.example.enterprise.notification.domain.NotificationRecord;
import com.example.enterprise.notification.mapper.NotificationMapper;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 알림 발송 서비스.
 * AI 분석 포인트:
 * - TBNOTIFY.RECEIVERNM 컬럼이 언제 snapshot으로 저장되는지
 * - 담당자 변경 이후 어떤 테이블만 갱신되는지
 * - submitted 상태에서는 어떤 필드가 보존되는지
 */
public class NotificationService {
    private final NotificationMapper mapper;

    public NotificationService(NotificationMapper mapper) {
        this.mapper = mapper;
    }

    public NotificationRecord findRequired(String id) {
        NotificationRecord record = mapper.findById(id);
        if (record == null) {
            throw new IllegalArgumentException("알림 발송 데이터가 없습니다: " + id);
        }
        return record;
    }

    public List<NotificationRecord> findSubmittedByInstitutions(List<String> instCds) {
        if (instCds == null || instCds.isEmpty()) {
            return new ArrayList<>();
        }
        return mapper.findSubmittedByInstCds(instCds)
            .stream()
            .filter(r -> r != null && r.isSubmitted())
            .collect(Collectors.toList());
    }

    public Map<String, Object> submitAndSnapshot(String id, String actorId) {
        NotificationRecord record = findRequired(id);
        validateBeforeSubmit(record);
        record.refreshSnapshot();
        record.submit(actorId);
        mapper.updateSnapshot(record);
        mapper.updateStatus(record);
        mapper.insertAudit("SUBMIT", record.toAuditMap());
        return buildResult("SUBMITTED", record);
    }

    public Map<String, Object> changeNameWithoutSnapshotSync(String id, String newName, String actorId) {
        NotificationRecord record = findRequired(id);
        String before = record.getName();
        record.changeName(newName, actorId, "운영자 변경");
        mapper.updateNameOnly(record);
        mapper.insertAudit("CHANGE_NAME_ONLY", record.toAuditMap());
        Map<String, Object> result = buildResult("NAME_CHANGED", record);
        result.put("beforeName", before);
        result.put("afterName", newName);
        result.put("snapshotSynced", false);
        return result;
    }

    public Map<String, Object> changeNameWithSnapshotSync(String id, String newName, String actorId) {
        NotificationRecord record = findRequired(id);
        record.changeName(newName, actorId, "재제출 동기화");
        if (record.isSubmitted()) {
            record.refreshSnapshot();
        }
        mapper.updateNameOnly(record);
        mapper.updateSnapshot(record);
        mapper.insertAudit("CHANGE_NAME_WITH_SYNC", record.toAuditMap());
        return buildResult("NAME_CHANGED_WITH_SYNC", record);
    }

    public List<Map<String, Object>> analyzeSnapshotMismatch(List<String> instCds, LocalDate 기준일) {
        List<NotificationRecord> records = findSubmittedByInstitutions(instCds);
        List<Map<String, Object>> result = new ArrayList<>();
        for (var record : records) {
            if (record.hasSnapshotMismatch()) {
                Map<String, Object> row = new LinkedHashMap<>();
                row.put("instCd", record.getInstCd());
                row.put("currentName", record.getName());
                row.put("snapshotName", record.getSnapshotName());
                row.put("submitted", record.isSubmitted());
                row.put("baseDate", 기준일);
                row.put("probableCause", inferMismatchCause(record));
                row.put("operatorMessage", record.describeForOperator());
                result.add(row);
            }
        }
        return result;
    }

    public void reconcileSnapshotByPolicy(List<String> instCds, String actorId, boolean dryRun) {
        List<Map<String, Object>> mismatches = analyzeSnapshotMismatch(instCds, LocalDate.now());
        for (Map<String, Object> mismatch : mismatches) {
            String instCd = String.valueOf(mismatch.get("instCd"));
            NotificationRecord record = mapper.findLatestSubmittedByInstCd(instCd);
            if (record == null) {
                continue;
            }
            if (dryRun) {
                mapper.insertAudit("RECONCILE_DRY_RUN", record.toAuditMap());
                continue;
            }
            record.refreshSnapshot();
            record.setUpdatedBy(actorId);
            mapper.updateSnapshot(record);
            mapper.insertAudit("RECONCILE_APPLIED", record.toAuditMap());
        }
    }

    public Map<String, Object> buildOperationalAnswer(List<String> instCds, LocalDate 기준일) {
        List<Map<String, Object>> mismatches = analyzeSnapshotMismatch(instCds, 기준일);
        Map<String, Object> answer = new LinkedHashMap<>();
        answer.put("module", "notification");
        answer.put("table", "TBNOTIFY");
        answer.put("column", "RECEIVERNM");
        answer.put("mismatchCount", mismatches.size());
        answer.put("baseDate", 기준일);
        answer.put("rows", mismatches);
        answer.put("summary", buildSummary(mismatches));
        answer.put("recommendedSql", buildRecommendedSql(instCds));
        return answer;
    }

    private void validateBeforeSubmit(NotificationRecord record) {
        if (record.getInstCd() == null || record.getInstCd().isBlank()) {
            throw new IllegalStateException("기관코드가 없어 제출할 수 없습니다.");
        }
        if (record.getName() == null || record.getName().isBlank()) {
            throw new IllegalStateException("담당자명이 없어 제출할 수 없습니다.");
        }
        if (Objects.equals(record.getStatus(), "LOCKED")) {
            throw new IllegalStateException("잠금 상태에서는 제출할 수 없습니다.");
        }
    }

    private String inferMismatchCause(NotificationRecord record) {
        if (!record.isSubmitted()) {
            return "미제출 데이터는 분석 대상이 아닙니다.";
        }
        if (record.getSnapshotName() == null || record.getSnapshotName().isBlank()) {
            return "제출 당시 snapshot 컬럼이 비어 있었거나 이전 마이그레이션 누락 가능성이 있습니다.";
        }
        if (record.getUpdatedAt() != null && record.getCreatedAt() != null
            && record.getUpdatedAt().isAfter(record.getCreatedAt())) {
            return "제출 이후 현재 담당자명이 변경되었으나 snapshot 컬럼은 보존되어 불일치가 발생했을 가능성이 큽니다.";
        }
        return "정확한 원인은 감사 로그와 변경 이력을 함께 확인해야 합니다.";
    }

    private Map<String, Object> buildResult(String code, NotificationRecord record) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", code);
        map.put("id", record.getId());
        map.put("instCd", record.getInstCd());
        map.put("name", record.getName());
        map.put("snapshotName", record.getSnapshotName());
        map.put("hasMismatch", record.hasSnapshotMismatch());
        map.put("updatedAt", LocalDateTime.now());
        return map;
    }

    private String buildSummary(List<Map<String, Object>> mismatches) {
        if (mismatches.isEmpty()) {
            return "기준 기관 목록에서 제출완료 snapshot 불일치가 발견되지 않았습니다.";
        }
        return "제출 이후 담당자명 변경 또는 snapshot 미동기화로 보이는 불일치가 "
            + mismatches.size() + "건 발견되었습니다.";
    }

    private String buildRecommendedSql(List<String> instCds) {
        String inClause = instCds.stream().map(s -> "'" + s + "'").collect(Collectors.joining(","));
        return "SELECT A.INSTCD, U.USERNM, A." + "RECEIVERNM" + " "
            + "FROM TBNOTIFY A JOIN TBUSER U ON A.INSTCD = U.INSTCD "
            + "WHERE A.STATUS = 'SUBMITTED' AND NVL(U.USERNM,' ') <> NVL(A.RECEIVERNM,' ') "
            + "AND A.INSTCD IN (" + inClause + ")";
    }
}
