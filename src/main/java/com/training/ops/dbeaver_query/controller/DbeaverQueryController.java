package com.training.ops.dbeaver_query.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.dbeaver_query.service.DbeaverQueryService;

/**
 * DBeaver 운영 SQL 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 운영SQL관리
 * 대표 API: /query/book
 * 주요 이슈: 운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황
 */
public class DbeaverQueryController {

    private final DbeaverQueryService dbeaverQueryService;

    public DbeaverQueryController(DbeaverQueryService dbeaverQueryService) {
        this.dbeaverQueryService = dbeaverQueryService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.search");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/search.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", dbeaverQueryService.search(context));
            response.success("처리 완료: DBeaver 운영 SQL / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.detail");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/detail.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", dbeaverQueryService.detail(context));
            response.success("처리 완료: DBeaver 운영 SQL / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.submit");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/submit.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", dbeaverQueryService.submit(context));
            response.success("처리 완료: DBeaver 운영 SQL / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.change");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/change.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", dbeaverQueryService.change(context));
            response.success("처리 완료: DBeaver 운영 SQL / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.diagnose");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/diagnose.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", dbeaverQueryService.diagnose(context));
            response.success("처리 완료: DBeaver 운영 SQL / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.reconcile");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/reconcile.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", dbeaverQueryService.reconcile(context));
            response.success("처리 완료: DBeaver 운영 SQL / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.history");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/history.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", dbeaverQueryService.history(context));
            response.success("처리 완료: DBeaver 운영 SQL / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "dbeaver_query.export");
        ResponseMap response = ResponseMap.start("DBeaver 운영 SQL", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("운영SQL관리")
                .withApi("/query/book/export.do")
                .withEvent("분석 SQL 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", dbeaverQueryService.export(context));
            response.success("처리 완료: DBeaver 운영 SQL / export");
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
            .withScreen("운영SQL관리")
            .withApi("/query/book/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", dbeaverQueryService.answerMismatchQuestion(context));
        response.putMeta("table", "TBQUERYBOOK");
        response.putMeta("column", "QUERYTITLE");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_1");
        response.putMeta("apiPath", "/query/book/trace1.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_2");
        response.putMeta("apiPath", "/query/book/trace2.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_3");
        response.putMeta("apiPath", "/query/book/trace3.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_4");
        response.putMeta("apiPath", "/query/book/trace4.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_5");
        response.putMeta("apiPath", "/query/book/trace5.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_6");
        response.putMeta("apiPath", "/query/book/trace6.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_7");
        response.putMeta("apiPath", "/query/book/trace7.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_8");
        response.putMeta("apiPath", "/query/book/trace8.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_9");
        response.putMeta("apiPath", "/query/book/trace9.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_10");
        response.putMeta("apiPath", "/query/book/trace10.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_11");
        response.putMeta("apiPath", "/query/book/trace11.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_12");
        response.putMeta("apiPath", "/query/book/trace12.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_13");
        response.putMeta("apiPath", "/query/book/trace13.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_14");
        response.putMeta("apiPath", "/query/book/trace14.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "운영SQL관리");
        response.putMeta("transactionId", "dbeaver_query_tx_15");
        response.putMeta("apiPath", "/query/book/trace15.do");
        response.putMeta("tableHint", "TBQUERYBOOK");
        response.putMeta("columnHint", "QUERYTITLE");
        response.putMeta("questionHint", "운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황");
        response.putData("trace", dbeaverQueryService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
