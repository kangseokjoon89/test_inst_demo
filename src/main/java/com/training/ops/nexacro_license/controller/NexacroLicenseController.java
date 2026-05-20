package com.training.ops.nexacro_license.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.nexacro_license.service.NexacroLicenseService;

/**
 * Nexacro 라이선스 설정 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 클라이언트환경설정
 * 대표 API: /client/license
 * 주요 이슈: launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황
 */
public class NexacroLicenseController {

    private final NexacroLicenseService nexacroLicenseService;

    public NexacroLicenseController(NexacroLicenseService nexacroLicenseService) {
        this.nexacroLicenseService = nexacroLicenseService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.search");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/search.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", nexacroLicenseService.search(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.detail");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/detail.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", nexacroLicenseService.detail(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.submit");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/submit.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", nexacroLicenseService.submit(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.change");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/change.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", nexacroLicenseService.change(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.diagnose");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/diagnose.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", nexacroLicenseService.diagnose(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.reconcile");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/reconcile.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", nexacroLicenseService.reconcile(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.history");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/history.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", nexacroLicenseService.history(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "nexacro_license.export");
        ResponseMap response = ResponseMap.start("Nexacro 라이선스 설정", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("클라이언트환경설정")
                .withApi("/client/license/export.do")
                .withEvent("라이선스 URL 변경")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", nexacroLicenseService.export(context));
            response.success("처리 완료: Nexacro 라이선스 설정 / export");
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
            .withScreen("클라이언트환경설정")
            .withApi("/client/license/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", nexacroLicenseService.answerMismatchQuestion(context));
        response.putMeta("table", "TBCLIENTCONF");
        response.putMeta("column", "LICENSEURL");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_1");
        response.putMeta("apiPath", "/client/license/trace1.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_2");
        response.putMeta("apiPath", "/client/license/trace2.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_3");
        response.putMeta("apiPath", "/client/license/trace3.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_4");
        response.putMeta("apiPath", "/client/license/trace4.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_5");
        response.putMeta("apiPath", "/client/license/trace5.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_6");
        response.putMeta("apiPath", "/client/license/trace6.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_7");
        response.putMeta("apiPath", "/client/license/trace7.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_8");
        response.putMeta("apiPath", "/client/license/trace8.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_9");
        response.putMeta("apiPath", "/client/license/trace9.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_10");
        response.putMeta("apiPath", "/client/license/trace10.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_11");
        response.putMeta("apiPath", "/client/license/trace11.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_12");
        response.putMeta("apiPath", "/client/license/trace12.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_13");
        response.putMeta("apiPath", "/client/license/trace13.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_14");
        response.putMeta("apiPath", "/client/license/trace14.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "클라이언트환경설정");
        response.putMeta("transactionId", "nexacro_license_tx_15");
        response.putMeta("apiPath", "/client/license/trace15.do");
        response.putMeta("tableHint", "TBCLIENTCONF");
        response.putMeta("columnHint", "LICENSEURL");
        response.putMeta("questionHint", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        response.putData("trace", nexacroLicenseService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
