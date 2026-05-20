// 승인처리 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var approvalFlowForm = {};

approvalFlowForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '승인처리';
    this.baseApi = '/approval/flow';
};

approvalFlowForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_search',
        '/approval/flow/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_detail',
        '/approval/flow/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_submit',
        '/approval/flow/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_change',
        '/approval/flow/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_diagnose',
        '/approval/flow/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_reconcile',
        '/approval/flow/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_history',
        '/approval/flow/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '승인자 변경');
    this.transaction(
        'approval_flow_export',
        '/approval/flow/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'approvalFlowForm.fn_callback'
    );
};

approvalFlowForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_1', '/approval/flow/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_2', '/approval/flow/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_3', '/approval/flow/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_4', '/approval/flow/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_5', '/approval/flow/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_6', '/approval/flow/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_7', '/approval/flow/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_8', '/approval/flow/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_9', '/approval/flow/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_10', '/approval/flow/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_11', '/approval/flow/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_12', '/approval/flow/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_13', '/approval/flow/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_14', '/approval/flow/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_15', '/approval/flow/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_16', '/approval/flow/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_17', '/approval/flow/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_18', '/approval/flow/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_19', '/approval/flow/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_20', '/approval/flow/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '승인처리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'APPROVERNM');
    this.transaction('approval_flow_tx_21', '/approval/flow/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'approvalFlowForm.fn_callback');
};

approvalFlowForm.fn_callback = function(svcId, errCd, errMsg) {
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

approvalFlowForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'APPROVERNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

approvalFlowForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
