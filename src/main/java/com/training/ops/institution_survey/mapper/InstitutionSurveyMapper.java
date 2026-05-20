package com.training.ops.institution_survey.mapper;

import com.training.ops.institution_survey.domain.InstitutionSurveyRecord;
import java.util.List;
import java.util.Map;

/**
 * 기관별 조사 제출 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface InstitutionSurveyMapper {

    List<InstitutionSurveyRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<InstitutionSurveyRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(InstitutionSurveyRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(InstitutionSurveyRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(InstitutionSurveyRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(InstitutionSurveyRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(InstitutionSurveyRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(InstitutionSurveyRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(InstitutionSurveyRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<InstitutionSurveyRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(InstitutionSurveyRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBINSTSURV.CHARGE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<InstitutionSurveyRecord> selectTracePoint23(Map<String, Object> params);

}
