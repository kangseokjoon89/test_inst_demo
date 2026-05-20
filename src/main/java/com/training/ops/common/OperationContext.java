package com.training.ops.common;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class OperationContext {
    private final Map<String, Object> values = new LinkedHashMap<>();

    public static OperationContext from(RequestMap request) {
        OperationContext ctx = new OperationContext();
        ctx.values.put("traceId", UUID.randomUUID().toString());
        ctx.values.put("moduleKey", request.getString("moduleKey", "unknown"));
        ctx.values.put("instCds", request.getString("instCds", request.getString("INST_CDS", "")));
        ctx.values.put("baseDate", request.getString("baseDate", request.getString("BASE_DATE", DateText.today())));
        ctx.values.put("actorId", request.getString("actorId", "system"));
        return ctx;
    }

    public OperationContext withScreen(String screenId) {
        values.put("screenId", screenId);
        return this;
    }

    public OperationContext withApi(String apiPath) {
        values.put("apiPath", apiPath);
        return this;
    }

    public OperationContext withEvent(String eventName) {
        values.put("eventName", eventName);
        return this;
    }

    public OperationContext withBaseDate(String baseDate) {
        values.put("baseDate", DateText.normalize(baseDate));
        return this;
    }

    public OperationContext withActor(String actorId) {
        values.put("actorId", actorId);
        return this;
    }

    public OperationContext withMemo(String memo) {
        values.put("memo", memo);
        return this;
    }

    public String getBaseDate() {
        return String.valueOf(values.get("baseDate"));
    }

    public boolean isAfterFridayBaseline() {
        return DateText.isAfter(DateText.lastFriday(), getBaseDate());
    }

    public Map<String, Object> toParamMap() {
        return new LinkedHashMap<>(values);
    }

    public String toCompactText() {
        return "screen=" + values.get("screenId") + ", api=" + values.get("apiPath") + ", baseDate=" + values.get("baseDate");
    }

    public String aiNote1() { return "OperationContext note 1: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote2() { return "OperationContext note 2: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote3() { return "OperationContext note 3: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote4() { return "OperationContext note 4: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote5() { return "OperationContext note 5: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote6() { return "OperationContext note 6: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote7() { return "OperationContext note 7: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote8() { return "OperationContext note 8: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote9() { return "OperationContext note 9: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote10() { return "OperationContext note 10: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote11() { return "OperationContext note 11: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote12() { return "OperationContext note 12: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote13() { return "OperationContext note 13: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote14() { return "OperationContext note 14: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote15() { return "OperationContext note 15: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote16() { return "OperationContext note 16: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote17() { return "OperationContext note 17: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote18() { return "OperationContext note 18: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote19() { return "OperationContext note 19: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote20() { return "OperationContext note 20: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote21() { return "OperationContext note 21: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote22() { return "OperationContext note 22: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote23() { return "OperationContext note 23: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote24() { return "OperationContext note 24: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote25() { return "OperationContext note 25: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote26() { return "OperationContext note 26: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote27() { return "OperationContext note 27: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote28() { return "OperationContext note 28: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote29() { return "OperationContext note 29: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote30() { return "OperationContext note 30: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote31() { return "OperationContext note 31: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote32() { return "OperationContext note 32: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote33() { return "OperationContext note 33: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote34() { return "OperationContext note 34: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote35() { return "OperationContext note 35: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote36() { return "OperationContext note 36: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote37() { return "OperationContext note 37: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote38() { return "OperationContext note 38: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote39() { return "OperationContext note 39: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote40() { return "OperationContext note 40: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote41() { return "OperationContext note 41: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote42() { return "OperationContext note 42: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote43() { return "OperationContext note 43: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote44() { return "OperationContext note 44: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote45() { return "OperationContext note 45: 운영 분석 컨텍스트를 안전하게 전달한다."; }
    public String aiNote46() { return "OperationContext note 46: 운영 분석 컨텍스트를 안전하게 전달한다."; }
}
