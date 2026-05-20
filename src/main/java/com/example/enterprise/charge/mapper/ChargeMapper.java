package com.example.enterprise.charge.mapper;

import com.example.enterprise.charge.domain.ChargeRecord;
import java.util.List;
import java.util.Map;

/**
 * 담당자 이력/동기화 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface ChargeMapper {
    ChargeRecord findById(String id);
    ChargeRecord findLatestSubmittedByInstCd(String instCd);
    List<ChargeRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(ChargeRecord record);
    void updateSnapshot(ChargeRecord record);
    void updateStatus(ChargeRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(ChargeRecord record);

    /** 업무 조건 2: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(ChargeRecord record);

    /** 업무 조건 3: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(ChargeRecord record);

    /** 업무 조건 4: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(ChargeRecord record);

    /** 업무 조건 5: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(ChargeRecord record);

    /** 업무 조건 6: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(ChargeRecord record);

    /** 업무 조건 7: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(ChargeRecord record);

    /** 업무 조건 8: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(ChargeRecord record);

    /** 업무 조건 9: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(ChargeRecord record);

    /** 업무 조건 10: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(ChargeRecord record);

    /** 업무 조건 11: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(ChargeRecord record);

    /** 업무 조건 12: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(ChargeRecord record);

    /** 업무 조건 13: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(ChargeRecord record);

    /** 업무 조건 14: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(ChargeRecord record);

    /** 업무 조건 15: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(ChargeRecord record);

    /** 업무 조건 16: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(ChargeRecord record);

    /** 업무 조건 17: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(ChargeRecord record);

    /** 업무 조건 18: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(ChargeRecord record);

    /** 업무 조건 19: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(ChargeRecord record);

    /** 업무 조건 20: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(ChargeRecord record);

    /** 업무 조건 21: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(ChargeRecord record);

    /** 업무 조건 22: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(ChargeRecord record);

    /** 업무 조건 23: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(ChargeRecord record);

    /** 업무 조건 24: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(ChargeRecord record);

    /** 업무 조건 25: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(ChargeRecord record);

    /** 업무 조건 26: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(ChargeRecord record);

    /** 업무 조건 27: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(ChargeRecord record);

    /** 업무 조건 28: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(ChargeRecord record);

    /** 업무 조건 29: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(ChargeRecord record);

    /** 업무 조건 30: TBCHARGEHIST.CHARGENM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ChargeRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(ChargeRecord record);
}
