package com.training.ops.batch_sync.mapper;

import com.training.ops.batch_sync.domain.BatchSyncRecord;
import java.util.List;
import java.util.Map;

/**
 * 배치 동기화 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface BatchSyncMapper {

    List<BatchSyncRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<BatchSyncRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(BatchSyncRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(BatchSyncRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(BatchSyncRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(BatchSyncRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(BatchSyncRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(BatchSyncRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(BatchSyncRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<BatchSyncRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(BatchSyncRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBBATCHSYNC.SYNCTARGETNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<BatchSyncRecord> selectTracePoint23(Map<String, Object> params);

}
