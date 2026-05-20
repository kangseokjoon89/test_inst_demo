package com.training.ops.dbeaver_query.mapper;

import com.training.ops.dbeaver_query.domain.DbeaverQueryRecord;
import java.util.List;
import java.util.Map;

/**
 * DBeaver 운영 SQL Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface DbeaverQueryMapper {

    List<DbeaverQueryRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<DbeaverQueryRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(DbeaverQueryRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(DbeaverQueryRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(DbeaverQueryRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(DbeaverQueryRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(DbeaverQueryRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(DbeaverQueryRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(DbeaverQueryRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<DbeaverQueryRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(DbeaverQueryRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBQUERYBOOK.QUERYTITLE 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DbeaverQueryRecord> selectTracePoint23(Map<String, Object> params);

}
