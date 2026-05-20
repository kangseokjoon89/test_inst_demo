package com.training.ops.repository_trace.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.repository_trace.service.RepositoryTraceService;

/**
 * SVN Git 변경 추적 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 소스변경추적
 * 대표 API: /repo/trace
 * 주요 이슈: 지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황
 */
public class RepositoryTraceController {

    private final RepositoryTraceService repositoryTraceService;

    public RepositoryTraceController(RepositoryTraceService repositoryTraceService) {
        this.repositoryTraceService = repositoryTraceService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.search");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/search.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", repositoryTraceService.search(context));
            response.success("처리 완료: SVN Git 변경 추적 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.detail");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/detail.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", repositoryTraceService.detail(context));
            response.success("처리 완료: SVN Git 변경 추적 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.submit");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/submit.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", repositoryTraceService.submit(context));
            response.success("처리 완료: SVN Git 변경 추적 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.change");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/change.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", repositoryTraceService.change(context));
            response.success("처리 완료: SVN Git 변경 추적 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.diagnose");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/diagnose.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", repositoryTraceService.diagnose(context));
            response.success("처리 완료: SVN Git 변경 추적 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.reconcile");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/reconcile.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", repositoryTraceService.reconcile(context));
            response.success("처리 완료: SVN Git 변경 추적 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.history");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/history.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", repositoryTraceService.history(context));
            response.success("처리 완료: SVN Git 변경 추적 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "repository_trace.export");
        ResponseMap response = ResponseMap.start("SVN Git 변경 추적", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("소스변경추적")
                .withApi("/repo/trace/export.do")
                .withEvent("변경 이력 분석")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", repositoryTraceService.export(context));
            response.success("처리 완료: SVN Git 변경 추적 / export");
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
            .withScreen("소스변경추적")
            .withApi("/repo/trace/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", repositoryTraceService.answerMismatchQuestion(context));
        response.putMeta("table", "TBREPOCHANGE");
        response.putMeta("column", "REVISIONMEMO");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_1");
        response.putMeta("apiPath", "/repo/trace/trace1.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_2");
        response.putMeta("apiPath", "/repo/trace/trace2.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_3");
        response.putMeta("apiPath", "/repo/trace/trace3.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_4");
        response.putMeta("apiPath", "/repo/trace/trace4.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_5");
        response.putMeta("apiPath", "/repo/trace/trace5.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_6");
        response.putMeta("apiPath", "/repo/trace/trace6.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_7");
        response.putMeta("apiPath", "/repo/trace/trace7.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_8");
        response.putMeta("apiPath", "/repo/trace/trace8.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_9");
        response.putMeta("apiPath", "/repo/trace/trace9.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_10");
        response.putMeta("apiPath", "/repo/trace/trace10.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_11");
        response.putMeta("apiPath", "/repo/trace/trace11.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_12");
        response.putMeta("apiPath", "/repo/trace/trace12.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_13");
        response.putMeta("apiPath", "/repo/trace/trace13.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_14");
        response.putMeta("apiPath", "/repo/trace/trace14.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "소스변경추적");
        response.putMeta("transactionId", "repository_trace_tx_15");
        response.putMeta("apiPath", "/repo/trace/trace15.do");
        response.putMeta("tableHint", "TBREPOCHANGE");
        response.putMeta("columnHint", "REVISIONMEMO");
        response.putMeta("questionHint", "지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황");
        response.putData("trace", repositoryTraceService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
