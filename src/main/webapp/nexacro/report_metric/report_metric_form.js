// 통계리포트 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var reportMetricForm = {};

reportMetricForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '통계리포트';
    this.baseApi = '/report/metric';
};

reportMetricForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_search',
        '/report/metric/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_detail',
        '/report/metric/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_submit',
        '/report/metric/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_change',
        '/report/metric/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_diagnose',
        '/report/metric/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_reconcile',
        '/report/metric/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_history',
        '/report/metric/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '리포트 생성');
    this.transaction(
        'report_metric_export',
        '/report/metric/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'reportMetricForm.fn_callback'
    );
};

reportMetricForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_1', '/report/metric/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_2', '/report/metric/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_3', '/report/metric/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_4', '/report/metric/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_5', '/report/metric/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_6', '/report/metric/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_7', '/report/metric/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_8', '/report/metric/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_9', '/report/metric/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_10', '/report/metric/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_11', '/report/metric/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_12', '/report/metric/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_13', '/report/metric/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_14', '/report/metric/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_15', '/report/metric/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_16', '/report/metric/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_17', '/report/metric/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_18', '/report/metric/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_19', '/report/metric/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_20', '/report/metric/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '통계리포트');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'DISPLAYNM');
    this.transaction('report_metric_tx_21', '/report/metric/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'reportMetricForm.fn_callback');
};

reportMetricForm.fn_callback = function(svcId, errCd, errMsg) {
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

reportMetricForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'DISPLAYNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

reportMetricForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
