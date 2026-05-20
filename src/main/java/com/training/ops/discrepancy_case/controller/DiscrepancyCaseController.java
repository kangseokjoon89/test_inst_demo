package com.training.ops.discrepancy_case.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.discrepancy_case.service.DiscrepancyCaseService;

/**
 * 불일치 케이스 분석 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 데이터불일치분석
 * 대표 API: /analysis/discrepancy
 * 주요 이슈: DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황
 */
public class DiscrepancyCaseController {

    private final DiscrepancyCaseService discrepancyCaseService;

    public DiscrepancyCaseController(DiscrepancyCaseService discrepancyCaseService) {
        this.discrepancyCaseService = discrepancyCaseService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.search");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/search.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", discrepancyCaseService.search(context));
            response.success("처리 완료: 불일치 케이스 분석 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.detail");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/detail.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", discrepancyCaseService.detail(context));
            response.success("처리 완료: 불일치 케이스 분석 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.submit");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/submit.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", discrepancyCaseService.submit(context));
            response.success("처리 완료: 불일치 케이스 분석 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.change");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/change.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", discrepancyCaseService.change(context));
            response.success("처리 완료: 불일치 케이스 분석 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.diagnose");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/diagnose.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", discrepancyCaseService.diagnose(context));
            response.success("처리 완료: 불일치 케이스 분석 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.reconcile");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/reconcile.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", discrepancyCaseService.reconcile(context));
            response.success("처리 완료: 불일치 케이스 분석 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.history");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/history.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", discrepancyCaseService.history(context));
            response.success("처리 완료: 불일치 케이스 분석 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "discrepancy_case.export");
        ResponseMap response = ResponseMap.start("불일치 케이스 분석", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("데이터불일치분석")
                .withApi("/analysis/discrepancy/export.do")
                .withEvent("운영 문의 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", discrepancyCaseService.export(context));
            response.success("처리 완료: 불일치 케이스 분석 / export");
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
            .withScreen("데이터불일치분석")
            .withApi("/analysis/discrepancy/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", discrepancyCaseService.answerMismatchQuestion(context));
        response.putMeta("table", "TBDISCREPANCY");
        response.putMeta("column", "CAUSEMEMO");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_1");
        response.putMeta("apiPath", "/analysis/discrepancy/trace1.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_2");
        response.putMeta("apiPath", "/analysis/discrepancy/trace2.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_3");
        response.putMeta("apiPath", "/analysis/discrepancy/trace3.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_4");
        response.putMeta("apiPath", "/analysis/discrepancy/trace4.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_5");
        response.putMeta("apiPath", "/analysis/discrepancy/trace5.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_6");
        response.putMeta("apiPath", "/analysis/discrepancy/trace6.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_7");
        response.putMeta("apiPath", "/analysis/discrepancy/trace7.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_8");
        response.putMeta("apiPath", "/analysis/discrepancy/trace8.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_9");
        response.putMeta("apiPath", "/analysis/discrepancy/trace9.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_10");
        response.putMeta("apiPath", "/analysis/discrepancy/trace10.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_11");
        response.putMeta("apiPath", "/analysis/discrepancy/trace11.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_12");
        response.putMeta("apiPath", "/analysis/discrepancy/trace12.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_13");
        response.putMeta("apiPath", "/analysis/discrepancy/trace13.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_14");
        response.putMeta("apiPath", "/analysis/discrepancy/trace14.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "데이터불일치분석");
        response.putMeta("transactionId", "discrepancy_case_tx_15");
        response.putMeta("apiPath", "/analysis/discrepancy/trace15.do");
        response.putMeta("tableHint", "TBDISCREPANCY");
        response.putMeta("columnHint", "CAUSEMEMO");
        response.putMeta("questionHint", "DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황");
        response.putData("trace", discrepancyCaseService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
