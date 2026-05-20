package com.example.enterprise.charge.controller;

import com.example.enterprise.charge.service.ChargeService;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 담당자 이력/동기화 컨트롤러.
 * 실제 Spring MVC 코드와 유사하게 작성했지만 외부 의존성 없이 읽히도록 구성했다.
 */
public class ChargeController {
    private final ChargeService service;

    public ChargeController(ChargeService service) {
        this.service = service;
    }

    public Map<String, Object> submit(String id, String actorId) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            response.put("success", true);
            response.put("data", service.submitAndSnapshot(id, actorId));
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> changeName(String id, String newName, String actorId, String syncYn) {
        Map<String, Object> response = new LinkedHashMap<>();
        boolean sync = "Y".equalsIgnoreCase(syncYn);
        try {
            if (sync) {
                response.put("data", service.changeNameWithSnapshotSync(id, newName, actorId));
            } else {
                response.put("data", service.changeNameWithoutSnapshotSync(id, newName, actorId));
            }
            response.put("success", true);
            response.put("snapshotPolicy", sync ? "SYNC" : "KEEP_SUBMISSION_SNAPSHOT");
        } catch (Exception e) {
            response.put("success", false);
            response.put("message", e.getMessage());
        }
        return response;
    }

    public Map<String, Object> analyzeMismatch(String commaInstCds, String baseDate) {
        List<String> instCds = Arrays.asList(commaInstCds.split(","));
        LocalDate date = baseDate == null || baseDate.isBlank() ? LocalDate.now() : LocalDate.parse(baseDate);
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("success", true);
        response.put("queryType", "DB_MISMATCH_CAUSE_ANALYSIS");
        response.put("requestedInstitutions", instCds);
        response.put("answer", service.buildOperationalAnswer(instCds, date));
        return response;
    }

    public Map<String, Object> reconcile(String commaInstCds, String actorId, String dryRunYn) {
        List<String> instCds = Arrays.asList(commaInstCds.split(","));
        boolean dryRun = !"N".equalsIgnoreCase(dryRunYn);
        Map<String, Object> response = new LinkedHashMap<>();
        service.reconcileSnapshotByPolicy(instCds, actorId, dryRun);
        response.put("success", true);
        response.put("dryRun", dryRun);
        response.put("message", dryRun ? "점검만 수행했습니다." : "snapshot 동기화를 적용했습니다.");
        return response;
    }

    public Map<String, Object> healthCheckStep1() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 1);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep2() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 2);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep3() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 3);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep4() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 4);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep5() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 5);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep6() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 6);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep7() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 7);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep8() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 8);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep9() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 9);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }

    public Map<String, Object> healthCheckStep10() {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("module", "charge");
        response.put("step", 10);
        response.put("table", "TBCHARGEHIST");
        response.put("column", "CHARGENM");
        response.put("available", true);
        return response;
    }
}
