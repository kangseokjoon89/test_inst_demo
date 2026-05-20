package com.training.ops.approval_flow.mapper;

import com.training.ops.approval_flow.domain.ApprovalFlowRecord;
import java.util.List;
import java.util.Map;

/**
 * 승인 결재 흐름 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface ApprovalFlowMapper {

    List<ApprovalFlowRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<ApprovalFlowRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(ApprovalFlowRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(ApprovalFlowRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(ApprovalFlowRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(ApprovalFlowRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(ApprovalFlowRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(ApprovalFlowRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(ApprovalFlowRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<ApprovalFlowRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(ApprovalFlowRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBAPPROVAL.APPROVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<ApprovalFlowRecord> selectTracePoint23(Map<String, Object> params);

}
