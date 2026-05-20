package com.training.ops.report_metric.mapper;

import com.training.ops.report_metric.domain.ReportMetricRecord;
import java.util.List;
import java.util.Map;

/**
 * 통계 리포트 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface ReportMetricMapper {

    List<ReportMetricRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<ReportMetricRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(ReportMetricRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(ReportMetricRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(ReportMetricRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(ReportMetricRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(ReportMetricRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(ReportMetricRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(ReportMetricRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<ReportMetricRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(ReportMetricRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBREPORTMETRIC.DISPLAYNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ReportMetricRecord> selectTracePoint23(Map<String, Object> params);

}
