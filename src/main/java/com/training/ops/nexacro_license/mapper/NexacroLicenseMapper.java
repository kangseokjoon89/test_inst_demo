package com.training.ops.nexacro_license.mapper;

import com.training.ops.nexacro_license.domain.NexacroLicenseRecord;
import java.util.List;
import java.util.Map;

/**
 * Nexacro 라이선스 설정 Mapper.
 * Java Service와 MyBatis XML을 연결한다.
 * AI는 이 인터페이스 이름을 기준으로 SQL id를 추적할 수 있다.
 */
public interface NexacroLicenseMapper {

    List<NexacroLicenseRecord> selectSubmittedForInstitutions(Map<String, Object> params);

    void insertOperatorTrace(Map<String, Object> params);


    List<NexacroLicenseRecord> selectForSearch(Map<String, Object> params);

    int countForSearch(Map<String, Object> params);

    void updateForSearch(NexacroLicenseRecord record);

    void insertSearchTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForDetail(Map<String, Object> params);

    int countForDetail(Map<String, Object> params);

    void updateForDetail(NexacroLicenseRecord record);

    void insertDetailTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForSubmit(Map<String, Object> params);

    int countForSubmit(Map<String, Object> params);

    void updateForSubmit(NexacroLicenseRecord record);

    void insertSubmitTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForChange(Map<String, Object> params);

    int countForChange(Map<String, Object> params);

    void updateForChange(NexacroLicenseRecord record);

    void insertChangeTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForDiagnose(Map<String, Object> params);

    int countForDiagnose(Map<String, Object> params);

    void updateForDiagnose(NexacroLicenseRecord record);

    void insertDiagnoseTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForReconcile(Map<String, Object> params);

    int countForReconcile(Map<String, Object> params);

    void updateForReconcile(NexacroLicenseRecord record);

    void insertReconcileTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForHistory(Map<String, Object> params);

    int countForHistory(Map<String, Object> params);

    void updateForHistory(NexacroLicenseRecord record);

    void insertHistoryTrace(Map<String, Object> params);

    List<NexacroLicenseRecord> selectForExport(Map<String, Object> params);

    int countForExport(Map<String, Object> params);

    void updateForExport(NexacroLicenseRecord record);

    void insertExportTrace(Map<String, Object> params);



    /**
     * AI 추적용 쿼리 포인트 1.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint1(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 2.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint2(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 3.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint3(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 4.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint4(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 5.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint5(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 6.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint6(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 7.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint7(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 8.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint8(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 9.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint9(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 10.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint10(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 11.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint11(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 12.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint12(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 13.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint13(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 14.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint14(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 15.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint15(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 16.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint16(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 17.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint17(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 18.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint18(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 19.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint19(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 20.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint20(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 21.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint21(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 22.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint22(Map<String, Object> params);

    /**
     * AI 추적용 쿼리 포인트 23.
     * TBCLIENTCONF.LICENSEURL 컬럼과 화면 transaction 사이의 연결을 찾을 때 사용한다.
     */
    List<NexacroLicenseRecord> selectTracePoint23(Map<String, Object> params);

}
