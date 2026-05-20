# 운영 질문 샘플

## 질문 1

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 2

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 조사기본정보
- 관련 API: /survey/master
- 관련 테이블: TBSURVEY
- 비교 컬럼: SURVEYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 3

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 제출상태관리
- 관련 API: /submit/status
- 관련 테이블: TBSUBMITSTAT
- 비교 컬럼: STATUSNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 4

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 승인처리
- 관련 API: /approval/flow
- 관련 테이블: TBAPPROVAL
- 비교 컬럼: APPROVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 5

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 알림이력
- 관련 API: /notify/message
- 관련 테이블: TBNOTIFY
- 비교 컬럼: RECEIVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 6

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 배치실행관리
- 관련 API: /batch/sync
- 관련 테이블: TBBATCHSYNC
- 비교 컬럼: SYNCTARGETNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 7

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 감사로그조회
- 관련 API: /audit/history
- 관련 테이블: TBAUDITHIST
- 비교 컬럼: ACTIONUSERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 8

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 통계리포트
- 관련 API: /report/metric
- 관련 테이블: TBREPORTMETRIC
- 비교 컬럼: DISPLAYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 9

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 데이터불일치분석
- 관련 API: /analysis/discrepancy
- 관련 테이블: TBDISCREPANCY
- 비교 컬럼: CAUSEMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 10

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 클라이언트환경설정
- 관련 API: /client/license
- 관련 테이블: TBCLIENTCONF
- 비교 컬럼: LICENSEURL
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 11

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 소스변경추적
- 관련 API: /repo/trace
- 관련 테이블: TBREPOCHANGE
- 비교 컬럼: REVISIONMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 12

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 운영SQL관리
- 관련 API: /query/book
- 관련 테이블: TBQUERYBOOK
- 비교 컬럼: QUERYTITLE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 13

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 담당자관리
- 관련 API: /user/charge
- 관련 테이블: TBUSER
- 비교 컬럼: USERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 14

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 15

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 조사기본정보
- 관련 API: /survey/master
- 관련 테이블: TBSURVEY
- 비교 컬럼: SURVEYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 16

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 제출상태관리
- 관련 API: /submit/status
- 관련 테이블: TBSUBMITSTAT
- 비교 컬럼: STATUSNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 17

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 승인처리
- 관련 API: /approval/flow
- 관련 테이블: TBAPPROVAL
- 비교 컬럼: APPROVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 18

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 알림이력
- 관련 API: /notify/message
- 관련 테이블: TBNOTIFY
- 비교 컬럼: RECEIVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 19

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 배치실행관리
- 관련 API: /batch/sync
- 관련 테이블: TBBATCHSYNC
- 비교 컬럼: SYNCTARGETNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 20

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 감사로그조회
- 관련 API: /audit/history
- 관련 테이블: TBAUDITHIST
- 비교 컬럼: ACTIONUSERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 21

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 통계리포트
- 관련 API: /report/metric
- 관련 테이블: TBREPORTMETRIC
- 비교 컬럼: DISPLAYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 22

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 데이터불일치분석
- 관련 API: /analysis/discrepancy
- 관련 테이블: TBDISCREPANCY
- 비교 컬럼: CAUSEMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 23

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 클라이언트환경설정
- 관련 API: /client/license
- 관련 테이블: TBCLIENTCONF
- 비교 컬럼: LICENSEURL
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 24

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 소스변경추적
- 관련 API: /repo/trace
- 관련 테이블: TBREPOCHANGE
- 비교 컬럼: REVISIONMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 25

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 운영SQL관리
- 관련 API: /query/book
- 관련 테이블: TBQUERYBOOK
- 비교 컬럼: QUERYTITLE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 26

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 담당자관리
- 관련 API: /user/charge
- 관련 테이블: TBUSER
- 비교 컬럼: USERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 27

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 28

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 조사기본정보
- 관련 API: /survey/master
- 관련 테이블: TBSURVEY
- 비교 컬럼: SURVEYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 29

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 제출상태관리
- 관련 API: /submit/status
- 관련 테이블: TBSUBMITSTAT
- 비교 컬럼: STATUSNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 30

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 승인처리
- 관련 API: /approval/flow
- 관련 테이블: TBAPPROVAL
- 비교 컬럼: APPROVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 31

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 알림이력
- 관련 API: /notify/message
- 관련 테이블: TBNOTIFY
- 비교 컬럼: RECEIVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 32

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 배치실행관리
- 관련 API: /batch/sync
- 관련 테이블: TBBATCHSYNC
- 비교 컬럼: SYNCTARGETNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 33

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 감사로그조회
- 관련 API: /audit/history
- 관련 테이블: TBAUDITHIST
- 비교 컬럼: ACTIONUSERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 34

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 통계리포트
- 관련 API: /report/metric
- 관련 테이블: TBREPORTMETRIC
- 비교 컬럼: DISPLAYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 35

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 데이터불일치분석
- 관련 API: /analysis/discrepancy
- 관련 테이블: TBDISCREPANCY
- 비교 컬럼: CAUSEMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 36

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 클라이언트환경설정
- 관련 API: /client/license
- 관련 테이블: TBCLIENTCONF
- 비교 컬럼: LICENSEURL
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 37

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 소스변경추적
- 관련 API: /repo/trace
- 관련 테이블: TBREPOCHANGE
- 비교 컬럼: REVISIONMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 38

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 운영SQL관리
- 관련 API: /query/book
- 관련 테이블: TBQUERYBOOK
- 비교 컬럼: QUERYTITLE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 39

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 담당자관리
- 관련 API: /user/charge
- 관련 테이블: TBUSER
- 비교 컬럼: USERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 40

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 41

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 조사기본정보
- 관련 API: /survey/master
- 관련 테이블: TBSURVEY
- 비교 컬럼: SURVEYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 42

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 제출상태관리
- 관련 API: /submit/status
- 관련 테이블: TBSUBMITSTAT
- 비교 컬럼: STATUSNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 43

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 승인처리
- 관련 API: /approval/flow
- 관련 테이블: TBAPPROVAL
- 비교 컬럼: APPROVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 44

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 알림이력
- 관련 API: /notify/message
- 관련 테이블: TBNOTIFY
- 비교 컬럼: RECEIVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 45

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 배치실행관리
- 관련 API: /batch/sync
- 관련 테이블: TBBATCHSYNC
- 비교 컬럼: SYNCTARGETNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 46

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 감사로그조회
- 관련 API: /audit/history
- 관련 테이블: TBAUDITHIST
- 비교 컬럼: ACTIONUSERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 47

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 통계리포트
- 관련 API: /report/metric
- 관련 테이블: TBREPORTMETRIC
- 비교 컬럼: DISPLAYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 48

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 데이터불일치분석
- 관련 API: /analysis/discrepancy
- 관련 테이블: TBDISCREPANCY
- 비교 컬럼: CAUSEMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 49

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 클라이언트환경설정
- 관련 API: /client/license
- 관련 테이블: TBCLIENTCONF
- 비교 컬럼: LICENSEURL
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 50

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 소스변경추적
- 관련 API: /repo/trace
- 관련 테이블: TBREPOCHANGE
- 비교 컬럼: REVISIONMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 51

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 운영SQL관리
- 관련 API: /query/book
- 관련 테이블: TBQUERYBOOK
- 비교 컬럼: QUERYTITLE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 52

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 담당자관리
- 관련 API: /user/charge
- 관련 테이블: TBUSER
- 비교 컬럼: USERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 53

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 54

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 조사기본정보
- 관련 API: /survey/master
- 관련 테이블: TBSURVEY
- 비교 컬럼: SURVEYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 55

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 제출상태관리
- 관련 API: /submit/status
- 관련 테이블: TBSUBMITSTAT
- 비교 컬럼: STATUSNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 56

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 승인처리
- 관련 API: /approval/flow
- 관련 테이블: TBAPPROVAL
- 비교 컬럼: APPROVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 57

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 알림이력
- 관련 API: /notify/message
- 관련 테이블: TBNOTIFY
- 비교 컬럼: RECEIVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 58

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 배치실행관리
- 관련 API: /batch/sync
- 관련 테이블: TBBATCHSYNC
- 비교 컬럼: SYNCTARGETNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 59

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 감사로그조회
- 관련 API: /audit/history
- 관련 테이블: TBAUDITHIST
- 비교 컬럼: ACTIONUSERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 60

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 통계리포트
- 관련 API: /report/metric
- 관련 테이블: TBREPORTMETRIC
- 비교 컬럼: DISPLAYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 61

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 데이터불일치분석
- 관련 API: /analysis/discrepancy
- 관련 테이블: TBDISCREPANCY
- 비교 컬럼: CAUSEMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 62

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 클라이언트환경설정
- 관련 API: /client/license
- 관련 테이블: TBCLIENTCONF
- 비교 컬럼: LICENSEURL
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 63

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 소스변경추적
- 관련 API: /repo/trace
- 관련 테이블: TBREPOCHANGE
- 비교 컬럼: REVISIONMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 64

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 운영SQL관리
- 관련 API: /query/book
- 관련 테이블: TBQUERYBOOK
- 비교 컬럼: QUERYTITLE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 65

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 담당자관리
- 관련 API: /user/charge
- 관련 테이블: TBUSER
- 비교 컬럼: USERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 66

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 67

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 조사기본정보
- 관련 API: /survey/master
- 관련 테이블: TBSURVEY
- 비교 컬럼: SURVEYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 68

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 제출상태관리
- 관련 API: /submit/status
- 관련 테이블: TBSUBMITSTAT
- 비교 컬럼: STATUSNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 69

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 승인처리
- 관련 API: /approval/flow
- 관련 테이블: TBAPPROVAL
- 비교 컬럼: APPROVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 70

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 알림이력
- 관련 API: /notify/message
- 관련 테이블: TBNOTIFY
- 비교 컬럼: RECEIVERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 71

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 배치실행관리
- 관련 API: /batch/sync
- 관련 테이블: TBBATCHSYNC
- 비교 컬럼: SYNCTARGETNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 72

제출완료기관 중 TBUSER.USERNM과 TBINSTSURV.CHARGE가 다른 기관이 있는데 왜 다른가요?

### 기대 답변 구성
- 관련 화면: 감사로그조회
- 관련 API: /audit/history
- 관련 테이블: TBAUDITHIST
- 비교 컬럼: ACTIONUSERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 73

지난주 금요일 기준으로는 10건이었는데 오늘은 왜 건수가 바뀌었나요?

### 기대 답변 구성
- 관련 화면: 통계리포트
- 관련 API: /report/metric
- 관련 테이블: TBREPORTMETRIC
- 비교 컬럼: DISPLAYNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 74

Nexacro 화면에서 저장 버튼을 누르면 어떤 SQL까지 실행되나요?

### 기대 답변 구성
- 관련 화면: 데이터불일치분석
- 관련 API: /analysis/discrepancy
- 관련 테이블: TBDISCREPANCY
- 비교 컬럼: CAUSEMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 75

담당자명 변경 후 기존 제출 이력도 같이 바뀌어야 하나요?

### 기대 답변 구성
- 관련 화면: 클라이언트환경설정
- 관련 API: /client/license
- 관련 테이블: TBCLIENTCONF
- 비교 컬럼: LICENSEURL
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 76

SVN revision r20260518 이후에 불일치가 늘어난 원인을 찾아주세요.

### 기대 답변 구성
- 관련 화면: 소스변경추적
- 관련 API: /repo/trace
- 관련 테이블: TBREPOCHANGE
- 비교 컬럼: REVISIONMEMO
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 77

DBeaver에서 서브쿼리 없이 확인할 수 있는 SQL을 알려주세요.

### 기대 답변 구성
- 관련 화면: 운영SQL관리
- 관련 API: /query/book
- 관련 테이블: TBQUERYBOOK
- 비교 컬럼: QUERYTITLE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 78

launch.html에서 licenseurl을 바꿨는데 xadl에 반영되지 않는 이유가 뭔가요?

### 기대 답변 구성
- 관련 화면: 담당자관리
- 관련 API: /user/charge
- 관련 테이블: TBUSER
- 비교 컬럼: USERNM
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision

## 질문 79

배치가 돈 뒤에도 일부 기관만 동기화가 안 된 이유를 찾아주세요.

### 기대 답변 구성
- 관련 화면: 기관조사제출
- 관련 API: /survey/institution
- 관련 테이블: TBINSTSURV
- 비교 컬럼: CHARGE
- 가능한 원인: snapshot 보존, 기준정보 변경, 배치 제외, 재제출 누락, 최근 배포 영향
- 확인 SQL: JOIN 기반 SELECT
- 추가 확인: 변경 이력, 배치 로그, source revision
