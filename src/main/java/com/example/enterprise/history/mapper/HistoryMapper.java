package com.example.enterprise.history.mapper;

import com.example.enterprise.history.domain.HistoryRecord;
import java.util.List;
import java.util.Map;

/**
 * 변경 이력 관리 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface HistoryMapper {
    HistoryRecord findById(String id);
    HistoryRecord findLatestSubmittedByInstCd(String instCd);
    List<HistoryRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(HistoryRecord record);
    void updateSnapshot(HistoryRecord record);
    void updateStatus(HistoryRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(HistoryRecord record);

    /** 업무 조건 2: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(HistoryRecord record);

    /** 업무 조건 3: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(HistoryRecord record);

    /** 업무 조건 4: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(HistoryRecord record);

    /** 업무 조건 5: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(HistoryRecord record);

    /** 업무 조건 6: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(HistoryRecord record);

    /** 업무 조건 7: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(HistoryRecord record);

    /** 업무 조건 8: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(HistoryRecord record);

    /** 업무 조건 9: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(HistoryRecord record);

    /** 업무 조건 10: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(HistoryRecord record);

    /** 업무 조건 11: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(HistoryRecord record);

    /** 업무 조건 12: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(HistoryRecord record);

    /** 업무 조건 13: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(HistoryRecord record);

    /** 업무 조건 14: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(HistoryRecord record);

    /** 업무 조건 15: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(HistoryRecord record);

    /** 업무 조건 16: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(HistoryRecord record);

    /** 업무 조건 17: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(HistoryRecord record);

    /** 업무 조건 18: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(HistoryRecord record);

    /** 업무 조건 19: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(HistoryRecord record);

    /** 업무 조건 20: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(HistoryRecord record);

    /** 업무 조건 21: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(HistoryRecord record);

    /** 업무 조건 22: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(HistoryRecord record);

    /** 업무 조건 23: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(HistoryRecord record);

    /** 업무 조건 24: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(HistoryRecord record);

    /** 업무 조건 25: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(HistoryRecord record);

    /** 업무 조건 26: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(HistoryRecord record);

    /** 업무 조건 27: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(HistoryRecord record);

    /** 업무 조건 28: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(HistoryRecord record);

    /** 업무 조건 29: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(HistoryRecord record);

    /** 업무 조건 30: TBHISTORY.CHANGEDESC 컬럼을 사용하는 조회/갱신 패턴 */
    List<HistoryRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(HistoryRecord record);
}
