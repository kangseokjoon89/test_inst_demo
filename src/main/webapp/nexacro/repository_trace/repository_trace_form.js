// 소스변경추적 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var repositoryTraceForm = {};

repositoryTraceForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '소스변경추적';
    this.baseApi = '/repo/trace';
};

repositoryTraceForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_search',
        '/repo/trace/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_detail',
        '/repo/trace/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_submit',
        '/repo/trace/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_change',
        '/repo/trace/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_diagnose',
        '/repo/trace/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_reconcile',
        '/repo/trace/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_history',
        '/repo/trace/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '변경 이력 분석');
    this.transaction(
        'repository_trace_export',
        '/repo/trace/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'repositoryTraceForm.fn_callback'
    );
};

repositoryTraceForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_1', '/repo/trace/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_2', '/repo/trace/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_3', '/repo/trace/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_4', '/repo/trace/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_5', '/repo/trace/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_6', '/repo/trace/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_7', '/repo/trace/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_8', '/repo/trace/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_9', '/repo/trace/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_10', '/repo/trace/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_11', '/repo/trace/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_12', '/repo/trace/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_13', '/repo/trace/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_14', '/repo/trace/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_15', '/repo/trace/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_16', '/repo/trace/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_17', '/repo/trace/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_18', '/repo/trace/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_19', '/repo/trace/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_20', '/repo/trace/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '소스변경추적');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'REVISIONMEMO');
    this.transaction('repository_trace_tx_21', '/repo/trace/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'repositoryTraceForm.fn_callback');
};

repositoryTraceForm.fn_callback = function(svcId, errCd, errMsg) {
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

repositoryTraceForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'REVISIONMEMO mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

repositoryTraceForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
