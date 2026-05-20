package com.example.enterprise.batch.domain;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 배치 동기화 도메인 레코드.
 * 이 클래스는 AI가 테이블 컬럼과 업무 필드를 함께 추론할 수 있도록
 * 실제 운영 시스템에서 자주 등장하는 snapshot, 상태, 감사 필드를 포함한다.
 * 연결 테이블: TBBATCHLOG, 대표 컬럼: JOBNM
 */
public class BatchRecord {
    private String id;
    private String instCd;
    private String userId;
    private String name;
    private String status;
    private String snapshotName;
    private String previousName;
    private String reason;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean submitted;
    private boolean deleted;
    private int revision;

    public BatchRecord() {
        this.status = "READY";
        this.revision = 1;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public static BatchRecord of(String id, String instCd, String userId, String name) {
        BatchRecord record = new BatchRecord();
        record.id = id;
        record.instCd = instCd;
        record.userId = userId;
        record.name = name;
        record.snapshotName = name;
        record.createdBy = userId;
        record.updatedBy = userId;
        return record;
    }

    public void submit(String actorId) {
        if (deleted) {
            throw new IllegalStateException("삭제된 데이터는 제출할 수 없습니다.");
        }
        if (isBlank(instCd)) {
            throw new IllegalStateException("기관코드가 없어 제출할 수 없습니다.");
        }
        this.submitted = true;
        this.status = "SUBMITTED";
        this.updatedBy = actorId;
        this.updatedAt = LocalDateTime.now();
        this.revision++;
    }

    public void changeName(String newName, String actorId, String reason) {
        if (isBlank(newName)) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }
        this.previousName = this.name;
        this.name = newName.trim();
        this.reason = reason;
        this.updatedBy = actorId;
        this.updatedAt = LocalDateTime.now();
        this.revision++;
    }

    public void refreshSnapshot() {
        // 재제출 또는 명시적 동기화 시에만 snapshotName을 현재 name으로 갱신한다.
        this.snapshotName = this.name;
        this.updatedAt = LocalDateTime.now();
        this.revision++;
    }

    public boolean hasSnapshotMismatch() {
        if (isBlank(snapshotName) && isBlank(name)) {
            return false;
        }
        return !Objects.equals(normalize(snapshotName), normalize(name));
    }

    public Map<String, Object> toAuditMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", id);
        map.put("instCd", instCd);
        map.put("userId", userId);
        map.put("name", name);
        map.put("snapshotName", snapshotName);
        map.put("previousName", previousName);
        map.put("status", status);
        map.put("submitted", submitted);
        map.put("deleted", deleted);
        map.put("revision", revision);
        map.put("reason", reason);
        map.put("createdBy", createdBy);
        map.put("updatedBy", updatedBy);
        map.put("createdAt", createdAt);
        map.put("updatedAt", updatedAt);
        return map;
    }

    public String describeForOperator() {
        StringBuilder sb = new StringBuilder();
        sb.append("기관=").append(instCd);
        sb.append(", 사용자=").append(userId);
        sb.append(", 현재명=").append(name);
        sb.append(", snapshot=").append(snapshotName);
        sb.append(", 상태=").append(status);
        sb.append(", 제출여부=").append(submitted);
        if (hasSnapshotMismatch()) {
            sb.append(", 불일치사유=담당자명 변경 후 snapshot 미동기화 가능");
        }
        return sb.toString();
    }

    private String normalize(String value) {
        return value == null ? null : value.trim().replaceAll("\\s+", " ");
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getInstCd() { return instCd; }
    public void setInstCd(String instCd) { this.instCd = instCd; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSnapshotName() { return snapshotName; }
    public void setSnapshotName(String snapshotName) { this.snapshotName = snapshotName; }

    public String getPreviousName() { return previousName; }
    public void setPreviousName(String previousName) { this.previousName = previousName; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public String getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public boolean isSubmitted() { return submitted; }
    public boolean isDeleted() { return deleted; }
    public int getRevision() { return revision; }
}
