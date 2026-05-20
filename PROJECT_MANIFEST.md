# Project Manifest

파일 목록 및 AI 인덱싱 힌트입니다.

## src/main/java/com/example/enterprise/user/domain/UserRecord.java

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/user/service/UserService.java

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/user/controller/UserController.java

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/user/mapper/UserMapper.java

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/user/UserMapper.xml

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/user/user_form.js

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/user/user_schema_and_analysis.sql

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/user/user_business_flow.md

- module: user
- description: 사용자/담당자 관리
- table: TBUSER
- key column: USERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/institution/domain/InstitutionRecord.java

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/institution/service/InstitutionService.java

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/institution/controller/InstitutionController.java

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/institution/mapper/InstitutionMapper.java

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/institution/InstitutionMapper.xml

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/institution/institution_form.js

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/institution/institution_schema_and_analysis.sql

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/institution/institution_business_flow.md

- module: institution
- description: 기관 정보 관리
- table: TBINST
- key column: INSTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/survey/domain/SurveyRecord.java

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/survey/service/SurveyService.java

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/survey/controller/SurveyController.java

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/survey/mapper/SurveyMapper.java

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/survey/SurveyMapper.xml

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/survey/survey_form.js

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/survey/survey_schema_and_analysis.sql

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/survey/survey_business_flow.md

- module: survey
- description: 조사 기본정보 관리
- table: TBSURVEY
- key column: SURVEYNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/submission/domain/SubmissionRecord.java

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/submission/service/SubmissionService.java

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/submission/controller/SubmissionController.java

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/submission/mapper/SubmissionMapper.java

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/submission/SubmissionMapper.xml

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/submission/submission_form.js

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/submission/submission_schema_and_analysis.sql

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/submission/submission_business_flow.md

- module: submission
- description: 조사 제출 관리
- table: TBINSTSURV
- key column: CHARGE
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/charge/domain/ChargeRecord.java

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/charge/service/ChargeService.java

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/charge/controller/ChargeController.java

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/charge/mapper/ChargeMapper.java

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/charge/ChargeMapper.xml

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/charge/charge_form.js

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/charge/charge_schema_and_analysis.sql

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/charge/charge_business_flow.md

- module: charge
- description: 담당자 이력/동기화
- table: TBCHARGEHIST
- key column: CHARGENM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/audit/domain/AuditRecord.java

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/audit/service/AuditService.java

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/audit/controller/AuditController.java

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/audit/mapper/AuditMapper.java

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/audit/AuditMapper.xml

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/audit/audit_form.js

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/audit/audit_schema_and_analysis.sql

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/audit/audit_business_flow.md

- module: audit
- description: 감사 로그
- table: TBAUDITLOG
- key column: ACTIONNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/batch/domain/BatchRecord.java

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/batch/service/BatchService.java

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/batch/controller/BatchController.java

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/batch/mapper/BatchMapper.java

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/batch/BatchMapper.xml

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/batch/batch_form.js

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/batch/batch_schema_and_analysis.sql

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/batch/batch_business_flow.md

- module: batch
- description: 배치 동기화
- table: TBBATCHLOG
- key column: JOBNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/notification/domain/NotificationRecord.java

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/notification/service/NotificationService.java

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/notification/controller/NotificationController.java

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/notification/mapper/NotificationMapper.java

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/notification/NotificationMapper.xml

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/notification/notification_form.js

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/notification/notification_schema_and_analysis.sql

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/notification/notification_business_flow.md

- module: notification
- description: 알림 발송
- table: TBNOTIFY
- key column: RECEIVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/report/domain/ReportRecord.java

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/report/service/ReportService.java

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/report/controller/ReportController.java

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/report/mapper/ReportMapper.java

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/report/ReportMapper.xml

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/report/report_form.js

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/report/report_schema_and_analysis.sql

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/report/report_business_flow.md

- module: report
- description: 통계 리포트
- table: TBREPORT
- key column: REPORTNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/discrepancy/domain/DiscrepancyRecord.java

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/discrepancy/service/DiscrepancyService.java

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/discrepancy/controller/DiscrepancyController.java

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/discrepancy/mapper/DiscrepancyMapper.java

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/discrepancy/DiscrepancyMapper.xml

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/discrepancy/discrepancy_form.js

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/discrepancy/discrepancy_schema_and_analysis.sql

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/discrepancy/discrepancy_business_flow.md

- module: discrepancy
- description: 데이터 불일치 분석
- table: TBDISCREPANCY
- key column: REASON
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/approval/domain/ApprovalRecord.java

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/approval/service/ApprovalService.java

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/approval/controller/ApprovalController.java

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/approval/mapper/ApprovalMapper.java

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/approval/ApprovalMapper.xml

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/approval/approval_form.js

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/approval/approval_schema_and_analysis.sql

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/approval/approval_business_flow.md

- module: approval
- description: 승인/반려 관리
- table: TBAPPROVAL
- key column: APPROVERNM
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/history/domain/HistoryRecord.java

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/history/service/HistoryService.java

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/history/controller/HistoryController.java

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/java/com/example/enterprise/history/mapper/HistoryMapper.java

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/resources/mapper/history/HistoryMapper.xml

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## src/main/webapp/nexacro/history/history_form.js

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## database/history/history_schema_and_analysis.sql

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/history/history_business_flow.md

- module: history
- description: 변경 이력 관리
- table: TBHISTORY
- key column: CHANGEDESC
- indexing hint: chunk by class/method/sql statement/transaction block
- line count target: 100+

## docs/common/AiQuestionExamples.md

- common training document
- line count target: 100+

## docs/common/LineageRules.md

- common training document
- line count target: 100+

## docs/common/KnownIssueScenarios.md

- common training document
- line count target: 100+

## docs/common/GitCommitSimulation.md

- common training document
- line count target: 100+

## docs/common/RagIndexingGuide.md

- common training document
- line count target: 100+

## docs/common/OperatorRunbook.md

- common training document
- line count target: 100+
