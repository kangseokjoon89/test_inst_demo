package com.training.ops.user_charge.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.user_charge.service.UserChargeService;

/**
 * 담당자 기준정보 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 담당자관리
 * 대표 API: /user/charge
 * 주요 이슈: 기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황
 */
public class UserChargeController {

    private final UserChargeService userChargeService;

    public UserChargeController(UserChargeService userChargeService) {
        this.userChargeService = userChargeService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.search");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/search.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", userChargeService.search(context));
            response.success("처리 완료: 담당자 기준정보 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.detail");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/detail.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", userChargeService.detail(context));
            response.success("처리 완료: 담당자 기준정보 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.submit");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/submit.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", userChargeService.submit(context));
            response.success("처리 완료: 담당자 기준정보 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.change");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/change.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", userChargeService.change(context));
            response.success("처리 완료: 담당자 기준정보 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.diagnose");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/diagnose.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", userChargeService.diagnose(context));
            response.success("처리 완료: 담당자 기준정보 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.reconcile");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/reconcile.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", userChargeService.reconcile(context));
            response.success("처리 완료: 담당자 기준정보 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.history");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/history.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", userChargeService.history(context));
            response.success("처리 완료: 담당자 기준정보 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "user_charge.export");
        ResponseMap response = ResponseMap.start("담당자 기준정보", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("담당자관리")
                .withApi("/user/charge/export.do")
                .withEvent("담당자명 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", userChargeService.export(context));
            response.success("처리 완료: 담당자 기준정보 / export");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-008", re.getMessage());
        }
        return response;
    }


    public ResponseMap askWhyDifferent(RequestMap request) {
        ResponseMap response = ResponseMap.start("운영문의", "왜 값이 다른가");
        OperationContext context = OperationContext.from(request)
            .withScreen("담당자관리")
            .withApi("/user/charge/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", userChargeService.answerMismatchQuestion(context));
        response.putMeta("table", "TBUSER");
        response.putMeta("column", "USERNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_1");
        response.putMeta("apiPath", "/user/charge/trace1.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_2");
        response.putMeta("apiPath", "/user/charge/trace2.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_3");
        response.putMeta("apiPath", "/user/charge/trace3.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_4");
        response.putMeta("apiPath", "/user/charge/trace4.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_5");
        response.putMeta("apiPath", "/user/charge/trace5.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_6");
        response.putMeta("apiPath", "/user/charge/trace6.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_7");
        response.putMeta("apiPath", "/user/charge/trace7.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_8");
        response.putMeta("apiPath", "/user/charge/trace8.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_9");
        response.putMeta("apiPath", "/user/charge/trace9.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_10");
        response.putMeta("apiPath", "/user/charge/trace10.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_11");
        response.putMeta("apiPath", "/user/charge/trace11.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_12");
        response.putMeta("apiPath", "/user/charge/trace12.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_13");
        response.putMeta("apiPath", "/user/charge/trace13.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_14");
        response.putMeta("apiPath", "/user/charge/trace14.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "담당자관리");
        response.putMeta("transactionId", "user_charge_tx_15");
        response.putMeta("apiPath", "/user/charge/trace15.do");
        response.putMeta("tableHint", "TBUSER");
        response.putMeta("columnHint", "USERNM");
        response.putMeta("questionHint", "기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황");
        response.putData("trace", userChargeService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
