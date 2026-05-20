package com.training.ops.batch_sync.controller;

import com.training.ops.common.BusinessException;
import com.training.ops.common.DateText;
import com.training.ops.common.OperationContext;
import com.training.ops.common.RequestGuard;
import com.training.ops.common.RequestMap;
import com.training.ops.common.ResponseMap;
import com.training.ops.batch_sync.service.BatchSyncService;

/**
 * 배치 동기화 컨트롤러.
 * 비개발자가 화면에서 질문한 내용을 AI가 추적할 때 첫 진입점으로 사용된다.
 * 화면명: 배치실행관리
 * 대표 API: /batch/sync
 * 주요 이슈: 야간 배치가 일부 기관을 제외하고 동기화하는 상황
 */
public class BatchSyncController {

    private final BatchSyncService batchSyncService;

    public BatchSyncController(BatchSyncService batchSyncService) {
        this.batchSyncService = batchSyncService;
    }


    public ResponseMap search(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.search");
        ResponseMap response = ResponseMap.start("배치 동기화", "search");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/search.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("searchResult", batchSyncService.search(context));
            response.success("처리 완료: 배치 동기화 / search");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-001", re.getMessage());
        }
        return response;
    }

    public ResponseMap detail(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.detail");
        ResponseMap response = ResponseMap.start("배치 동기화", "detail");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/detail.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("detailResult", batchSyncService.detail(context));
            response.success("처리 완료: 배치 동기화 / detail");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-002", re.getMessage());
        }
        return response;
    }

    public ResponseMap submit(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.submit");
        ResponseMap response = ResponseMap.start("배치 동기화", "submit");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/submit.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("submitResult", batchSyncService.submit(context));
            response.success("처리 완료: 배치 동기화 / submit");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-003", re.getMessage());
        }
        return response;
    }

    public ResponseMap change(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.change");
        ResponseMap response = ResponseMap.start("배치 동기화", "change");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/change.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("changeResult", batchSyncService.change(context));
            response.success("처리 완료: 배치 동기화 / change");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-004", re.getMessage());
        }
        return response;
    }

    public ResponseMap diagnose(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.diagnose");
        ResponseMap response = ResponseMap.start("배치 동기화", "diagnose");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/diagnose.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("diagnoseResult", batchSyncService.diagnose(context));
            response.success("처리 완료: 배치 동기화 / diagnose");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-005", re.getMessage());
        }
        return response;
    }

    public ResponseMap reconcile(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.reconcile");
        ResponseMap response = ResponseMap.start("배치 동기화", "reconcile");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/reconcile.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("reconcileResult", batchSyncService.reconcile(context));
            response.success("처리 완료: 배치 동기화 / reconcile");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-006", re.getMessage());
        }
        return response;
    }

    public ResponseMap history(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.history");
        ResponseMap response = ResponseMap.start("배치 동기화", "history");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/history.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("historyResult", batchSyncService.history(context));
            response.success("처리 완료: 배치 동기화 / history");
        } catch (BusinessException be) {
            response.fail("업무 검증 실패", be.getCode(), be.getMessage());
        } catch (RuntimeException re) {
            response.fail("시스템 처리 실패", "SYS-007", re.getMessage());
        }
        return response;
    }

    public ResponseMap export(RequestMap request) {
        RequestGuard.requireInstCdWhenPresent(request, "batch_sync.export");
        ResponseMap response = ResponseMap.start("배치 동기화", "export");
        String actorId = request.getString("actorId", "system");
        String baseDate = request.getString("baseDate", DateText.today());
        try {
            OperationContext context = OperationContext.from(request)
                .withScreen("배치실행관리")
                .withApi("/batch/sync/export.do")
                .withEvent("동기화 배치 실행")
                .withBaseDate(baseDate)
                .withActor(actorId);
            response.putData("exportResult", batchSyncService.export(context));
            response.success("처리 완료: 배치 동기화 / export");
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
            .withScreen("배치실행관리")
            .withApi("/batch/sync/askWhyDifferent.do")
            .withEvent("DB값 불일치 문의")
            .withBaseDate(request.getString("baseDate", DateText.today()))
            .withActor(request.getString("actorId", "operator"));
        response.putData("reasoning", batchSyncService.answerMismatchQuestion(context));
        response.putMeta("table", "TBBATCHSYNC");
        response.putMeta("column", "SYNCTARGETNM");
        response.putMeta("analysisStyle", "join-first-no-subquery");
        response.success("운영 문의 분석 완료");
        return response;
    }


    public ResponseMap routeForAiTrace1(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route1");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_1");
        response.putMeta("apiPath", "/batch/sync/trace1.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 1));
        return response;
    }

    public ResponseMap routeForAiTrace2(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route2");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_2");
        response.putMeta("apiPath", "/batch/sync/trace2.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 2));
        return response;
    }

    public ResponseMap routeForAiTrace3(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route3");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_3");
        response.putMeta("apiPath", "/batch/sync/trace3.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 3));
        return response;
    }

    public ResponseMap routeForAiTrace4(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route4");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_4");
        response.putMeta("apiPath", "/batch/sync/trace4.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 4));
        return response;
    }

    public ResponseMap routeForAiTrace5(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route5");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_5");
        response.putMeta("apiPath", "/batch/sync/trace5.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 5));
        return response;
    }

    public ResponseMap routeForAiTrace6(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route6");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_6");
        response.putMeta("apiPath", "/batch/sync/trace6.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 6));
        return response;
    }

    public ResponseMap routeForAiTrace7(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route7");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_7");
        response.putMeta("apiPath", "/batch/sync/trace7.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 7));
        return response;
    }

    public ResponseMap routeForAiTrace8(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route8");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_8");
        response.putMeta("apiPath", "/batch/sync/trace8.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 8));
        return response;
    }

    public ResponseMap routeForAiTrace9(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route9");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_9");
        response.putMeta("apiPath", "/batch/sync/trace9.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 9));
        return response;
    }

    public ResponseMap routeForAiTrace10(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route10");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_10");
        response.putMeta("apiPath", "/batch/sync/trace10.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 10));
        return response;
    }

    public ResponseMap routeForAiTrace11(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route11");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_11");
        response.putMeta("apiPath", "/batch/sync/trace11.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 11));
        return response;
    }

    public ResponseMap routeForAiTrace12(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route12");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_12");
        response.putMeta("apiPath", "/batch/sync/trace12.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 12));
        return response;
    }

    public ResponseMap routeForAiTrace13(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route13");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_13");
        response.putMeta("apiPath", "/batch/sync/trace13.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 13));
        return response;
    }

    public ResponseMap routeForAiTrace14(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route14");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_14");
        response.putMeta("apiPath", "/batch/sync/trace14.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 14));
        return response;
    }

    public ResponseMap routeForAiTrace15(RequestMap request) {
        ResponseMap response = ResponseMap.start("AI_TRACE", "route15");
        response.putMeta("screen", "배치실행관리");
        response.putMeta("transactionId", "batch_sync_tx_15");
        response.putMeta("apiPath", "/batch/sync/trace15.do");
        response.putMeta("tableHint", "TBBATCHSYNC");
        response.putMeta("columnHint", "SYNCTARGETNM");
        response.putMeta("questionHint", "야간 배치가 일부 기관을 제외하고 동기화하는 상황");
        response.putData("trace", batchSyncService.traceForAi(OperationContext.from(request), 15));
        return response;
    }

}
