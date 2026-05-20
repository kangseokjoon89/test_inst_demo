// 기관 정보 관리 Nexacro 화면 스크립트
// AI 분석 포인트: 화면 transaction -> Controller -> Service -> Mapper -> TBINST.INSTNM
var institutionForm = {};

institutionForm.oninit = function() {
    this.dsSearch = new Dataset();
    this.dsResult = new Dataset();
    this.dsMismatch = new Dataset();
    this.lastTransactionId = null;
    this.messageBuffer = [];
};

institutionForm.fn_search = function(instCdList, baseDate) {
    this.lastTransactionId = "search_institution";
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, "INST_CDS", instCdList);
    this.dsSearch.setColumn(row, "BASE_DATE", baseDate);
    this.transaction(
        "analyzeInstitutionMismatch",
        "/institution/analyzeMismatch.do",
        "dsSearch=dsSearch",
        "dsMismatch=dsMismatch",
        "",
        "institutionForm.fn_callback"
    );
};

institutionForm.fn_submit = function(id, actorId) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, "ID", id);
    this.dsSearch.setColumn(row, "ACTOR_ID", actorId);
    this.transaction(
        "submitInstitution",
        "/institution/submit.do",
        "dsSearch=dsSearch",
        "dsResult=dsResult",
        "",
        "institutionForm.fn_callback"
    );
};

institutionForm.fn_changeName = function(id, newName, actorId, syncYn) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, "ID", id);
    this.dsSearch.setColumn(row, "NEW_NAME", newName);
    this.dsSearch.setColumn(row, "ACTOR_ID", actorId);
    this.dsSearch.setColumn(row, "SYNC_YN", syncYn);
    this.transaction(
        "changeInstitutionName",
        "/institution/changeName.do",
        "dsSearch=dsSearch",
        "dsResult=dsResult",
        "",
        "institutionForm.fn_callback"
    );
};

institutionForm.fn_callback = function(svcId, errCd, errMsg) {
    if (errCd < 0) {
        this.fn_addMessage("ERROR", svcId + ':' + errMsg);
        return;
    }
    if (svcId.indexOf("analyze") >= 0) {
        this.fn_renderMismatchGrid();
    } else if (svcId.indexOf("submit") >= 0) {
        this.fn_addMessage("INFO", "제출 완료");
    } else if (svcId.indexOf("change") >= 0) {
        this.fn_addMessage("INFO", "담당자명 변경 완료");
    }
};

institutionForm.fn_renderMismatchGrid = function() {
    var count = this.dsMismatch.getRowCount();
    for (var i = 0; i < count; i++) {
        var instCd = this.dsMismatch.getColumn(i, "INSTCD");
        var currentName = this.dsMismatch.getColumn(i, "CURRENT_NAME");
        var snapshotName = this.dsMismatch.getColumn(i, "SNAPSHOT_NAME");
        if (currentName != snapshotName) {
            this.fn_addMessage("WARN", instCd + " 담당자명 불일치: " + currentName + " / " + snapshotName);
        }
    }
};

institutionForm.fn_validateRule1 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule1: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule1: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule2 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule2: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule2: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule3 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule3: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule3: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule4 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule4: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule4: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule5 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule5: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule5: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule6 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule6: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule6: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule7 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule7: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule7: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule8 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule8: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule8: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule9 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule9: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule9: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule10 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule10: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule10: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule11 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule11: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule11: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule12 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule12: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule12: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule13 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule13: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule13: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule14 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule14: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule14: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule15 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule15: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule15: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule16 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule16: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule16: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_validateRule17 = function(row) {
    var instCd = this.dsSearch.getColumn(row, "INSTCD");
    var name = this.dsSearch.getColumn(row, "NAME");
    var status = this.dsSearch.getColumn(row, "STATUS");
    if (instCd == null || instCd == '') {
        this.fn_addMessage("VALIDATE", "rule17: 기관코드는 필수입니다.");
        return false;
    }
    if (status == 'SUBMITTED' && (name == null || name == '')) {
        this.fn_addMessage("VALIDATE", "rule17: 제출완료 건은 담당자명이 필요합니다.");
        return false;
    }
    return true;
};

institutionForm.fn_addMessage = function(level, message) {
    this.messageBuffer.push({level: level, message: message, time: new Date()});
};
