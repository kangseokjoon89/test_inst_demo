package com.training.ops.approval_flow.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.approval_flow.service.ApprovalFlowService;

/**
 * 승인 결재 흐름 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 승인처리
 * 대표 API: /approval/flow
 * 주요 이슈: 결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황
 */
public class ApprovalFlowController {

    private final ApprovalFlowService approvalFlowService;

    public ApprovalFlowController(ApprovalFlowService approvalFlowService) {
        this.approvalFlowService = approvalFlowService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.search");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/search.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", approvalFlowService.search(context));
            response.success("처리 완료: 승인 결재 흐름 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.detail");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/detail.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", approvalFlowService.detail(context));
            response.success("처리 완료: 승인 결재 흐름 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.submit");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/submit.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", approvalFlowService.submit(context));
            response.success("처리 완료: 승인 결재 흐름 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.change");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/change.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", approvalFlowService.change(context));
            response.success("처리 완료: 승인 결재 흐름 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.diagnose");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/diagnose.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", approvalFlowService.diagnose(context));
            response.success("처리 완료: 승인 결재 흐름 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.reconcile");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/reconcile.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", approvalFlowService.reconcile(context));
            response.success("처리 완료: 승인 결재 흐름 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.history");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/history.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", approvalFlowService.history(context));
            response.success("처리 완료: 승인 결재 흐름 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "approval_flow.export");
        ResponseMap response = ResponseMap.start("승인 결재 흐름", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("승인처리")
                .withApi("/approval/flow/export.do")
                .withEvent("승인자 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", approvalFlowService.export(context));
            response.success("처리 완료: 승인 결재 흐름 / export");
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
            .withScreen("승인처리")
            .withApi("/approval/flow/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", approvalFlowService.answerMismatchQuestion(context));
        response.putMeta("table", "TBAPPROVAL");
        response.putMeta("column", "APPROVERNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_1");
        response.putMeta("apiPath", "/approval/flow/trace1.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_2");
        response.putMeta("apiPath", "/approval/flow/trace2.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_3");
        response.putMeta("apiPath", "/approval/flow/trace3.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_4");
        response.putMeta("apiPath", "/approval/flow/trace4.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_5");
        response.putMeta("apiPath", "/approval/flow/trace5.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_6");
        response.putMeta("apiPath", "/approval/flow/trace6.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_7");
        response.putMeta("apiPath", "/approval/flow/trace7.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_8");
        response.putMeta("apiPath", "/approval/flow/trace8.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_9");
        response.putMeta("apiPath", "/approval/flow/trace9.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_10");
        response.putMeta("apiPath", "/approval/flow/trace10.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_11");
        response.putMeta("apiPath", "/approval/flow/trace11.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_12");
        response.putMeta("apiPath", "/approval/flow/trace12.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_13");
        response.putMeta("apiPath", "/approval/flow/trace13.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_14");
        response.putMeta("apiPath", "/approval/flow/trace14.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "승인처리");
        response.putMeta("transactionId", "approval_flow_tx_15");
        response.putMeta("apiPath", "/approval/flow/trace15.do");
        response.putMeta("tableHint", "TBAPPROVAL");
        response.putMeta("columnHint", "APPROVERNM");
        response.putMeta("questionHint", "결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황");
        response.putData("trace", approvalFlowService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
