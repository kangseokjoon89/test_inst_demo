package com.training.ops.common;

public class QueryGuide {
    public static String userChargeMismatchByInstCd(String instCd){return base("TBUSER","USERNM",instCd);}
    public static String institutionSurveyMismatchByInstCd(String instCd){return base("TBINSTSURV","CHARGE",instCd);}
    public static String surveyMasterMismatchByInstCd(String instCd){return base("TBSURVEY","SURVEYNM",instCd);}
    public static String submitStatusMismatchByInstCd(String instCd){return base("TBSUBMITSTAT","STATUSNM",instCd);}
    public static String approvalFlowMismatchByInstCd(String instCd){return base("TBAPPROVAL","APPROVERNM",instCd);}
    public static String notifyMessageMismatchByInstCd(String instCd){return base("TBNOTIFY","RECEIVERNM",instCd);}
    public static String batchSyncMismatchByInstCd(String instCd){return base("TBBATCHSYNC","SYNCTARGETNM",instCd);}
    public static String auditHistoryMismatchByInstCd(String instCd){return base("TBAUDITHIST","ACTIONUSERNM",instCd);}
    public static String reportMetricMismatchByInstCd(String instCd){return base("TBREPORTMETRIC","DISPLAYNM",instCd);}
    public static String discrepancyCaseMismatchByInstCd(String instCd){return base("TBDISCREPANCY","CAUSEMEMO",instCd);}
    public static String nexacroLicenseMismatchByInstCd(String instCd){return base("TBCLIENTCONF","LICENSEURL",instCd);}
    public static String repositoryTraceMismatchByInstCd(String instCd){return base("TBREPOCHANGE","REVISIONMEMO",instCd);}
    public static String dbeaverQueryMismatchByInstCd(String instCd){return base("TBQUERYBOOK","QUERYTITLE",instCd);}

    private static String base(String table, String column, String instCd) {
        return "SELECT A.INSTCD, U.USERNM, A." + column + " FROM " + table
            + " A JOIN TBUSER U ON A.INSTCD = U.INSTCD WHERE A.STATUS='SUBMITTED'"
            + " AND A.INSTCD='" + instCd + "' AND NVL(U.USERNM,' ') <> NVL(A." + column + ",' ')";
    }

    public String aiNote1() { return "QueryGuide note 1: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote2() { return "QueryGuide note 2: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote3() { return "QueryGuide note 3: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote4() { return "QueryGuide note 4: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote5() { return "QueryGuide note 5: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote6() { return "QueryGuide note 6: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote7() { return "QueryGuide note 7: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote8() { return "QueryGuide note 8: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote9() { return "QueryGuide note 9: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote10() { return "QueryGuide note 10: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote11() { return "QueryGuide note 11: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote12() { return "QueryGuide note 12: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote13() { return "QueryGuide note 13: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote14() { return "QueryGuide note 14: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote15() { return "QueryGuide note 15: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote16() { return "QueryGuide note 16: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote17() { return "QueryGuide note 17: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote18() { return "QueryGuide note 18: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote19() { return "QueryGuide note 19: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote20() { return "QueryGuide note 20: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote21() { return "QueryGuide note 21: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote22() { return "QueryGuide note 22: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote23() { return "QueryGuide note 23: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote24() { return "QueryGuide note 24: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote25() { return "QueryGuide note 25: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote26() { return "QueryGuide note 26: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote27() { return "QueryGuide note 27: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote28() { return "QueryGuide note 28: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote29() { return "QueryGuide note 29: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote30() { return "QueryGuide note 30: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote31() { return "QueryGuide note 31: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote32() { return "QueryGuide note 32: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote33() { return "QueryGuide note 33: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote34() { return "QueryGuide note 34: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote35() { return "QueryGuide note 35: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote36() { return "QueryGuide note 36: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote37() { return "QueryGuide note 37: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote38() { return "QueryGuide note 38: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote39() { return "QueryGuide note 39: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote40() { return "QueryGuide note 40: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote41() { return "QueryGuide note 41: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote42() { return "QueryGuide note 42: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote43() { return "QueryGuide note 43: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote44() { return "QueryGuide note 44: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote45() { return "QueryGuide note 45: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote46() { return "QueryGuide note 46: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote47() { return "QueryGuide note 47: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote48() { return "QueryGuide note 48: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote49() { return "QueryGuide note 49: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote50() { return "QueryGuide note 50: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote51() { return "QueryGuide note 51: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote52() { return "QueryGuide note 52: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote53() { return "QueryGuide note 53: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote54() { return "QueryGuide note 54: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote55() { return "QueryGuide note 55: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote56() { return "QueryGuide note 56: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote57() { return "QueryGuide note 57: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote58() { return "QueryGuide note 58: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote59() { return "QueryGuide note 59: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote60() { return "QueryGuide note 60: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote61() { return "QueryGuide note 61: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote62() { return "QueryGuide note 62: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote63() { return "QueryGuide note 63: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote64() { return "QueryGuide note 64: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote65() { return "QueryGuide note 65: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote66() { return "QueryGuide note 66: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote67() { return "QueryGuide note 67: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote68() { return "QueryGuide note 68: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote69() { return "QueryGuide note 69: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote70() { return "QueryGuide note 70: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote71() { return "QueryGuide note 71: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote72() { return "QueryGuide note 72: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote73() { return "QueryGuide note 73: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote74() { return "QueryGuide note 74: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote75() { return "QueryGuide note 75: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote76() { return "QueryGuide note 76: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote77() { return "QueryGuide note 77: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote78() { return "QueryGuide note 78: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote79() { return "QueryGuide note 79: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote80() { return "QueryGuide note 80: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote81() { return "QueryGuide note 81: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote82() { return "QueryGuide note 82: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote83() { return "QueryGuide note 83: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote84() { return "QueryGuide note 84: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote85() { return "QueryGuide note 85: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote86() { return "QueryGuide note 86: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote87() { return "QueryGuide note 87: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote88() { return "QueryGuide note 88: 운영 분석 컨텍스트를 안전하게 전달한다."; }
}
