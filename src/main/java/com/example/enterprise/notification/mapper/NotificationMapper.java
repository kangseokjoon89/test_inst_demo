package com.example.enterprise.notification.mapper;

import com.example.enterprise.notification.domain.NotificationRecord;
import java.util.List;
import java.util.Map;

/**
 * 알림 발송 Mapper 인터페이스.
 * SQL XML과 1:1로 연결되는 메서드를 명시해서
 * AI가 Java 호출과 SQL 문장을 추적할 수 있도록 한다.
 */
public interface NotificationMapper {
    NotificationRecord findById(String id);
    NotificationRecord findLatestSubmittedByInstCd(String instCd);
    List<NotificationRecord> findSubmittedByInstCds(List<String> instCds);
    void updateNameOnly(NotificationRecord record);
    void updateSnapshot(NotificationRecord record);
    void updateStatus(NotificationRecord record);
    void insertAudit(String action, Map<String, Object> auditMap);

    /** 업무 조건 1: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition1(Map<String, Object> params);
    int countByCondition1(Map<String, Object> params);
    void updateCondition1(NotificationRecord record);

    /** 업무 조건 2: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition2(Map<String, Object> params);
    int countByCondition2(Map<String, Object> params);
    void updateCondition2(NotificationRecord record);

    /** 업무 조건 3: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition3(Map<String, Object> params);
    int countByCondition3(Map<String, Object> params);
    void updateCondition3(NotificationRecord record);

    /** 업무 조건 4: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition4(Map<String, Object> params);
    int countByCondition4(Map<String, Object> params);
    void updateCondition4(NotificationRecord record);

    /** 업무 조건 5: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition5(Map<String, Object> params);
    int countByCondition5(Map<String, Object> params);
    void updateCondition5(NotificationRecord record);

    /** 업무 조건 6: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition6(Map<String, Object> params);
    int countByCondition6(Map<String, Object> params);
    void updateCondition6(NotificationRecord record);

    /** 업무 조건 7: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition7(Map<String, Object> params);
    int countByCondition7(Map<String, Object> params);
    void updateCondition7(NotificationRecord record);

    /** 업무 조건 8: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition8(Map<String, Object> params);
    int countByCondition8(Map<String, Object> params);
    void updateCondition8(NotificationRecord record);

    /** 업무 조건 9: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition9(Map<String, Object> params);
    int countByCondition9(Map<String, Object> params);
    void updateCondition9(NotificationRecord record);

    /** 업무 조건 10: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition10(Map<String, Object> params);
    int countByCondition10(Map<String, Object> params);
    void updateCondition10(NotificationRecord record);

    /** 업무 조건 11: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition11(Map<String, Object> params);
    int countByCondition11(Map<String, Object> params);
    void updateCondition11(NotificationRecord record);

    /** 업무 조건 12: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition12(Map<String, Object> params);
    int countByCondition12(Map<String, Object> params);
    void updateCondition12(NotificationRecord record);

    /** 업무 조건 13: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition13(Map<String, Object> params);
    int countByCondition13(Map<String, Object> params);
    void updateCondition13(NotificationRecord record);

    /** 업무 조건 14: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition14(Map<String, Object> params);
    int countByCondition14(Map<String, Object> params);
    void updateCondition14(NotificationRecord record);

    /** 업무 조건 15: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition15(Map<String, Object> params);
    int countByCondition15(Map<String, Object> params);
    void updateCondition15(NotificationRecord record);

    /** 업무 조건 16: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition16(Map<String, Object> params);
    int countByCondition16(Map<String, Object> params);
    void updateCondition16(NotificationRecord record);

    /** 업무 조건 17: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition17(Map<String, Object> params);
    int countByCondition17(Map<String, Object> params);
    void updateCondition17(NotificationRecord record);

    /** 업무 조건 18: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition18(Map<String, Object> params);
    int countByCondition18(Map<String, Object> params);
    void updateCondition18(NotificationRecord record);

    /** 업무 조건 19: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition19(Map<String, Object> params);
    int countByCondition19(Map<String, Object> params);
    void updateCondition19(NotificationRecord record);

    /** 업무 조건 20: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition20(Map<String, Object> params);
    int countByCondition20(Map<String, Object> params);
    void updateCondition20(NotificationRecord record);

    /** 업무 조건 21: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition21(Map<String, Object> params);
    int countByCondition21(Map<String, Object> params);
    void updateCondition21(NotificationRecord record);

    /** 업무 조건 22: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition22(Map<String, Object> params);
    int countByCondition22(Map<String, Object> params);
    void updateCondition22(NotificationRecord record);

    /** 업무 조건 23: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition23(Map<String, Object> params);
    int countByCondition23(Map<String, Object> params);
    void updateCondition23(NotificationRecord record);

    /** 업무 조건 24: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition24(Map<String, Object> params);
    int countByCondition24(Map<String, Object> params);
    void updateCondition24(NotificationRecord record);

    /** 업무 조건 25: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition25(Map<String, Object> params);
    int countByCondition25(Map<String, Object> params);
    void updateCondition25(NotificationRecord record);

    /** 업무 조건 26: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition26(Map<String, Object> params);
    int countByCondition26(Map<String, Object> params);
    void updateCondition26(NotificationRecord record);

    /** 업무 조건 27: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition27(Map<String, Object> params);
    int countByCondition27(Map<String, Object> params);
    void updateCondition27(NotificationRecord record);

    /** 업무 조건 28: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition28(Map<String, Object> params);
    int countByCondition28(Map<String, Object> params);
    void updateCondition28(NotificationRecord record);

    /** 업무 조건 29: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition29(Map<String, Object> params);
    int countByCondition29(Map<String, Object> params);
    void updateCondition29(NotificationRecord record);

    /** 업무 조건 30: TBNOTIFY.RECEIVERNM 컬럼을 사용하는 조회/갱신 패턴 */
    List<NotificationRecord> findByCondition30(Map<String, Object> params);
    int countByCondition30(Map<String, Object> params);
    void updateCondition30(NotificationRecord record);
}
