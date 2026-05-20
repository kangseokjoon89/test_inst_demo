package com.training.ops.nexacro_license.service;

import com.training.ops.common.BusinessException;
import com.training.ops.common.OperationContext;
import com.training.ops.common.QueryGuide;
import com.training.ops.nexacro_license.domain.NexacroLicenseRecord;
import com.training.ops.nexacro_license.mapper.NexacroLicenseMapper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Nexacro 라이선스 설정 서비스.
 * 이 파일은 AI가 단순 코드 검색을 넘어 원인 분석을 수행하도록 만든 로직 중심 샘플이다.
 * 분석 대상: launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황
 */
public class NexacroLicenseService {

    private final NexacroLicenseMapper nexacroLicenseMapper;

    public NexacroLicenseService(NexacroLicenseMapper nexacroLicenseMapper) {
        this.nexacroLicenseMapper = nexacroLicenseMapper;
    }


    public Map<String, Object> search(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForSearch(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "search");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseSearch());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("search 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> detail(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForDetail(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "detail");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseDetail());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("detail 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> submit(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForSubmit(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "submit");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseSubmit());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("submit 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> change(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForChange(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "change");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseChange());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("change 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> diagnose(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForDiagnose(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "diagnose");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseDiagnose());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("diagnose 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> reconcile(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForReconcile(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "reconcile");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseReconcile());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("reconcile 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> history(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForHistory(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "history");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseHistory());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("history 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }

    public Map<String, Object> export(OperationContext context) {
        Map<String, Object> result = new LinkedHashMap<>();
        List<NexacroLicenseRecord> rows = nexacroLicenseMapper.selectForExport(context.toParamMap());
        int mismatchCount = 0;
        int submittedCount = 0;
        for (NexacroLicenseRecord row : rows) {
            if (row.isSubmitted()) {
                submittedCount++;
            }
            if (row.hasMeaningfulGap()) {
                mismatchCount++;
                result.put("sampleInstCd" + mismatchCount, row.getInstCd());
                result.put("sampleReason" + mismatchCount, inferCause(row, context));
            }
        }
        result.put("module", "nexacro_license");
        result.put("action", "export");
        result.put("table", "TBCLIENTCONF");
        result.put("snapshotColumn", "LICENSEURL");
        result.put("submittedCount", submittedCount);
        result.put("mismatchCount", mismatchCount);
        result.put("baseDate", context.getBaseDate());
        result.put("nextSql", QueryGuide.nexacroLicenseExport());
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("export 처리 중 AI 추적 로그 생성").toParamMap());
        return result;
    }


    public Map<String, Object> answerMismatchQuestion(OperationContext context) {
        Map<String, Object> answer = new LinkedHashMap<>();
        List<NexacroLicenseRecord> submitted = nexacroLicenseMapper.selectSubmittedForInstitutions(context.toParamMap());
        List<Map<String, Object>> mismatches = new ArrayList<>();
        for (NexacroLicenseRecord row : submitted) {
            if (row.hasMeaningfulGap()) {
                Map<String, Object> one = new LinkedHashMap<>();
                one.put("instCd", row.getInstCd());
                one.put("currentValue", row.getCurrentName());
                one.put("snapshotValue", row.getSnapshotName());
                one.put("status", row.getStatus());
                one.put("changedAfterSubmit", row.changedAfterSubmit());
                one.put("likelyCause", inferCause(row, context));
                one.put("confirmSql", QueryGuide.nexacroLicenseMismatchByInstCd(row.getInstCd()));
                mismatches.add(one);
            }
        }
        answer.put("question", "launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황");
        answer.put("baseDate", context.getBaseDate());
        answer.put("screen", "클라이언트환경설정");
        answer.put("table", "TBCLIENTCONF");
        answer.put("column", "LICENSEURL");
        answer.put("mismatchCount", mismatches.size());
        answer.put("items", mismatches);
        answer.put("developerNote", buildDeveloperNote(mismatches.size()));
        answer.put("operatorGuide", buildOperatorGuide(context));
        nexacroLicenseMapper.insertOperatorTrace(context.withMemo("비개발자 운영 문의에 대한 원인 분석 생성").toParamMap());
        return answer;
    }

    public Map<String, Object> traceForAi(OperationContext context, int step) {
        Map<String, Object> explanation = new LinkedHashMap<>();
        explanation.put("step", step);
        explanation.put("module", "nexacro_license");
        explanation.put("screen", "클라이언트환경설정");
        explanation.put("event", "라이선스 URL 변경");

        if (step == 1) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace1.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "운영 문의에는 대개 기관코드, 기준일, 화면명, 담당자명이 함께 포함된다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace1());
        }

        if (step == 2) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace2.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "AI는 소스 검색만 하지 말고 화면 이벤트에서 SQL 컬럼까지 이어지는 경로를 찾아야 한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace2());
        }

        if (step == 3) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace3.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "Tibero 환경에서는 일반 SELECT와 JOIN 기반 진단 SQL을 우선 제공한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace3());
        }

        if (step == 4) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace4.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "서브쿼리 없이 조건을 분해하면 DBeaver에서 운영자가 단계별로 검증하기 쉽다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace4());
        }

        if (step == 5) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace5.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "Nexacro transaction id는 백엔드 URL과 업무 이벤트를 연결하는 중요한 단서다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace5());
        }

        if (step == 6) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace6.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "SVN revision 또는 Git commit은 기능 변경 시점 추정에 사용한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace6());
        }

        if (step == 7) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace7.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "동기화 배치가 제외한 기관은 현재값과 snapshot 값이 오래 다를 수 있다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace7());
        }

        if (step == 8) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace8.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "감사 이력의 이름은 당시 작업자명을 보존하는 것이 정상 설계일 수 있다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace8());
        }

        if (step == 9) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace9.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "불일치가 모두 오류는 아니므로 설계 의도, 누락, 배치 실패를 분리해야 한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace9());
        }

        if (step == 10) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace10.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "제출 시점의 값을 남겨야 하는 요구와 현재 기준정보를 보여줘야 하는 요구가 충돌할 수 있다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace10());
        }

        if (step == 11) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace11.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "운영 문의에는 대개 기관코드, 기준일, 화면명, 담당자명이 함께 포함된다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace11());
        }

        if (step == 12) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace12.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "AI는 소스 검색만 하지 말고 화면 이벤트에서 SQL 컬럼까지 이어지는 경로를 찾아야 한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace12());
        }

        if (step == 13) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace13.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "Tibero 환경에서는 일반 SELECT와 JOIN 기반 진단 SQL을 우선 제공한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace13());
        }

        if (step == 14) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace14.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "서브쿼리 없이 조건을 분해하면 DBeaver에서 운영자가 단계별로 검증하기 쉽다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace14());
        }

        if (step == 15) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace15.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "Nexacro transaction id는 백엔드 URL과 업무 이벤트를 연결하는 중요한 단서다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace15());
        }

        if (step == 16) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace16.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "SVN revision 또는 Git commit은 기능 변경 시점 추정에 사용한다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace16());
        }

        if (step == 17) {
            explanation.put("route", "클라이언트환경설정 -> /client/license/trace17.do -> NexacroLicenseService -> NexacroLicenseMapper");
            explanation.put("dataFocus", "TBCLIENTCONF.LICENSEURL");
            explanation.put("operatorClue", "동기화 배치가 제외한 기관은 현재값과 snapshot 값이 오래 다를 수 있다.");
            explanation.put("joinPolicy", "TBUSER와 기관코드 기준으로 비교하고, 서브쿼리는 사용하지 않는다.");
            explanation.put("candidateSql", QueryGuide.nexacroLicenseTrace17());
        }

        if (explanation.size() == 4) {
            explanation.put("route", "정의되지 않은 추적 단계");
            explanation.put("dataFocus", "TBCLIENTCONF");
        }
        return explanation;
    }

    private String inferCause(NexacroLicenseRecord row, OperationContext context) {
        if (!row.isSubmitted()) {
            return "제출완료가 아니므로 현재 문의의 핵심 조건에서 제외된다.";
        }
        if (row.getSnapshotName() == null || row.getSnapshotName().trim().isEmpty()) {
            return "snapshot 값이 비어 있어 제출 당시 저장 누락 또는 과거 데이터 이관 누락 가능성이 있다.";
        }
        if (row.changedAfterSubmit()) {
            return "제출 이후 기준정보가 변경되었지만 TBCLIENTCONF.LICENSEURL 값은 제출 당시 값으로 보존된 것으로 보인다.";
        }
        if (row.hasBatchSkipReason()) {
            return "배치 동기화 제외 조건에 걸려 기준정보와 업무 테이블이 같은 시점으로 맞춰지지 않았다.";
        }
        if (context.isAfterFridayBaseline()) {
            return "지난주 금요일 기준 확인한 결과와 현재 결과가 다르면 그 이후 변경 이력 또는 재제출 이력을 비교해야 한다.";
        }
        return "감사 이력과 변경 이력을 함께 봐야 하며, 단일 테이블 비교만으로는 단정하기 어렵다.";
    }

    private String buildDeveloperNote(int mismatchCount) {
        if (mismatchCount == 0) {
            return "현재 조회 조건에서는 불일치가 없지만, 기관코드 누락 여부를 재확인해야 한다.";
        }
        if (mismatchCount < 5) {
            return "소수 기관의 개별 변경 이력을 우선 조회한다.";
        }
        if (mismatchCount < 20) {
            return "특정 배치 또는 최근 배포 영향 가능성을 함께 검토한다.";
        }
        return "대량 불일치이므로 공통 로직 변경, 데이터 이관, 배치 실패 가능성을 먼저 확인한다.";
    }

    private List<String> buildOperatorGuide(OperationContext context) {
        List<String> guide = new ArrayList<>();
        guide.add("기관코드 목록과 기준일을 함께 남긴다.");
        guide.add("DBeaver에서 JOIN 기반 확인 SQL을 먼저 실행한다.");
        guide.add("TBUSER 현재값과 TBCLIENTCONF.LICENSEURL snapshot 값을 분리해 해석한다.");
        guide.add("SVN revision 또는 Git commit에서 /client/license 관련 변경 시점을 찾는다.");
        guide.add("재제출 여부가 있으면 snapshot 갱신 여부를 다시 본다.");
        guide.add("Nexacro transaction id가 화면 버튼과 맞는지 확인한다.");
        guide.add("확정 조치 전에는 reconcile을 dry-run으로 실행한다.");
        guide.add("context=" + context.toCompactText());
        return guide;
    }
}
