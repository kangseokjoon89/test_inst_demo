package com.training.ops.submit_status.mapper;

import com.training.ops.submit_status.domain.SubmitStatusRecord;
import java.util.List;
import java.util.Map;

/**
 * 제출 상태 전이 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface SubmitStatusMapper {

    List<SubmitStatusRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<SubmitStatusRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(SubmitStatusRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(SubmitStatusRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(SubmitStatusRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(SubmitStatusRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(SubmitStatusRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(SubmitStatusRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(SubmitStatusRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<SubmitStatusRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(SubmitStatusRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBSUBMITSTAT.STATUSNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<SubmitStatusRecord> selectTracePoint23(Map<String, Object> params);

}
