// 알림이력 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var notifyMessageForm = {};

notifyMessageForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '알림이력';
    this.baseApi = '/notify/message';
};

notifyMessageForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_search',
        '/notify/message/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_detail',
        '/notify/message/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_submit',
        '/notify/message/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_change',
        '/notify/message/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_diagnose',
        '/notify/message/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_reconcile',
        '/notify/message/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_history',
        '/notify/message/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '알림 재발송');
    this.transaction(
        'notify_message_export',
        '/notify/message/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'notifyMessageForm.fn_callback'
    );
};

notifyMessageForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_1', '/notify/message/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_2', '/notify/message/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_3', '/notify/message/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_4', '/notify/message/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_5', '/notify/message/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_6', '/notify/message/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_7', '/notify/message/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_8', '/notify/message/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_9', '/notify/message/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_10', '/notify/message/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_11', '/notify/message/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_12', '/notify/message/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_13', '/notify/message/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_14', '/notify/message/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_15', '/notify/message/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_16', '/notify/message/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_17', '/notify/message/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_18', '/notify/message/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_19', '/notify/message/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_20', '/notify/message/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '알림이력');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'RECEIVERNM');
    this.transaction('notify_message_tx_21', '/notify/message/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'notifyMessageForm.fn_callback');
};

notifyMessageForm.fn_callback = function(svcId, errCd, errMsg) {
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

notifyMessageForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'RECEIVERNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

notifyMessageForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
