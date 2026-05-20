# AI 운영 소스 분석 학습용 시스템

이 프로젝트는 비개발자가 운영 중인 프로그램의 로직과 오류 원인을 질문했을 때 AI가 답변할 수 있는지 검증하기 위한 합성 샘플입니다.
단순 파일 수 증가가 아니라, 화면 이벤트, Java 계층, MyBatis SQL, Tibero JOIN 분석, 변경 이력, snapshot 설계 의도를 서로 연결하도록 만들었습니다.

## 반영한 실제 요구 성향

- Tibero 기준 일반 SELECT 중심 분석
- PL/SQL보다 조회 SQL과 조인 기반 확인 선호
- 서브쿼리 없이 단계적으로 검증 가능한 SQL 선호
- Nexacro HTML5 / launch.html / xadl licenseurl 변경 흐름 포함
- DBeaver에서 바로 확인 가능한 운영 SQL 포함
- SVN 또는 GitHub 변경 이력 추적 시나리오 포함
- 제출완료기관, TBUSER.USERNM, TBINSTSURV.CHARGE 불일치 원인 분석 포함
- PM 관점에서 AI 개발자에게 전달 가능한 명세 문서 포함

## 모듈 목록

### 1. 담당자 기준정보
- key: `user_charge`
- table: `TBUSER`
- column: `USERNM`
- screen: `담당자관리`
- api: `/user/charge`
- issue: 기관 담당자 변경 후 제출 snapshot과 기준정보가 달라지는 상황

### 2. 기관별 조사 제출
- key: `institution_survey`
- table: `TBINSTSURV`
- column: `CHARGE`
- screen: `기관조사제출`
- api: `/survey/institution`
- issue: 제출완료기관의 CHARGE가 제출 당시 값으로 남는 상황

### 3. 조사 마스터
- key: `survey_master`
- table: `TBSURVEY`
- column: `SURVEYNM`
- screen: `조사기본정보`
- api: `/survey/master`
- issue: 조사명 변경 후 기존 제출 이력의 조사명이 과거 값으로 보이는 상황

### 4. 제출 상태 전이
- key: `submit_status`
- table: `TBSUBMITSTAT`
- column: `STATUSNM`
- screen: `제출상태관리`
- api: `/submit/status`
- issue: 반려 후 재제출 과정에서 상태명이 화면과 리포트에서 다르게 보이는 상황

### 5. 승인 결재 흐름
- key: `approval_flow`
- table: `TBAPPROVAL`
- column: `APPROVERNM`
- screen: `승인처리`
- api: `/approval/flow`
- issue: 결재자 변경 후 승인 이력에는 이전 결재자가 유지되는 상황

### 6. 알림 발송
- key: `notify_message`
- table: `TBNOTIFY`
- column: `RECEIVERNM`
- screen: `알림이력`
- api: `/notify/message`
- issue: 담당자 변경 직후 알림 수신자명이 이전 이름으로 발송되는 상황

### 7. 배치 동기화
- key: `batch_sync`
- table: `TBBATCHSYNC`
- column: `SYNCTARGETNM`
- screen: `배치실행관리`
- api: `/batch/sync`
- issue: 야간 배치가 일부 기관을 제외하고 동기화하는 상황

### 8. 감사 이력
- key: `audit_history`
- table: `TBAUDITHIST`
- column: `ACTIONUSERNM`
- screen: `감사로그조회`
- api: `/audit/history`
- issue: 작업자명 변경 후 과거 감사 로그에는 당시 이름이 남는 상황

### 9. 통계 리포트
- key: `report_metric`
- table: `TBREPORTMETRIC`
- column: `DISPLAYNM`
- screen: `통계리포트`
- api: `/report/metric`
- issue: 리포트 생성 시점의 표시명이 이후 기준정보와 다르게 보이는 상황

### 10. 불일치 케이스 분석
- key: `discrepancy_case`
- table: `TBDISCREPANCY`
- column: `CAUSEMEMO`
- screen: `데이터불일치분석`
- api: `/analysis/discrepancy`
- issue: DB 기준값과 업무 snapshot 값의 차이를 원인별로 분류하는 상황

### 11. Nexacro 라이선스 설정
- key: `nexacro_license`
- table: `TBCLIENTCONF`
- column: `LICENSEURL`
- screen: `클라이언트환경설정`
- api: `/client/license`
- issue: launch.html에서 xadl licenseurl을 환경별로 바꾸는 상황

### 12. SVN Git 변경 추적
- key: `repository_trace`
- table: `TBREPOCHANGE`
- column: `REVISIONMEMO`
- screen: `소스변경추적`
- api: `/repo/trace`
- issue: 지난주 금요일 기준 정상 여부와 특정 커밋 이후 변화 원인을 찾는 상황

### 13. DBeaver 운영 SQL
- key: `dbeaver_query`
- table: `TBQUERYBOOK`
- column: `QUERYTITLE`
- screen: `운영SQL관리`
- api: `/query/book`
- issue: 운영자가 서브쿼리 없이 조인 기반 확인 SQL을 작성해야 하는 상황

## 분석 관점 1

제출 시점의 값을 남겨야 하는 요구와 현재 기준정보를 보여줘야 하는 요구가 충돌할 수 있다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 2

운영 문의에는 대개 기관코드, 기준일, 화면명, 담당자명이 함께 포함된다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 3

AI는 소스 검색만 하지 말고 화면 이벤트에서 SQL 컬럼까지 이어지는 경로를 찾아야 한다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 4

Tibero 환경에서는 일반 SELECT와 JOIN 기반 진단 SQL을 우선 제공한다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 5

서브쿼리 없이 조건을 분해하면 DBeaver에서 운영자가 단계별로 검증하기 쉽다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 6

Nexacro transaction id는 백엔드 URL과 업무 이벤트를 연결하는 중요한 단서다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 7

SVN revision 또는 Git commit은 기능 변경 시점 추정에 사용한다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 8

동기화 배치가 제외한 기관은 현재값과 snapshot 값이 오래 다를 수 있다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 9

감사 이력의 이름은 당시 작업자명을 보존하는 것이 정상 설계일 수 있다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.

## 분석 관점 10

불일치가 모두 오류는 아니므로 설계 의도, 누락, 배치 실패를 분리해야 한다.
AI 개발자는 이 문장을 문서 chunk로만 보지 말고, 관련 Java/SQL/Nexacro 파일과 연결되는 메타데이터로 활용해야 합니다.
