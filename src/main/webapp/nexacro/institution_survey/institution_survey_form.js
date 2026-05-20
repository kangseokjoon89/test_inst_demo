// 기관조사제출 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var institutionSurveyForm = {};

institutionSurveyForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '기관조사제출';
    this.baseApi = '/survey/institution';
};

institutionSurveyForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_search',
        '/survey/institution/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_detail',
        '/survey/institution/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_submit',
        '/survey/institution/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_change',
        '/survey/institution/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_diagnose',
        '/survey/institution/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_reconcile',
        '/survey/institution/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_history',
        '/survey/institution/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '조사 제출완료');
    this.transaction(
        'institution_survey_export',
        '/survey/institution/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'institutionSurveyForm.fn_callback'
    );
};

institutionSurveyForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_1', '/survey/institution/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_2', '/survey/institution/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_3', '/survey/institution/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_4', '/survey/institution/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_5', '/survey/institution/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_6', '/survey/institution/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_7', '/survey/institution/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_8', '/survey/institution/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_9', '/survey/institution/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_10', '/survey/institution/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_11', '/survey/institution/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_12', '/survey/institution/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_13', '/survey/institution/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_14', '/survey/institution/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_15', '/survey/institution/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_16', '/survey/institution/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_17', '/survey/institution/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_18', '/survey/institution/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_19', '/survey/institution/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_20', '/survey/institution/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '기관조사제출');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'CHARGE');
    this.transaction('institution_survey_tx_21', '/survey/institution/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'institutionSurveyForm.fn_callback');
};

institutionSurveyForm.fn_callback = function(svcId, errCd, errMsg) {
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

institutionSurveyForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'CHARGE mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

institutionSurveyForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
