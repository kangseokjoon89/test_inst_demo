// 클라이언트환경설정 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var nexacroLicenseForm = {};

nexacroLicenseForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '클라이언트환경설정';
    this.baseApi = '/client/license';
};

nexacroLicenseForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_search',
        '/client/license/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_detail',
        '/client/license/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_submit',
        '/client/license/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_change',
        '/client/license/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_diagnose',
        '/client/license/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_reconcile',
        '/client/license/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_history',
        '/client/license/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '라이선스 URL 변경');
    this.transaction(
        'nexacro_license_export',
        '/client/license/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'nexacroLicenseForm.fn_callback'
    );
};

nexacroLicenseForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_1', '/client/license/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_2', '/client/license/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_3', '/client/license/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_4', '/client/license/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_5', '/client/license/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_6', '/client/license/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_7', '/client/license/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_8', '/client/license/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_9', '/client/license/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_10', '/client/license/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_11', '/client/license/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_12', '/client/license/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_13', '/client/license/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_14', '/client/license/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_15', '/client/license/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_16', '/client/license/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_17', '/client/license/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_18', '/client/license/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_19', '/client/license/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_20', '/client/license/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '클라이언트환경설정');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'LICENSEURL');
    this.transaction('nexacro_license_tx_21', '/client/license/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'nexacroLicenseForm.fn_callback');
};

nexacroLicenseForm.fn_callback = function(svcId, errCd, errMsg) {
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

nexacroLicenseForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'LICENSEURL mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

nexacroLicenseForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
