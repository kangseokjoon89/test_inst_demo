package com.training.ops.user_charge.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 담당자 기준정보 레코드.
 * 테이블: TBUSER
 * snapshot 컬럼: USERNM
 * 의도: 현재 기준값과 제출 당시 보존값을 함께 담아 AI가 차이를 설명할 수 있도록 한다.
 */
public class UserChargeRecord {

    private String id;
    private String instCd;
    private String userId;
    private String currentName;
    private String snapshotName;
    private String status;
    private String submitDt;
    private String changeDt;
    private String batchYn;
    private String skipReason;
    private String sourceRevision;
    private String screenId;
    private String transactionId;
    private String updatedBy;
    private String memo;

    public static UserChargeRecord sample(String instCd, String currentName, String snapshotName) {
        UserChargeRecord record = new UserChargeRecord();
        record.id = "USER_CHARGE-" + instCd;
        record.instCd = instCd;
        record.userId = "USER-" + instCd;
        record.currentName = currentName;
        record.snapshotName = snapshotName;
        record.status = "SUBMITTED";
        record.submitDt = "2026-05-15";
        record.changeDt = "2026-05-18";
        record.batchYn = "N";
        record.skipReason = "기관 개별 수정";
        record.sourceRevision = "r20260518";
        record.screenId = "담당자관리";
        record.transactionId = "user_charge_save";
        record.updatedBy = "operator";
        record.memo = "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황";
        return record;
    }

    public boolean isSubmitted() {
        return "SUBMITTED".equals(status) || "제출완료".equals(status);
    }

    public boolean hasMeaningfulGap() {
        String a = normalize(currentName);
        String b = normalize(snapshotName);
        if (a == null && b == null) {
            return false;
        }
        return !Objects.equals(a, b);
    }

    public boolean changedAfterSubmit() {
        if (submitDt == null || changeDt == null) {
            return false;
        }
        return changeDt.compareTo(submitDt) > 0;
    }

    public boolean hasBatchSkipReason() {
        return "N".equals(batchYn) && skipReason != null && !skipReason.isBlank();
    }

    public Map<String, Object> toAiEvidence() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("id", id);
        map.put("instCd", instCd);
        map.put("userId", userId);
        map.put("currentName", currentName);
        map.put("snapshotName", snapshotName);
        map.put("status", status);
        map.put("submitDt", submitDt);
        map.put("changeDt", changeDt);
        map.put("batchYn", batchYn);
        map.put("skipReason", skipReason);
        map.put("sourceRevision", sourceRevision);
        map.put("screenId", screenId);
        map.put("transactionId", transactionId);
        map.put("updatedBy", updatedBy);
        map.put("memo", memo);
        map.put("table", "TBUSER");
        map.put("snapshotColumn", "USERNM");
        return map;
    }

    public String explainInKorean() {
        StringBuilder sb = new StringBuilder();
        sb.append("기관 ").append(instCd).append("은 ");
        sb.append("현재값[").append(currentName).append("]과 ");
        sb.append("snapshot[").append(snapshotName).append("]을 비교해야 한다. ");
        if (hasMeaningfulGap() && changedAfterSubmit()) {
            sb.append("제출 이후 변경 이력이 있어 보존값과 현재값이 다를 수 있다.");
        } else if (hasMeaningfulGap()) {
            sb.append("값은 다르지만 변경 시점 확인이 추가로 필요하다.");
        } else {
            sb.append("현재 조회 기준에서는 값 차이가 없다.");
        }
        return sb.toString();
    }

    private String normalize(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed.replaceAll("\\s+", " ");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = normalize(id);
    }

    public String getInstCd() {
        return instCd;
    }

    public void setInstCd(String instCd) {
        this.instCd = normalize(instCd);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = normalize(userId);
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = normalize(currentName);
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = normalize(snapshotName);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = normalize(status);
    }

    public String getSubmitDt() {
        return submitDt;
    }

    public void setSubmitDt(String submitDt) {
        this.submitDt = normalize(submitDt);
    }

    public String getChangeDt() {
        return changeDt;
    }

    public void setChangeDt(String changeDt) {
        this.changeDt = normalize(changeDt);
    }

    public String getBatchYn() {
        return batchYn;
    }

    public void setBatchYn(String batchYn) {
        this.batchYn = normalize(batchYn);
    }

    public String getSkipReason() {
        return skipReason;
    }

    public void setSkipReason(String skipReason) {
        this.skipReason = normalize(skipReason);
    }

    public String getSourceRevision() {
        return sourceRevision;
    }

    public void setSourceRevision(String sourceRevision) {
        this.sourceRevision = normalize(sourceRevision);
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = normalize(screenId);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = normalize(transactionId);
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = normalize(updatedBy);
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = normalize(memo);
    }



    public String aiClue1() {
        return "user_charge:1 - 제출 시점의 값을 남겨야 하는 요구와 현재 기준정보를 보여줘야 하는 요구가 충돌할 수 있다.";
    }

    public String aiClue2() {
        return "user_charge:2 - 운영 문의에는 대개 기관코드, 기준일, 화면명, 담당자명이 함께 포함된다.";
    }

    public String aiClue3() {
        return "user_charge:3 - AI는 소스 검색만 하지 말고 화면 이벤트에서 SQL 컬럼까지 이어지는 경로를 찾아야 한다.";
    }

    public String aiClue4() {
        return "user_charge:4 - Tibero 환경에서는 일반 SELECT와 JOIN 기반 진단 SQL을 우선 제공한다.";
    }

    public String aiClue5() {
        return "user_charge:5 - 서브쿼리 없이 조건을 분해하면 DBeaver에서 운영자가 단계별로 검증하기 쉽다.";
    }

    public String aiClue6() {
        return "user_charge:6 - Nexacro transaction id는 백엔드 URL과 업무 이벤트를 연결하는 중요한 단서다.";
    }

    public String aiClue7() {
        return "user_charge:7 - SVN revision 또는 Git commit은 기능 변경 시점 추정에 사용한다.";
    }

    public String aiClue8() {
        return "user_charge:8 - 동기화 배치가 제외한 기관은 현재값과 snapshot 값이 오래 다를 수 있다.";
    }

    public String aiClue9() {
        return "user_charge:9 - 감사 이력의 이름은 당시 작업자명을 보존하는 것이 정상 설계일 수 있다.";
    }

    public String aiClue10() {
        return "user_charge:10 - 불일치가 모두 오류는 아니므로 설계 의도, 누락, 배치 실패를 분리해야 한다.";
    }

}
