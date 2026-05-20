package com.example.enterprise.approval.mapper;

import com.example.enterprise.approval.domain.ApprovalRecord;
import java.util.List;
import java.util.Map;

/**
 * 승인/반려 관리 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface ApprovalMapper {
    ApprovalRecord findById(String id);
    ApprovalRecord findLatestSubmittedByInstCd(String instCd);
    List<ApprovalRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(ApprovalRecord record);
    void updateSnapshot(ApprovalRecord record);
    void updateStatus(ApprovalRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(ApprovalRecord record);

    /** 업무 조건 2: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(ApprovalRecord record);

    /** 업무 조건 3: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(ApprovalRecord record);

    /** 업무 조건 4: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(ApprovalRecord record);

    /** 업무 조건 5: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(ApprovalRecord record);

    /** 업무 조건 6: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(ApprovalRecord record);

    /** 업무 조건 7: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(ApprovalRecord record);

    /** 업무 조건 8: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(ApprovalRecord record);

    /** 업무 조건 9: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(ApprovalRecord record);

    /** 업무 조건 10: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(ApprovalRecord record);

    /** 업무 조건 11: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(ApprovalRecord record);

    /** 업무 조건 12: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(ApprovalRecord record);

    /** 업무 조건 13: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(ApprovalRecord record);

    /** 업무 조건 14: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(ApprovalRecord record);

    /** 업무 조건 15: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(ApprovalRecord record);

    /** 업무 조건 16: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(ApprovalRecord record);

    /** 업무 조건 17: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(ApprovalRecord record);

    /** 업무 조건 18: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(ApprovalRecord record);

    /** 업무 조건 19: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(ApprovalRecord record);

    /** 업무 조건 20: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(ApprovalRecord record);

    /** 업무 조건 21: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(ApprovalRecord record);

    /** 업무 조건 22: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(ApprovalRecord record);

    /** 업무 조건 23: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(ApprovalRecord record);

    /** 업무 조건 24: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(ApprovalRecord record);

    /** 업무 조건 25: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(ApprovalRecord record);

    /** 업무 조건 26: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(ApprovalRecord record);

    /** 업무 조건 27: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(ApprovalRecord record);

    /** 업무 조건 28: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(ApprovalRecord record);

    /** 업무 조건 29: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(ApprovalRecord record);

    /** 업무 조건 30: TBAPPROVAL.APPROVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ApprovalRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(ApprovalRecord record);
}
