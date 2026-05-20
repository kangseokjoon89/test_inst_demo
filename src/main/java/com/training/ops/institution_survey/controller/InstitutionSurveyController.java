package com.training.ops.institution_survey.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.institution_survey.service.InstitutionSurveyService;

/**
 * 기관별 조사 제출 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 기관조사제출
 * 대표 API: /survey/institution
 * 주요 이슈: 제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황
 */
public class InstitutionSurveyController {

    private final InstitutionSurveyService institutionSurveyService;

    public InstitutionSurveyController(InstitutionSurveyService institutionSurveyService) {
        this.institutionSurveyService = institutionSurveyService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.search");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/search.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", institutionSurveyService.search(context));
            response.success("처리 완료: 기관별 조사 제출 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.detail");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/detail.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", institutionSurveyService.detail(context));
            response.success("처리 완료: 기관별 조사 제출 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.submit");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/submit.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", institutionSurveyService.submit(context));
            response.success("처리 완료: 기관별 조사 제출 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.change");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/change.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", institutionSurveyService.change(context));
            response.success("처리 완료: 기관별 조사 제출 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.diagnose");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/diagnose.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", institutionSurveyService.diagnose(context));
            response.success("처리 완료: 기관별 조사 제출 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.reconcile");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/reconcile.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", institutionSurveyService.reconcile(context));
            response.success("처리 완료: 기관별 조사 제출 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.history");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/history.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", institutionSurveyService.history(context));
            response.success("처리 완료: 기관별 조사 제출 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "institution_survey.export");
        ResponseMap response = ResponseMap.start("기관별 조사 제출", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("기관조사제출")
                .withApi("/survey/institution/export.do")
                .withEvent("조사 제출완료")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", institutionSurveyService.export(context));
            response.success("처리 완료: 기관별 조사 제출 / export");
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
            .withScreen("기관조사제출")
            .withApi("/survey/institution/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", institutionSurveyService.answerMismatchQuestion(context));
        response.putMeta("table", "TBINSTSURV");
        response.putMeta("column", "CHARGE");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_1");
        response.putMeta("apiPath", "/survey/institution/trace1.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_2");
        response.putMeta("apiPath", "/survey/institution/trace2.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_3");
        response.putMeta("apiPath", "/survey/institution/trace3.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_4");
        response.putMeta("apiPath", "/survey/institution/trace4.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_5");
        response.putMeta("apiPath", "/survey/institution/trace5.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_6");
        response.putMeta("apiPath", "/survey/institution/trace6.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_7");
        response.putMeta("apiPath", "/survey/institution/trace7.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_8");
        response.putMeta("apiPath", "/survey/institution/trace8.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_9");
        response.putMeta("apiPath", "/survey/institution/trace9.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_10");
        response.putMeta("apiPath", "/survey/institution/trace10.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_11");
        response.putMeta("apiPath", "/survey/institution/trace11.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_12");
        response.putMeta("apiPath", "/survey/institution/trace12.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_13");
        response.putMeta("apiPath", "/survey/institution/trace13.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_14");
        response.putMeta("apiPath", "/survey/institution/trace14.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "기관조사제출");
        response.putMeta("transactionId", "institution_survey_tx_15");
        response.putMeta("apiPath", "/survey/institution/trace15.do");
        response.putMeta("tableHint", "TBINSTSURV");
        response.putMeta("columnHint", "CHARGE");
        response.putMeta("questionHint", "제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황");
        response.putData("trace", institutionSurveyService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
