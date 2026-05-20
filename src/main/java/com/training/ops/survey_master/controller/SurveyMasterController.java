package com.training.ops.survey_master.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.survey_master.service.SurveyMasterService;

/**
 * 조사 마스터 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 조사기본정보
 * 대표 API: /survey/master
 * 주요 이슈: 조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황
 */
public class SurveyMasterController {

    private final SurveyMasterService surveyMasterService;

    public SurveyMasterController(SurveyMasterService surveyMasterService) {
        this.surveyMasterService = surveyMasterService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.search");
        ResponseMap response = ResponseMap.start("조사 마스터", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/search.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", surveyMasterService.search(context));
            response.success("처리 완료: 조사 마스터 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.detail");
        ResponseMap response = ResponseMap.start("조사 마스터", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/detail.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", surveyMasterService.detail(context));
            response.success("처리 완료: 조사 마스터 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.submit");
        ResponseMap response = ResponseMap.start("조사 마스터", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/submit.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", surveyMasterService.submit(context));
            response.success("처리 완료: 조사 마스터 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.change");
        ResponseMap response = ResponseMap.start("조사 마스터", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/change.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", surveyMasterService.change(context));
            response.success("처리 완료: 조사 마스터 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.diagnose");
        ResponseMap response = ResponseMap.start("조사 마스터", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/diagnose.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", surveyMasterService.diagnose(context));
            response.success("처리 완료: 조사 마스터 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.reconcile");
        ResponseMap response = ResponseMap.start("조사 마스터", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/reconcile.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", surveyMasterService.reconcile(context));
            response.success("처리 완료: 조사 마스터 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.history");
        ResponseMap response = ResponseMap.start("조사 마스터", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/history.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", surveyMasterService.history(context));
            response.success("처리 완료: 조사 마스터 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "survey_master.export");
        ResponseMap response = ResponseMap.start("조사 마스터", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("조사기본정보")
                .withApi("/survey/master/export.do")
                .withEvent("조사 기본정보 수정")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", surveyMasterService.export(context));
            response.success("처리 완료: 조사 마스터 / export");
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
            .withScreen("조사기본정보")
            .withApi("/survey/master/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", surveyMasterService.answerMismatchQuestion(context));
        response.putMeta("table", "TBSURVEY");
        response.putMeta("column", "SURVEYNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_1");
        response.putMeta("apiPath", "/survey/master/trace1.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_2");
        response.putMeta("apiPath", "/survey/master/trace2.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_3");
        response.putMeta("apiPath", "/survey/master/trace3.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_4");
        response.putMeta("apiPath", "/survey/master/trace4.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_5");
        response.putMeta("apiPath", "/survey/master/trace5.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_6");
        response.putMeta("apiPath", "/survey/master/trace6.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_7");
        response.putMeta("apiPath", "/survey/master/trace7.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_8");
        response.putMeta("apiPath", "/survey/master/trace8.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_9");
        response.putMeta("apiPath", "/survey/master/trace9.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_10");
        response.putMeta("apiPath", "/survey/master/trace10.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_11");
        response.putMeta("apiPath", "/survey/master/trace11.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_12");
        response.putMeta("apiPath", "/survey/master/trace12.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_13");
        response.putMeta("apiPath", "/survey/master/trace13.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_14");
        response.putMeta("apiPath", "/survey/master/trace14.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "조사기본정보");
        response.putMeta("transactionId", "survey_master_tx_15");
        response.putMeta("apiPath", "/survey/master/trace15.do");
        response.putMeta("tableHint", "TBSURVEY");
        response.putMeta("columnHint", "SURVEYNM");
        response.putMeta("questionHint", "조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황");
        response.putData("trace", surveyMasterService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
