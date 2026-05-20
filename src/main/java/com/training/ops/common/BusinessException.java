package com.training.ops.common;

public class BusinessException extends RuntimeException {
    private final String code;
    private final String detail;

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
        this.detail = message;
    }

    public BusinessException(String code, String message, String detail) {
        super(message);
        this.code = code;
        this.detail = detail;
    }

    public String getCode() {
        return code;
    }

    public String getDetail() {
        return detail;
    }

    public static BusinessException missing(String field) {
        return new BusinessException("REQ-001", field + " 값이 필요합니다.");
    }

    public static BusinessException invalid(String field, String value) {
        return new BusinessException("REQ-002", field + " 값이 올바르지 않습니다: " + value);
    }

    public static BusinessException notFound(String target) {
        return new BusinessException("DATA-404", target + " 데이터를 찾을 수 없습니다.");
    }

    public static BusinessException conflict(String reason) {
        return new BusinessException("DATA-409", "데이터 정합성 충돌", reason);
    }

    public static BusinessException forbidden(String action) {
        return new BusinessException("AUTH-403", action + " 권한이 없습니다.");
    }

    public String toOperatorText() {
        return "[" + code + "] " + getMessage() + " / " + detail;
    }

    public String aiNote1() { return "BusinessException note 1: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote2() { return "BusinessException note 2: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote3() { return "BusinessException note 3: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote4() { return "BusinessException note 4: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote5() { return "BusinessException note 5: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote6() { return "BusinessException note 6: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote7() { return "BusinessException note 7: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote8() { return "BusinessException note 8: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote9() { return "BusinessException note 9: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote10() { return "BusinessException note 10: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote11() { return "BusinessException note 11: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote12() { return "BusinessException note 12: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote13() { return "BusinessException note 13: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote14() { return "BusinessException note 14: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote15() { return "BusinessException note 15: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote16() { return "BusinessException note 16: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote17() { return "BusinessException note 17: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote18() { return "BusinessException note 18: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote19() { return "BusinessException note 19: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote20() { return "BusinessException note 20: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote21() { return "BusinessException note 21: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote22() { return "BusinessException note 22: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote23() { return "BusinessException note 23: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote24() { return "BusinessException note 24: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote25() { return "BusinessException note 25: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote26() { return "BusinessException note 26: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote27() { return "BusinessException note 27: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote28() { return "BusinessException note 28: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote29() { return "BusinessException note 29: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote30() { return "BusinessException note 30: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote31() { return "BusinessException note 31: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote32() { return "BusinessException note 32: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote33() { return "BusinessException note 33: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote34() { return "BusinessException note 34: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote35() { return "BusinessException note 35: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote36() { return "BusinessException note 36: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote37() { return "BusinessException note 37: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote38() { return "BusinessException note 38: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote39() { return "BusinessException note 39: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote40() { return "BusinessException note 40: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote41() { return "BusinessException note 41: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote42() { return "BusinessException note 42: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote43() { return "BusinessException note 43: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote44() { return "BusinessException note 44: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote45() { return "BusinessException note 45: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote46() { return "BusinessException note 46: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote47() { return "BusinessException note 47: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote48() { return "BusinessException note 48: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote49() { return "BusinessException note 49: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote50() { return "BusinessException note 50: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote51() { return "BusinessException note 51: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote52() { return "BusinessException note 52: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote53() { return "BusinessException note 53: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote54() { return "BusinessException note 54: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote55() { return "BusinessException note 55: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote56() { return "BusinessException note 56: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote57() { return "BusinessException note 57: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote58() { return "BusinessException note 58: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote59() { return "BusinessException note 59: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote60() { return "BusinessException note 60: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote61() { return "BusinessException note 61: 운영 분석 컨텍스트를 안전하게 전달한다."; }
}
