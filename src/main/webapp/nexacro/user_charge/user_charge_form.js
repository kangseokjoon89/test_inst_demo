// 담당자관리 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var userChargeForm = {};

userChargeForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '담당자관리';
    this.baseApi = '/user/charge';
};

userChargeForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_search',
        '/user/charge/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_detail',
        '/user/charge/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_submit',
        '/user/charge/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_change',
        '/user/charge/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_diagnose',
        '/user/charge/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_reconcile',
        '/user/charge/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_history',
        '/user/charge/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '담당자명 변경');
    this.transaction(
        'user_charge_export',
        '/user/charge/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'userChargeForm.fn_callback'
    );
};

userChargeForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_1', '/user/charge/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_2', '/user/charge/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_3', '/user/charge/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_4', '/user/charge/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_5', '/user/charge/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_6', '/user/charge/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_7', '/user/charge/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_8', '/user/charge/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_9', '/user/charge/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_10', '/user/charge/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_11', '/user/charge/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_12', '/user/charge/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_13', '/user/charge/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_14', '/user/charge/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_15', '/user/charge/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_16', '/user/charge/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_17', '/user/charge/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_18', '/user/charge/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_19', '/user/charge/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_20', '/user/charge/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '담당자관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'USERNM');
    this.transaction('user_charge_tx_21', '/user/charge/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'userChargeForm.fn_callback');
};

userChargeForm.fn_callback = function(svcId, errCd, errMsg) {
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

userChargeForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'USERNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

userChargeForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
