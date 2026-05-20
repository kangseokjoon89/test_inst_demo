package com.training.ops.report_metric.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.report_metric.service.ReportMetricService;

/**
 * 통계 리포트 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 통계리포트
 * 대표 API: /report/metric
 * 주요 이슈: 리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황
 */
public class ReportMetricController {

    private final ReportMetricService reportMetricService;

    public ReportMetricController(ReportMetricService reportMetricService) {
        this.reportMetricService = reportMetricService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.search");
        ResponseMap response = ResponseMap.start("통계 리포트", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/search.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", reportMetricService.search(context));
            response.success("처리 완료: 통계 리포트 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.detail");
        ResponseMap response = ResponseMap.start("통계 리포트", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/detail.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", reportMetricService.detail(context));
            response.success("처리 완료: 통계 리포트 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.submit");
        ResponseMap response = ResponseMap.start("통계 리포트", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/submit.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", reportMetricService.submit(context));
            response.success("처리 완료: 통계 리포트 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.change");
        ResponseMap response = ResponseMap.start("통계 리포트", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/change.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", reportMetricService.change(context));
            response.success("처리 완료: 통계 리포트 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.diagnose");
        ResponseMap response = ResponseMap.start("통계 리포트", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/diagnose.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", reportMetricService.diagnose(context));
            response.success("처리 완료: 통계 리포트 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.reconcile");
        ResponseMap response = ResponseMap.start("통계 리포트", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/reconcile.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", reportMetricService.reconcile(context));
            response.success("처리 완료: 통계 리포트 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.history");
        ResponseMap response = ResponseMap.start("통계 리포트", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/history.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", reportMetricService.history(context));
            response.success("처리 완료: 통계 리포트 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "report_metric.export");
        ResponseMap response = ResponseMap.start("통계 리포트", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("통계리포트")
                .withApi("/report/metric/export.do")
                .withEvent("리포트 생성")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", reportMetricService.export(context));
            response.success("처리 완료: 통계 리포트 / export");
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
            .withScreen("통계리포트")
            .withApi("/report/metric/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", reportMetricService.answerMismatchQuestion(context));
        response.putMeta("table", "TBREPORTMETRIC");
        response.putMeta("column", "DISPLAYNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_1");
        response.putMeta("apiPath", "/report/metric/trace1.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_2");
        response.putMeta("apiPath", "/report/metric/trace2.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_3");
        response.putMeta("apiPath", "/report/metric/trace3.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_4");
        response.putMeta("apiPath", "/report/metric/trace4.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_5");
        response.putMeta("apiPath", "/report/metric/trace5.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_6");
        response.putMeta("apiPath", "/report/metric/trace6.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_7");
        response.putMeta("apiPath", "/report/metric/trace7.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_8");
        response.putMeta("apiPath", "/report/metric/trace8.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_9");
        response.putMeta("apiPath", "/report/metric/trace9.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_10");
        response.putMeta("apiPath", "/report/metric/trace10.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_11");
        response.putMeta("apiPath", "/report/metric/trace11.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_12");
        response.putMeta("apiPath", "/report/metric/trace12.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_13");
        response.putMeta("apiPath", "/report/metric/trace13.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_14");
        response.putMeta("apiPath", "/report/metric/trace14.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "통계리포트");
        response.putMeta("transactionId", "report_metric_tx_15");
        response.putMeta("apiPath", "/report/metric/trace15.do");
        response.putMeta("tableHint", "TBREPORTMETRIC");
        response.putMeta("columnHint", "DISPLAYNM");
        response.putMeta("questionHint", "리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황");
        response.putData("trace", reportMetricService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
