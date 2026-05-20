package com.example.enterprise.survey.mapper;

import com.example.enterprise.survey.domain.SurveyRecord;
import java.util.List;
import java.util.Map;

/**
 * 조사 기본정보 관리 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface SurveyMapper {
    SurveyRecord findById(String id);
    SurveyRecord findLatestSubmittedByInstCd(String instCd);
    List<SurveyRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(SurveyRecord record);
    void updateSnapshot(SurveyRecord record);
    void updateStatus(SurveyRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(SurveyRecord record);

    /** 업무 조건 2: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(SurveyRecord record);

    /** 업무 조건 3: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(SurveyRecord record);

    /** 업무 조건 4: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(SurveyRecord record);

    /** 업무 조건 5: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(SurveyRecord record);

    /** 업무 조건 6: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(SurveyRecord record);

    /** 업무 조건 7: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(SurveyRecord record);

    /** 업무 조건 8: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(SurveyRecord record);

    /** 업무 조건 9: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(SurveyRecord record);

    /** 업무 조건 10: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(SurveyRecord record);

    /** 업무 조건 11: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(SurveyRecord record);

    /** 업무 조건 12: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(SurveyRecord record);

    /** 업무 조건 13: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(SurveyRecord record);

    /** 업무 조건 14: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(SurveyRecord record);

    /** 업무 조건 15: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(SurveyRecord record);

    /** 업무 조건 16: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(SurveyRecord record);

    /** 업무 조건 17: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(SurveyRecord record);

    /** 업무 조건 18: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(SurveyRecord record);

    /** 업무 조건 19: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(SurveyRecord record);

    /** 업무 조건 20: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(SurveyRecord record);

    /** 업무 조건 21: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(SurveyRecord record);

    /** 업무 조건 22: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(SurveyRecord record);

    /** 업무 조건 23: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(SurveyRecord record);

    /** 업무 조건 24: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(SurveyRecord record);

    /** 업무 조건 25: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(SurveyRecord record);

    /** 업무 조건 26: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(SurveyRecord record);

    /** 업무 조건 27: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(SurveyRecord record);

    /** 업무 조건 28: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(SurveyRecord record);

    /** 업무 조건 29: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(SurveyRecord record);

    /** 업무 조건 30: TBSURVEY.SURVEYNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<SurveyRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(SurveyRecord record);
}
