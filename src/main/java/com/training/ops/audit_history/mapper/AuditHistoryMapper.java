package com.training.ops.audit_history.mapper;

import com.training.ops.audit_history.domain.AuditHistoryRecord;
import java.util.List;
import java.util.Map;

/**
 * 감사 이력 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface AuditHistoryMapper {

    List<AuditHistoryRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<AuditHistoryRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(AuditHistoryRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(AuditHistoryRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(AuditHistoryRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(AuditHistoryRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(AuditHistoryRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(AuditHistoryRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(AuditHistoryRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<AuditHistoryRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(AuditHistoryRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBAUDITHIST.ACTIONUSERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<AuditHistoryRecord> selectTracePoint23(Map<String, Object> params);

}
