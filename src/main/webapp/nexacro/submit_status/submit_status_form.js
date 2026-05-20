// 제출상태관리 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var submitStatusForm = {};

submitStatusForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '제출상태관리';
    this.baseApi = '/submit/status';
};

submitStatusForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_search',
        '/submit/status/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_detail',
        '/submit/status/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_submit',
        '/submit/status/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_change',
        '/submit/status/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_diagnose',
        '/submit/status/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_reconcile',
        '/submit/status/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_history',
        '/submit/status/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '상태 전이');
    this.transaction(
        'submit_status_export',
        '/submit/status/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'submitStatusForm.fn_callback'
    );
};

submitStatusForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_1', '/submit/status/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_2', '/submit/status/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_3', '/submit/status/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_4', '/submit/status/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_5', '/submit/status/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_6', '/submit/status/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_7', '/submit/status/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_8', '/submit/status/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_9', '/submit/status/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_10', '/submit/status/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_11', '/submit/status/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_12', '/submit/status/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_13', '/submit/status/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_14', '/submit/status/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_15', '/submit/status/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_16', '/submit/status/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_17', '/submit/status/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_18', '/submit/status/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_19', '/submit/status/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_20', '/submit/status/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '제출상태관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'STATUSNM');
    this.transaction('submit_status_tx_21', '/submit/status/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'submitStatusForm.fn_callback');
};

submitStatusForm.fn_callback = function(svcId, errCd, errMsg) {
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

submitStatusForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'STATUSNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

submitStatusForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
