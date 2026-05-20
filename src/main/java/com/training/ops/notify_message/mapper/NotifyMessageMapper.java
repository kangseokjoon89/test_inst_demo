package com.training.ops.notify_message.mapper;

import com.training.ops.notify_message.domain.NotifyMessageRecord;
import java.util.List;
import java.util.Map;

/**
 * 알림 발송 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface NotifyMessageMapper {

    List<NotifyMessageRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<NotifyMessageRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(NotifyMessageRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(NotifyMessageRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(NotifyMessageRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(NotifyMessageRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(NotifyMessageRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(NotifyMessageRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(NotifyMessageRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<NotifyMessageRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(NotifyMessageRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBNOTIFY.RECEIVERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NotifyMessageRecord> selectTracePoint23(Map<String, Object> params);

}
