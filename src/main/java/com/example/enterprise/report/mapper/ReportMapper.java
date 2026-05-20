package com.example.enterprise.report.mapper;

import com.example.enterprise.report.domain.ReportRecord;
import java.util.List;
import java.util.Map;

/**
 * 통계 리포트 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface ReportMapper {
    ReportRecord findById(String id);
    ReportRecord findLatestSubmittedByInstCd(String instCd);
    List<ReportRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(ReportRecord record);
    void updateSnapshot(ReportRecord record);
    void updateStatus(ReportRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(ReportRecord record);

    /** 업무 조건 2: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(ReportRecord record);

    /** 업무 조건 3: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(ReportRecord record);

    /** 업무 조건 4: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(ReportRecord record);

    /** 업무 조건 5: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(ReportRecord record);

    /** 업무 조건 6: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(ReportRecord record);

    /** 업무 조건 7: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(ReportRecord record);

    /** 업무 조건 8: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(ReportRecord record);

    /** 업무 조건 9: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(ReportRecord record);

    /** 업무 조건 10: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(ReportRecord record);

    /** 업무 조건 11: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(ReportRecord record);

    /** 업무 조건 12: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(ReportRecord record);

    /** 업무 조건 13: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(ReportRecord record);

    /** 업무 조건 14: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(ReportRecord record);

    /** 업무 조건 15: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(ReportRecord record);

    /** 업무 조건 16: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(ReportRecord record);

    /** 업무 조건 17: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(ReportRecord record);

    /** 업무 조건 18: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(ReportRecord record);

    /** 업무 조건 19: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(ReportRecord record);

    /** 업무 조건 20: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(ReportRecord record);

    /** 업무 조건 21: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(ReportRecord record);

    /** 업무 조건 22: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(ReportRecord record);

    /** 업무 조건 23: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(ReportRecord record);

    /** 업무 조건 24: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(ReportRecord record);

    /** 업무 조건 25: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(ReportRecord record);

    /** 업무 조건 26: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(ReportRecord record);

    /** 업무 조건 27: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(ReportRecord record);

    /** 업무 조건 28: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(ReportRecord record);

    /** 업무 조건 29: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(ReportRecord record);

    /** 업무 조건 30: TBREPORT.REPORTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<ReportRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(ReportRecord record);
}
