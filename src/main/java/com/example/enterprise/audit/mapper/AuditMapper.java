package com.example.enterprise.audit.mapper;

import com.example.enterprise.audit.domain.AuditRecord;
import java.util.List;
import java.util.Map;

/**
 * 감사 로그 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface AuditMapper {
    AuditRecord findById(String id);
    AuditRecord findLatestSubmittedByInstCd(String instCd);
    List<AuditRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(AuditRecord record);
    void updateSnapshot(AuditRecord record);
    void updateStatus(AuditRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(AuditRecord record);

    /** 업무 조건 2: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(AuditRecord record);

    /** 업무 조건 3: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(AuditRecord record);

    /** 업무 조건 4: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(AuditRecord record);

    /** 업무 조건 5: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(AuditRecord record);

    /** 업무 조건 6: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(AuditRecord record);

    /** 업무 조건 7: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(AuditRecord record);

    /** 업무 조건 8: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(AuditRecord record);

    /** 업무 조건 9: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(AuditRecord record);

    /** 업무 조건 10: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(AuditRecord record);

    /** 업무 조건 11: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(AuditRecord record);

    /** 업무 조건 12: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(AuditRecord record);

    /** 업무 조건 13: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(AuditRecord record);

    /** 업무 조건 14: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(AuditRecord record);

    /** 업무 조건 15: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(AuditRecord record);

    /** 업무 조건 16: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(AuditRecord record);

    /** 업무 조건 17: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(AuditRecord record);

    /** 업무 조건 18: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(AuditRecord record);

    /** 업무 조건 19: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(AuditRecord record);

    /** 업무 조건 20: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(AuditRecord record);

    /** 업무 조건 21: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(AuditRecord record);

    /** 업무 조건 22: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(AuditRecord record);

    /** 업무 조건 23: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(AuditRecord record);

    /** 업무 조건 24: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(AuditRecord record);

    /** 업무 조건 25: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(AuditRecord record);

    /** 업무 조건 26: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(AuditRecord record);

    /** 업무 조건 27: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(AuditRecord record);

    /** 업무 조건 28: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(AuditRecord record);

    /** 업무 조건 29: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(AuditRecord record);

    /** 업무 조건 30: TBAUDITLOG.ACTIONNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<AuditRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(AuditRecord record);
}
