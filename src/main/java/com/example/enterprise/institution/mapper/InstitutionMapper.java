package com.example.enterprise.institution.mapper;

import com.example.enterprise.institution.domain.InstitutionRecord;
import java.util.List;
import java.util.Map;

/**
 * 기관 정보 관리 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface InstitutionMapper {
    InstitutionRecord findById(String id);
    InstitutionRecord findLatestSubmittedByInstCd(String instCd);
    List<InstitutionRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(InstitutionRecord record);
    void updateSnapshot(InstitutionRecord record);
    void updateStatus(InstitutionRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(InstitutionRecord record);

    /** 업무 조건 2: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(InstitutionRecord record);

    /** 업무 조건 3: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(InstitutionRecord record);

    /** 업무 조건 4: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(InstitutionRecord record);

    /** 업무 조건 5: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(InstitutionRecord record);

    /** 업무 조건 6: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(InstitutionRecord record);

    /** 업무 조건 7: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(InstitutionRecord record);

    /** 업무 조건 8: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(InstitutionRecord record);

    /** 업무 조건 9: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(InstitutionRecord record);

    /** 업무 조건 10: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(InstitutionRecord record);

    /** 업무 조건 11: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(InstitutionRecord record);

    /** 업무 조건 12: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(InstitutionRecord record);

    /** 업무 조건 13: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(InstitutionRecord record);

    /** 업무 조건 14: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(InstitutionRecord record);

    /** 업무 조건 15: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(InstitutionRecord record);

    /** 업무 조건 16: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(InstitutionRecord record);

    /** 업무 조건 17: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(InstitutionRecord record);

    /** 업무 조건 18: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(InstitutionRecord record);

    /** 업무 조건 19: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(InstitutionRecord record);

    /** 업무 조건 20: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(InstitutionRecord record);

    /** 업무 조건 21: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(InstitutionRecord record);

    /** 업무 조건 22: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(InstitutionRecord record);

    /** 업무 조건 23: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(InstitutionRecord record);

    /** 업무 조건 24: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(InstitutionRecord record);

    /** 업무 조건 25: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(InstitutionRecord record);

    /** 업무 조건 26: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(InstitutionRecord record);

    /** 업무 조건 27: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(InstitutionRecord record);

    /** 업무 조건 28: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(InstitutionRecord record);

    /** 업무 조건 29: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(InstitutionRecord record);

    /** 업무 조건 30: TBINST.INSTNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<InstitutionRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(InstitutionRecord record);
}
