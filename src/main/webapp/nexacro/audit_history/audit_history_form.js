// 감사로그조회 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var auditHistoryForm = {};

auditHistoryForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '감사로그조회';
    this.baseApi = '/audit/history';
};

auditHistoryForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_search',
        '/audit/history/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_detail',
        '/audit/history/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_submit',
        '/audit/history/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_change',
        '/audit/history/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_diagnose',
        '/audit/history/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_reconcile',
        '/audit/history/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_history',
        '/audit/history/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '운영자 작업 기록');
    this.transaction(
        'audit_history_export',
        '/audit/history/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'auditHistoryForm.fn_callback'
    );
};

auditHistoryForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_1', '/audit/history/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_2', '/audit/history/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_3', '/audit/history/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_4', '/audit/history/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_5', '/audit/history/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_6', '/audit/history/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_7', '/audit/history/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_8', '/audit/history/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_9', '/audit/history/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_10', '/audit/history/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_11', '/audit/history/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_12', '/audit/history/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_13', '/audit/history/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_14', '/audit/history/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_15', '/audit/history/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_16', '/audit/history/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_17', '/audit/history/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_18', '/audit/history/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_19', '/audit/history/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_20', '/audit/history/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '감사로그조회');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'ACTIONUSERNM');
    this.transaction('audit_history_tx_21', '/audit/history/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'auditHistoryForm.fn_callback');
};

auditHistoryForm.fn_callback = function(svcId, errCd, errMsg) {
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

auditHistoryForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'ACTIONUSERNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

auditHistoryForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
