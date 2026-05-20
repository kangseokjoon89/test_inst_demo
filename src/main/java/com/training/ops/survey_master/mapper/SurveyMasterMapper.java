package com.training.ops.survey_master.mapper;

import com.training.ops.survey_master.domain.SurveyMasterRecord;
import java.util.List;
import java.util.Map;

/**
 * 조사 마스터 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface SurveyMasterMapper {

    List<SurveyMasterRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<SurveyMasterRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(SurveyMasterRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(SurveyMasterRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(SurveyMasterRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(SurveyMasterRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(SurveyMasterRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(SurveyMasterRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(SurveyMasterRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<SurveyMasterRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(SurveyMasterRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBSURVEY.SURVEYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SurveyMasterRecord> selectTracePoint23(Map<String, Object> params);

}
