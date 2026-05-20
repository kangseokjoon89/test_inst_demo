package com.training.ops.audit_history.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.audit_history.service.AuditHistoryService;

/**
 * 감사 이력 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 감사로그조회
 * 대표 API: /audit/history
 * 주요 이슈: 작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황
 */
public class AuditHistoryController {

    private final AuditHistoryService auditHistoryService;

    public AuditHistoryController(AuditHistoryService auditHistoryService) {
        this.auditHistoryService = auditHistoryService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.search");
        ResponseMap response = ResponseMap.start("감사 이력", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/search.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", auditHistoryService.search(context));
            response.success("처리 완료: 감사 이력 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.detail");
        ResponseMap response = ResponseMap.start("감사 이력", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/detail.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", auditHistoryService.detail(context));
            response.success("처리 완료: 감사 이력 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.submit");
        ResponseMap response = ResponseMap.start("감사 이력", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/submit.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", auditHistoryService.submit(context));
            response.success("처리 완료: 감사 이력 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.change");
        ResponseMap response = ResponseMap.start("감사 이력", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/change.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", auditHistoryService.change(context));
            response.success("처리 완료: 감사 이력 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.diagnose");
        ResponseMap response = ResponseMap.start("감사 이력", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/diagnose.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", auditHistoryService.diagnose(context));
            response.success("처리 완료: 감사 이력 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.reconcile");
        ResponseMap response = ResponseMap.start("감사 이력", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/reconcile.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", auditHistoryService.reconcile(context));
            response.success("처리 완료: 감사 이력 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.history");
        ResponseMap response = ResponseMap.start("감사 이력", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/history.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", auditHistoryService.history(context));
            response.success("처리 완료: 감사 이력 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "audit_history.export");
        ResponseMap response = ResponseMap.start("감사 이력", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("감사로그조회")
                .withApi("/audit/history/export.do")
                .withEvent("운영자 작업 기록")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", auditHistoryService.export(context));
            response.success("처리 완료: 감사 이력 / export");
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
            .withScreen("감사로그조회")
            .withApi("/audit/history/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", auditHistoryService.answerMismatchQuestion(context));
        response.putMeta("table", "TBAUDITHIST");
        response.putMeta("column", "ACTIONUSERNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_1");
        response.putMeta("apiPath", "/audit/history/trace1.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_2");
        response.putMeta("apiPath", "/audit/history/trace2.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_3");
        response.putMeta("apiPath", "/audit/history/trace3.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_4");
        response.putMeta("apiPath", "/audit/history/trace4.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_5");
        response.putMeta("apiPath", "/audit/history/trace5.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_6");
        response.putMeta("apiPath", "/audit/history/trace6.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_7");
        response.putMeta("apiPath", "/audit/history/trace7.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_8");
        response.putMeta("apiPath", "/audit/history/trace8.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_9");
        response.putMeta("apiPath", "/audit/history/trace9.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_10");
        response.putMeta("apiPath", "/audit/history/trace10.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_11");
        response.putMeta("apiPath", "/audit/history/trace11.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_12");
        response.putMeta("apiPath", "/audit/history/trace12.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_13");
        response.putMeta("apiPath", "/audit/history/trace13.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_14");
        response.putMeta("apiPath", "/audit/history/trace14.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "감사로그조회");
        response.putMeta("transactionId", "audit_history_tx_15");
        response.putMeta("apiPath", "/audit/history/trace15.do");
        response.putMeta("tableHint", "TBAUDITHIST");
        response.putMeta("columnHint", "ACTIONUSERNM");
        response.putMeta("questionHint", "작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황");
        response.putData("trace", auditHistoryService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
