package com.training.ops.discrepancy_case.mapper;

import com.training.ops.discrepancy_case.domain.DiscrepancyCaseRecord;
import java.util.List;
import java.util.Map;

/**
 * 불일치 케이스 분석 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface DiscrepancyCaseMapper {

    List<DiscrepancyCaseRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<DiscrepancyCaseRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(DiscrepancyCaseRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(DiscrepancyCaseRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(DiscrepancyCaseRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(DiscrepancyCaseRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(DiscrepancyCaseRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(DiscrepancyCaseRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(DiscrepancyCaseRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<DiscrepancyCaseRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(DiscrepancyCaseRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBDISCREPANCY.CAUSEMEMO 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<DiscrepancyCaseRecord> selectTracePoint23(Map<String, Object> params);

}
