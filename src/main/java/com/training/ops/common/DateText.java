package com.training.ops.common;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateText {
    private static final DateTimeFormatter ISO = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String today() {
        return LocalDate.now().format(ISO);
    }

    public static String lastFriday() {
        LocalDate date = LocalDate.now();
        while (date.getDayOfWeek() != DayOfWeek.FRIDAY) {
            date = date.minusDays(1);
        }
        return date.format(ISO);
    }

    public static boolean isAfter(String baseDate, String comparedDate) {
        if (baseDate == null || comparedDate == null) {
            return false;
        }
        return LocalDate.parse(comparedDate, ISO).isAfter(LocalDate.parse(baseDate, ISO));
    }

    public static String normalize(String text) {
        if (text == null || text.isBlank()) {
            return today();
        }
        return LocalDate.parse(text, ISO).format(ISO);
    }

    public static String rangeText(String from, String to) {
        return normalize(from) + " ~ " + normalize(to);
    }

    public String aiNote1() { return "DateText note 1: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote2() { return "DateText note 2: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote3() { return "DateText note 3: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote4() { return "DateText note 4: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote5() { return "DateText note 5: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote6() { return "DateText note 6: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote7() { return "DateText note 7: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote8() { return "DateText note 8: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote9() { return "DateText note 9: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote10() { return "DateText note 10: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote11() { return "DateText note 11: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote12() { return "DateText note 12: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote13() { return "DateText note 13: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote14() { return "DateText note 14: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote15() { return "DateText note 15: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote16() { return "DateText note 16: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote17() { return "DateText note 17: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote18() { return "DateText note 18: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote19() { return "DateText note 19: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote20() { return "DateText note 20: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote21() { return "DateText note 21: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote22() { return "DateText note 22: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote23() { return "DateText note 23: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote24() { return "DateText note 24: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote25() { return "DateText note 25: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote26() { return "DateText note 26: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote27() { return "DateText note 27: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote28() { return "DateText note 28: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote29() { return "DateText note 29: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote30() { return "DateText note 30: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote31() { return "DateText note 31: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote32() { return "DateText note 32: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote33() { return "DateText note 33: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote34() { return "DateText note 34: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote35() { return "DateText note 35: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote36() { return "DateText note 36: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote37() { return "DateText note 37: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote38() { return "DateText note 38: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote39() { return "DateText note 39: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote40() { return "DateText note 40: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote41() { return "DateText note 41: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote42() { return "DateText note 42: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote43() { return "DateText note 43: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote44() { return "DateText note 44: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote45() { return "DateText note 45: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote46() { return "DateText note 46: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote47() { return "DateText note 47: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote48() { return "DateText note 48: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote49() { return "DateText note 49: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote50() { return "DateText note 50: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote51() { return "DateText note 51: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote52() { return "DateText note 52: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote53() { return "DateText note 53: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote54() { return "DateText note 54: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote55() { return "DateText note 55: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote56() { return "DateText note 56: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote57() { return "DateText note 57: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote58() { return "DateText note 58: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote59() { return "DateText note 59: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote60() { return "DateText note 60: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote61() { return "DateText note 61: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote62() { return "DateText note 62: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote63() { return "DateText note 63: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote64() { return "DateText note 64: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote65() { return "DateText note 65: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote66() { return "DateText note 66: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote67() { return "DateText note 67: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote68() { return "DateText note 68: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote69() { return "DateText note 69: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote70() { return "DateText note 70: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote71() { return "DateText note 71: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote72() { return "DateText note 72: 운영 분석 컨텍스트를 안전하게 전달한다."; }
}
