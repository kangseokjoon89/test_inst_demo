// 데이터불일치분석 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var discrepancyCaseForm = {};

discrepancyCaseForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '데이터불일치분석';
    this.baseApi = '/analysis/discrepancy';
};

discrepancyCaseForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_search',
        '/analysis/discrepancy/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_detail',
        '/analysis/discrepancy/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_submit',
        '/analysis/discrepancy/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_change',
        '/analysis/discrepancy/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_diagnose',
        '/analysis/discrepancy/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_reconcile',
        '/analysis/discrepancy/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_history',
        '/analysis/discrepancy/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영 문의 분석');
    this.transaction(
        'discrepancy_case_export',
        '/analysis/discrepancy/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'discrepancyCaseForm.fn_callback'
    );
};

discrepancyCaseForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_1', '/analysis/discrepancy/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_2', '/analysis/discrepancy/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_3', '/analysis/discrepancy/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_4', '/analysis/discrepancy/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_5', '/analysis/discrepancy/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_6', '/analysis/discrepancy/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_7', '/analysis/discrepancy/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_8', '/analysis/discrepancy/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_9', '/analysis/discrepancy/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_10', '/analysis/discrepancy/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_11', '/analysis/discrepancy/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_12', '/analysis/discrepancy/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_13', '/analysis/discrepancy/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_14', '/analysis/discrepancy/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_15', '/analysis/discrepancy/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_16', '/analysis/discrepancy/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_17', '/analysis/discrepancy/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_18', '/analysis/discrepancy/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_19', '/analysis/discrepancy/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_20', '/analysis/discrepancy/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '데이터불일치분석');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CAUSEMEMO');
    this.transaction('discrepancy_case_tx_21', '/analysis/discrepancy/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'discrepancyCaseForm.fn_callback');
};

discrepancyCaseForm.fn_callback = function(svcId, errCd, errMsg) {
    if (errCd < 0) {
        this.fn_log('ERROR', svcId + ' / ' + errMsg);
        return;
    }
    if (svcId.indexOf('diagnose') >= 0 || svcId.indexOf('tx_') >= 0) {
        this.fn_renderIssueSummary(svcId);
    } else {
        this.fn_log('INFO', svcId + ' completed');
    }
};

discrepancyCaseForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'CAUSEMEMO mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

discrepancyCaseForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
