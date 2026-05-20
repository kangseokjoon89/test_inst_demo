package com.training.ops.notify_message.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.notify_message.service.NotifyMessageService;

/**
 * 알림 발송 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 알림이력
 * 대표 API: /notify/message
 * 주요 이슈: 담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황
 */
public class NotifyMessageController {

    private final NotifyMessageService notifyMessageService;

    public NotifyMessageController(NotifyMessageService notifyMessageService) {
        this.notifyMessageService = notifyMessageService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.search");
        ResponseMap response = ResponseMap.start("알림 발송", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/search.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", notifyMessageService.search(context));
            response.success("처리 완료: 알림 발송 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.detail");
        ResponseMap response = ResponseMap.start("알림 발송", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/detail.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", notifyMessageService.detail(context));
            response.success("처리 완료: 알림 발송 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.submit");
        ResponseMap response = ResponseMap.start("알림 발송", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/submit.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", notifyMessageService.submit(context));
            response.success("처리 완료: 알림 발송 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.change");
        ResponseMap response = ResponseMap.start("알림 발송", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/change.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", notifyMessageService.change(context));
            response.success("처리 완료: 알림 발송 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.diagnose");
        ResponseMap response = ResponseMap.start("알림 발송", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/diagnose.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", notifyMessageService.diagnose(context));
            response.success("처리 완료: 알림 발송 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.reconcile");
        ResponseMap response = ResponseMap.start("알림 발송", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/reconcile.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", notifyMessageService.reconcile(context));
            response.success("처리 완료: 알림 발송 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.history");
        ResponseMap response = ResponseMap.start("알림 발송", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/history.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", notifyMessageService.history(context));
            response.success("처리 완료: 알림 발송 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "notify_message.export");
        ResponseMap response = ResponseMap.start("알림 발송", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("알림이력")
                .withApi("/notify/message/export.do")
                .withEvent("알림 재발송")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", notifyMessageService.export(context));
            response.success("처리 완료: 알림 발송 / export");
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
            .withScreen("알림이력")
            .withApi("/notify/message/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", notifyMessageService.answerMismatchQuestion(context));
        response.putMeta("table", "TBNOTIFY");
        response.putMeta("column", "RECEIVERNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_1");
        response.putMeta("apiPath", "/notify/message/trace1.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_2");
        response.putMeta("apiPath", "/notify/message/trace2.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_3");
        response.putMeta("apiPath", "/notify/message/trace3.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_4");
        response.putMeta("apiPath", "/notify/message/trace4.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_5");
        response.putMeta("apiPath", "/notify/message/trace5.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_6");
        response.putMeta("apiPath", "/notify/message/trace6.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_7");
        response.putMeta("apiPath", "/notify/message/trace7.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_8");
        response.putMeta("apiPath", "/notify/message/trace8.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_9");
        response.putMeta("apiPath", "/notify/message/trace9.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_10");
        response.putMeta("apiPath", "/notify/message/trace10.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_11");
        response.putMeta("apiPath", "/notify/message/trace11.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_12");
        response.putMeta("apiPath", "/notify/message/trace12.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_13");
        response.putMeta("apiPath", "/notify/message/trace13.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_14");
        response.putMeta("apiPath", "/notify/message/trace14.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "알림이력");
        response.putMeta("transactionId", "notify_message_tx_15");
        response.putMeta("apiPath", "/notify/message/trace15.do");
        response.putMeta("tableHint", "TBNOTIFY");
        response.putMeta("columnHint", "RECEIVERNM");
        response.putMeta("questionHint", "담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황");
        response.putData("trace", notifyMessageService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
