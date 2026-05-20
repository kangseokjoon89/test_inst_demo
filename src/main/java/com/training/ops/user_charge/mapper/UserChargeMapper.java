package com.training.ops.user_charge.mapper;

import com.training.ops.user_charge.domain.UserChargeRecord;
import java.util.List;
import java.util.Map;

/**
 * 담당자 기준정보 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface UserChargeMapper {

    List<UserChargeRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<UserChargeRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(UserChargeRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(UserChargeRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(UserChargeRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(UserChargeRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(UserChargeRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(UserChargeRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(UserChargeRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<UserChargeRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(UserChargeRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBUSER.USERNM 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<UserChargeRecord> selectTracePoint23(Map<String, Object> params);

}
