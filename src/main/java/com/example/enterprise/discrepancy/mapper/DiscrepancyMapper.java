package com.example.enterprise.discrepancy.mapper;

import com.example.enterprise.discrepancy.domain.DiscrepancyRecord;
import java.util.List;
import java.util.Map;

/**
 * 데이터 불일치 분석 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface DiscrepancyMapper {
    DiscrepancyRecord findById(String id);
    DiscrepancyRecord findLatestSubmittedByInstCd(String instCd);
    List<DiscrepancyRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(DiscrepancyRecord record);
    void updateSnapshot(DiscrepancyRecord record);
    void updateStatus(DiscrepancyRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(DiscrepancyRecord record);

    /** 업무 조건 2: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(DiscrepancyRecord record);

    /** 업무 조건 3: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(DiscrepancyRecord record);

    /** 업무 조건 4: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(DiscrepancyRecord record);

    /** 업무 조건 5: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(DiscrepancyRecord record);

    /** 업무 조건 6: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(DiscrepancyRecord record);

    /** 업무 조건 7: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(DiscrepancyRecord record);

    /** 업무 조건 8: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(DiscrepancyRecord record);

    /** 업무 조건 9: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(DiscrepancyRecord record);

    /** 업무 조건 10: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(DiscrepancyRecord record);

    /** 업무 조건 11: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(DiscrepancyRecord record);

    /** 업무 조건 12: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(DiscrepancyRecord record);

    /** 업무 조건 13: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(DiscrepancyRecord record);

    /** 업무 조건 14: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(DiscrepancyRecord record);

    /** 업무 조건 15: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(DiscrepancyRecord record);

    /** 업무 조건 16: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(DiscrepancyRecord record);

    /** 업무 조건 17: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(DiscrepancyRecord record);

    /** 업무 조건 18: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(DiscrepancyRecord record);

    /** 업무 조건 19: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(DiscrepancyRecord record);

    /** 업무 조건 20: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(DiscrepancyRecord record);

    /** 업무 조건 21: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(DiscrepancyRecord record);

    /** 업무 조건 22: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(DiscrepancyRecord record);

    /** 업무 조건 23: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(DiscrepancyRecord record);

    /** 업무 조건 24: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(DiscrepancyRecord record);

    /** 업무 조건 25: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(DiscrepancyRecord record);

    /** 업무 조건 26: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(DiscrepancyRecord record);

    /** 업무 조건 27: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(DiscrepancyRecord record);

    /** 업무 조건 28: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(DiscrepancyRecord record);

    /** 업무 조건 29: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(DiscrepancyRecord record);

    /** 업무 조건 30: TBDISCREPANCY.REASON 컬럼을 사용하는 조회/갱신 패턴 */
    List<DiscrepancyRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(DiscrepancyRecord record);
}
