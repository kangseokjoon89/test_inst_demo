package com.training.ops.submit_status.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.submit_status.service.SubmitStatusService;

/**
 * 제출 상태 전이 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 제출상태관리
 * 대표 API: /submit/status
 * 주요 이슈: 반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황
 */
public class SubmitStatusController {

    private final SubmitStatusService submitStatusService;

    public SubmitStatusController(SubmitStatusService submitStatusService) {
        this.submitStatusService = submitStatusService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.search");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/search.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", submitStatusService.search(context));
            response.success("처리 완료: 제출 상태 전이 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.detail");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/detail.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", submitStatusService.detail(context));
            response.success("처리 완료: 제출 상태 전이 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.submit");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/submit.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", submitStatusService.submit(context));
            response.success("처리 완료: 제출 상태 전이 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.change");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/change.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", submitStatusService.change(context));
            response.success("처리 완료: 제출 상태 전이 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.diagnose");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/diagnose.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", submitStatusService.diagnose(context));
            response.success("처리 완료: 제출 상태 전이 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.reconcile");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/reconcile.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", submitStatusService.reconcile(context));
            response.success("처리 완료: 제출 상태 전이 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.history");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/history.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", submitStatusService.history(context));
            response.success("처리 완료: 제출 상태 전이 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "submit_status.export");
        ResponseMap response = ResponseMap.start("제출 상태 전이", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("제출상태관리")
                .withApi("/submit/status/export.do")
                .withEvent("상태 전이")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", submitStatusService.export(context));
            response.success("처리 완료: 제출 상태 전이 / export");
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
            .withScreen("제출상태관리")
            .withApi("/submit/status/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", submitStatusService.answerMismatchQuestion(context));
        response.putMeta("table", "TBSUBMITSTAT");
        response.putMeta("column", "STATUSNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_1");
        response.putMeta("apiPath", "/submit/status/trace1.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_2");
        response.putMeta("apiPath", "/submit/status/trace2.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_3");
        response.putMeta("apiPath", "/submit/status/trace3.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_4");
        response.putMeta("apiPath", "/submit/status/trace4.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_5");
        response.putMeta("apiPath", "/submit/status/trace5.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_6");
        response.putMeta("apiPath", "/submit/status/trace6.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_7");
        response.putMeta("apiPath", "/submit/status/trace7.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_8");
        response.putMeta("apiPath", "/submit/status/trace8.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_9");
        response.putMeta("apiPath", "/submit/status/trace9.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_10");
        response.putMeta("apiPath", "/submit/status/trace10.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_11");
        response.putMeta("apiPath", "/submit/status/trace11.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_12");
        response.putMeta("apiPath", "/submit/status/trace12.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_13");
        response.putMeta("apiPath", "/submit/status/trace13.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_14");
        response.putMeta("apiPath", "/submit/status/trace14.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "제출상태관리");
        response.putMeta("transactionId", "submit_status_tx_15");
        response.putMeta("apiPath", "/submit/status/trace15.do");
        response.putMeta("tableHint", "TBSUBMITSTAT");
        response.putMeta("columnHint", "STATUSNM");
        response.putMeta("questionHint", "반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황");
        response.putData("trace", submitStatusService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
