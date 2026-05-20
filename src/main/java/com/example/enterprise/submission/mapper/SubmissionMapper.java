package com.example.enterprise.submission.mapper;

import com.example.enterprise.submission.domain.SubmissionRecord;
import java.util.List;
import java.util.Map;

/**
 * 조사 제출 관리 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface SubmissionMapper {
    SubmissionRecord findById(String id);
    SubmissionRecord findLatestSubmittedByInstCd(String instCd);
    List<SubmissionRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(SubmissionRecord record);
    void updateSnapshot(SubmissionRecord record);
    void updateStatus(SubmissionRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(SubmissionRecord record);

    /** 업무 조건 2: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(SubmissionRecord record);

    /** 업무 조건 3: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(SubmissionRecord record);

    /** 업무 조건 4: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(SubmissionRecord record);

    /** 업무 조건 5: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(SubmissionRecord record);

    /** 업무 조건 6: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(SubmissionRecord record);

    /** 업무 조건 7: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(SubmissionRecord record);

    /** 업무 조건 8: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(SubmissionRecord record);

    /** 업무 조건 9: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(SubmissionRecord record);

    /** 업무 조건 10: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(SubmissionRecord record);

    /** 업무 조건 11: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(SubmissionRecord record);

    /** 업무 조건 12: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(SubmissionRecord record);

    /** 업무 조건 13: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(SubmissionRecord record);

    /** 업무 조건 14: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(SubmissionRecord record);

    /** 업무 조건 15: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(SubmissionRecord record);

    /** 업무 조건 16: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(SubmissionRecord record);

    /** 업무 조건 17: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(SubmissionRecord record);

    /** 업무 조건 18: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(SubmissionRecord record);

    /** 업무 조건 19: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(SubmissionRecord record);

    /** 업무 조건 20: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(SubmissionRecord record);

    /** 업무 조건 21: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(SubmissionRecord record);

    /** 업무 조건 22: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(SubmissionRecord record);

    /** 업무 조건 23: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(SubmissionRecord record);

    /** 업무 조건 24: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(SubmissionRecord record);

    /** 업무 조건 25: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(SubmissionRecord record);

    /** 업무 조건 26: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(SubmissionRecord record);

    /** 업무 조건 27: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(SubmissionRecord record);

    /** 업무 조건 28: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(SubmissionRecord record);

    /** 업무 조건 29: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(SubmissionRecord record);

    /** 업무 조건 30: TBINSTSURV.CHARGE 컬럼을 사용하는 조회/갱신 패턴 */
    List<SubmissionRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(SubmissionRecord record);
}
