// 조사기본정보 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var surveyMasterForm = {};

surveyMasterForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '조사기본정보';
    this.baseApi = '/survey/master';
};

surveyMasterForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_search',
        '/survey/master/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_detail',
        '/survey/master/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_submit',
        '/survey/master/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_change',
        '/survey/master/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_diagnose',
        '/survey/master/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_reconcile',
        '/survey/master/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_history',
        '/survey/master/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 기본정보 수정');
    this.transaction(
        'survey_master_export',
        '/survey/master/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'surveyMasterForm.fn_callback'
    );
};

surveyMasterForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_1', '/survey/master/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_2', '/survey/master/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_3', '/survey/master/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_4', '/survey/master/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_5', '/survey/master/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_6', '/survey/master/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_7', '/survey/master/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_8', '/survey/master/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_9', '/survey/master/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_10', '/survey/master/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_11', '/survey/master/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_12', '/survey/master/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_13', '/survey/master/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_14', '/survey/master/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_15', '/survey/master/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_16', '/survey/master/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_17', '/survey/master/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_18', '/survey/master/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_19', '/survey/master/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_20', '/survey/master/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '조사기본정보');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SURVEYNM');
    this.transaction('survey_master_tx_21', '/survey/master/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'surveyMasterForm.fn_callback');
};

surveyMasterForm.fn_callback = function(svcId, errCd, errMsg) {
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

surveyMasterForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'SURVEYNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

surveyMasterForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
