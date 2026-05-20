package com.training.ops.common;

public class RequestGuard {
    public static void requireInstCdWhenPresent(RequestMap request, String label) {
        String instCds = request.getString("instCds", request.getString("INST_CDS", ""));
        if (instCds.contains(" ")) {
            throw BusinessException.invalid(label + ".instCds", instCds);
        }
    }

    public static void requireBaseDate(RequestMap request) {
        String baseDate = request.getString("baseDate", request.getString("BASE_DATE", ""));
        if (baseDate == null || baseDate.isBlank()) {
            throw BusinessException.missing("baseDate");
        }
    }

    public static void requireActor(RequestMap request) {
        String actor = request.getString("actorId", "");
        if (actor == null || actor.isBlank()) {
            throw BusinessException.missing("actorId");
        }
    }

    public String aiNote1() { return "RequestGuard note 1: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote2() { return "RequestGuard note 2: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote3() { return "RequestGuard note 3: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote4() { return "RequestGuard note 4: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote5() { return "RequestGuard note 5: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote6() { return "RequestGuard note 6: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote7() { return "RequestGuard note 7: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote8() { return "RequestGuard note 8: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote9() { return "RequestGuard note 9: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote10() { return "RequestGuard note 10: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote11() { return "RequestGuard note 11: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote12() { return "RequestGuard note 12: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote13() { return "RequestGuard note 13: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote14() { return "RequestGuard note 14: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote15() { return "RequestGuard note 15: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote16() { return "RequestGuard note 16: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote17() { return "RequestGuard note 17: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote18() { return "RequestGuard note 18: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote19() { return "RequestGuard note 19: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote20() { return "RequestGuard note 20: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote21() { return "RequestGuard note 21: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote22() { return "RequestGuard note 22: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote23() { return "RequestGuard note 23: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote24() { return "RequestGuard note 24: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote25() { return "RequestGuard note 25: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote26() { return "RequestGuard note 26: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote27() { return "RequestGuard note 27: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote28() { return "RequestGuard note 28: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote29() { return "RequestGuard note 29: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote30() { return "RequestGuard note 30: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote31() { return "RequestGuard note 31: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote32() { return "RequestGuard note 32: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote33() { return "RequestGuard note 33: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote34() { return "RequestGuard note 34: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote35() { return "RequestGuard note 35: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote36() { return "RequestGuard note 36: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote37() { return "RequestGuard note 37: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote38() { return "RequestGuard note 38: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote39() { return "RequestGuard note 39: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote40() { return "RequestGuard note 40: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote41() { return "RequestGuard note 41: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote42() { return "RequestGuard note 42: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote43() { return "RequestGuard note 43: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote44() { return "RequestGuard note 44: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote45() { return "RequestGuard note 45: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote46() { return "RequestGuard note 46: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote47() { return "RequestGuard note 47: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote48() { return "RequestGuard note 48: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote49() { return "RequestGuard note 49: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote50() { return "RequestGuard note 50: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote51() { return "RequestGuard note 51: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote52() { return "RequestGuard note 52: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote53() { return "RequestGuard note 53: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote54() { return "RequestGuard note 54: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote55() { return "RequestGuard note 55: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote56() { return "RequestGuard note 56: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote57() { return "RequestGuard note 57: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote58() { return "RequestGuard note 58: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote59() { return "RequestGuard note 59: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote60() { return "RequestGuard note 60: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote61() { return "RequestGuard note 61: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote62() { return "RequestGuard note 62: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote63() { return "RequestGuard note 63: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote64() { return "RequestGuard note 64: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote65() { return "RequestGuard note 65: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote66() { return "RequestGuard note 66: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote67() { return "RequestGuard note 67: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote68() { return "RequestGuard note 68: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote69() { return "RequestGuard note 69: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote70() { return "RequestGuard note 70: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote71() { return "RequestGuard note 71: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote72() { return "RequestGuard note 72: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote73() { return "RequestGuard note 73: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote74() { return "RequestGuard note 74: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote75() { return "RequestGuard note 75: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote76() { return "RequestGuard note 76: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote77() { return "RequestGuard note 77: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote78() { return "RequestGuard note 78: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote79() { return "RequestGuard note 79: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote80() { return "RequestGuard note 80: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote81() { return "RequestGuard note 81: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote82() { return "RequestGuard note 82: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote83() { return "RequestGuard note 83: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote84() { return "RequestGuard note 84: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote85() { return "RequestGuard note 85: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote86() { return "RequestGuard note 86: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote87() { return "RequestGuard note 87: 운영 분석 컨텍스트를 안전하게 전달한다."; }
}
