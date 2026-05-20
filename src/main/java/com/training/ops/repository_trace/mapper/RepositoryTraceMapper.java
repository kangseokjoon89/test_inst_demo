package com.training.ops.repository_trace.mapper;

import com.training.ops.repository_trace.domain.RepositoryTraceRecord;
import java.util.List;
import java.util.Map;

/**
 * SVN Git 변경 추적 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface RepositoryTraceMapper {

    List<RepositoryTraceRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<RepositoryTraceRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(RepositoryTraceRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(RepositoryTraceRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(RepositoryTraceRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(RepositoryTraceRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(RepositoryTraceRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(RepositoryTraceRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(RepositoryTraceRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<RepositoryTraceRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(RepositoryTraceRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBREPOCHANGE.REVISIONMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<RepositoryTraceRecord> selectTracePoint23(Map<String, Object> params);

}
