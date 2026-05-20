// 운영SQL관리 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var dbeaverQueryForm = {};

dbeaverQueryForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '운영SQL관리';
    this.baseApi = '/query/book';
};

dbeaverQueryForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_search',
        '/query/book/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_detail',
        '/query/book/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_submit',
        '/query/book/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_change',
        '/query/book/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_diagnose',
        '/query/book/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_reconcile',
        '/query/book/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_history',
        '/query/book/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '분석 SQL 실행');
    this.transaction(
        'dbeaver_query_export',
        '/query/book/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'dbeaverQueryForm.fn_callback'
    );
};

dbeaverQueryForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_1', '/query/book/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_2', '/query/book/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_3', '/query/book/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_4', '/query/book/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_5', '/query/book/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_6', '/query/book/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_7', '/query/book/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_8', '/query/book/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_9', '/query/book/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_10', '/query/book/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_11', '/query/book/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_12', '/query/book/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_13', '/query/book/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_14', '/query/book/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_15', '/query/book/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_16', '/query/book/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_17', '/query/book/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_18', '/query/book/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_19', '/query/book/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_20', '/query/book/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '운영SQL관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'QUERYTITLE');
    this.transaction('dbeaver_query_tx_21', '/query/book/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'dbeaverQueryForm.fn_callback');
};

dbeaverQueryForm.fn_callback = function(svcId, errCd, errMsg) {
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

dbeaverQueryForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'QUERYTITLE mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

dbeaverQueryForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
