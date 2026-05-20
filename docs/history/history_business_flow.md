# 변경 이력 관리 업무 흐름 문서

이 문서는 AI가 `history` 모듈의 업무 흐름과 데이터 불일치 원인을 이해하도록 만든 학습용 문서입니다.
대표 테이블은 `TBHISTORY`이고, 대표 snapshot 컬럼은 `CHANGEDESC`입니다.

## 핵심 업무 규칙

1. 제출완료 시점에는 현재 담당자명 또는 업무명을 snapshot 컬럼에 저장합니다.
2. 제출 이후 원본 담당자명이 변경되더라도 snapshot 컬럼은 자동 변경되지 않습니다.
3. 재제출 또는 명시적 동기화 API를 호출한 경우에만 snapshot 컬럼이 갱신됩니다.
4. 운영 문의에서 불일치가 발견되면 TBUSER, 업무 테이블, 이력 테이블을 함께 확인해야 합니다.
5. 단순히 값이 다르다는 이유만으로 오류라고 단정하면 안 되며, snapshot 설계인지 버그인지 구분해야 합니다.

## 대표 질문

> 제출완료기관 중 TBUSER.USERNM과 업무 테이블 snapshot 담당자명이 다른 기관들이 있는데 왜 다른가요?

## 권장 분석 순서

### 분석 단계 1

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 2

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 3

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 4

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 5

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 6

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 7

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 8

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 9

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 10

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 11

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 12

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 13

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 14

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 15

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 16

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 17

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 18

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 19

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 20

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 21

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 22

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 23

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 24

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 25

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 26

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 27

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 28

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 29

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 30

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 31

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 32

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 33

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 34

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 35

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 36

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 37

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 38

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 39

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 40

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 41

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 42

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 43

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

### 분석 단계 44

- `TBHISTORY`에서 STATUS가 SUBMITTED인지 확인합니다.
- `CHANGEDESC` 값이 제출 당시 snapshot인지 현재값인지 확인합니다.
- TBUSER.USERNM 변경 시점과 업무 테이블 UPDATED_AT을 비교합니다.
- TBHISTORY에 담당자 변경 이력이 있는지 확인합니다.
- 배치 동기화 제외 대상인지 확인합니다.
- 재제출 이력이 있으면 snapshot이 갱신되었는지 확인합니다.

## AI가 답변할 때 포함해야 할 내용

- 불일치 건수
- 기관코드 목록
- 현재 담당자명
- snapshot 담당자명
- 추정 원인
- 확인해야 할 SQL
- 운영자 조치안
