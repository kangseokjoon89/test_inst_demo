// 배치실행관리 Nexacro script
// transaction id와 backend url을 AI가 연결할 수 있도록 구성한다.
var batchSyncForm = {};

batchSyncForm.onload = function() {
    this.dsSearch = new Dataset();
    this.dsList = new Dataset();
    this.dsDetail = new Dataset();
    this.dsIssue = new Dataset();
    this.messageLog = [];
    this.screenId = '배치실행관리';
    this.baseApi = '/batch/sync';
};

batchSyncForm.fn_search = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_search',
        '/batch/sync/search.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_detail = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_detail',
        '/batch/sync/detail.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_submit = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_submit',
        '/batch/sync/submit.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_change = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_change',
        '/batch/sync/change.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_diagnose = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_diagnose',
        '/batch/sync/diagnose.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_reconcile = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_reconcile',
        '/batch/sync/reconcile.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_history = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_history',
        '/batch/sync/history.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_export = function(instCds, baseDate) {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'INST_CDS', instCds);
    this.dsSearch.setColumn(row, 'BASE_DATE', baseDate);
    this.dsSearch.setColumn(row, 'EVENT_NAME', '동기화 배치 실행');
    this.transaction(
        'batch_sync_export',
        '/batch/sync/export.do',
        'dsSearch=dsSearch',
        'dsList=dsList dsDetail=dsDetail dsIssue=dsIssue',
        '',
        'batchSyncForm.fn_callback'
    );
};

batchSyncForm.fn_traceButton1 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '1');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_1', '/batch/sync/trace1.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton2 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '2');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_2', '/batch/sync/trace2.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton3 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '3');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_3', '/batch/sync/trace3.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton4 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '4');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_4', '/batch/sync/trace4.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton5 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '5');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_5', '/batch/sync/trace5.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton6 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '6');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_6', '/batch/sync/trace6.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton7 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '7');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_7', '/batch/sync/trace7.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton8 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '8');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_8', '/batch/sync/trace8.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton9 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '9');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_9', '/batch/sync/trace9.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton10 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '10');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_10', '/batch/sync/trace10.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton11 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '11');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_11', '/batch/sync/trace11.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton12 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '12');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_12', '/batch/sync/trace12.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton13 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '13');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_13', '/batch/sync/trace13.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton14 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '14');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_14', '/batch/sync/trace14.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton15 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '15');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_15', '/batch/sync/trace15.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton16 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '16');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_16', '/batch/sync/trace16.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton17 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '17');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_17', '/batch/sync/trace17.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton18 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '18');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_18', '/batch/sync/trace18.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton19 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '19');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_19', '/batch/sync/trace19.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton20 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '20');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_20', '/batch/sync/trace20.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_traceButton21 = function() {
    this.dsSearch.clearData();
    var row = this.dsSearch.addRow();
    this.dsSearch.setColumn(row, 'TRACE_STEP', '21');
    this.dsSearch.setColumn(row, 'SCREEN_ID', '배치실행관리');
    this.dsSearch.setColumn(row, 'COLUMN_HINT', 'SYNCTARGETNM');
    this.transaction('batch_sync_tx_21', '/batch/sync/trace21.do',
        'dsSearch=dsSearch', 'dsIssue=dsIssue', '',
        'batchSyncForm.fn_callback');
};

batchSyncForm.fn_callback = function(svcId, errCd, errMsg) {
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

batchSyncForm.fn_renderIssueSummary = function(svcId) {
    var total = this.dsIssue.getRowCount();
    for (var i = 0; i < total; i++) {
        var instCd = this.dsIssue.getColumn(i, 'INSTCD');
        var currentValue = this.dsIssue.getColumn(i, 'CURRENT_VALUE');
        var savedValue = this.dsIssue.getColumn(i, 'SNAPSHOT_VALUE');
        if (currentValue != savedValue) {
            this.fn_log('WARN', 'SYNCTARGETNM mismatch: ' + instCd + ' / ' + currentValue + ' / ' + savedValue);
        }
    }
};

batchSyncForm.fn_log = function(level, message) {
    this.messageLog.push({level: level, message: message, time: new Date()});
};
