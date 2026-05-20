# AI Enterprise Logic-Rich Demo

이 저장소는 AI 개발자에게 전달할 수 있는 학습용 엔터프라이즈 샘플 시스템입니다.
단순 파일 개수 늘리기가 아니라, 각 파일에 의미 있는 업무 로직, SQL lineage, 화면 transaction, 이력 추적 규칙을 포함합니다.

## 목표

- 비개발자의 운영 문의를 코드와 DB 흐름으로 분석하는 AI 시스템 검증
- GitHub/SVN 소스 연계 후 RAG/Graph/SQL lineage 품질 테스트
- 제출완료 snapshot 불일치, 담당자명 변경, 재제출, 배치 동기화 문제 재현

## 모듈 1: user

- 설명: 사용자/담당자 관리
- 대표 테이블: TBUSER
- 대표 컬럼: USERNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 2: institution

- 설명: 기관 정보 관리
- 대표 테이블: TBINST
- 대표 컬럼: INSTNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 3: survey

- 설명: 조사 기본정보 관리
- 대표 테이블: TBSURVEY
- 대표 컬럼: SURVEYNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 4: submission

- 설명: 조사 제출 관리
- 대표 테이블: TBINSTSURV
- 대표 컬럼: CHARGE
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 5: charge

- 설명: 담당자 이력/동기화
- 대표 테이블: TBCHARGEHIST
- 대표 컬럼: CHARGENM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 6: audit

- 설명: 감사 로그
- 대표 테이블: TBAUDITLOG
- 대표 컬럼: ACTIONNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 7: batch

- 설명: 배치 동기화
- 대표 테이블: TBBATCHLOG
- 대표 컬럼: JOBNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 8: notification

- 설명: 알림 발송
- 대표 테이블: TBNOTIFY
- 대표 컬럼: RECEIVERNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 9: report

- 설명: 통계 리포트
- 대표 테이블: TBREPORT
- 대표 컬럼: REPORTNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 10: discrepancy

- 설명: 데이터 불일치 분석
- 대표 테이블: TBDISCREPANCY
- 대표 컬럼: REASON
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 11: approval

- 설명: 승인/반려 관리
- 대표 테이블: TBAPPROVAL
- 대표 컬럼: APPROVERNM
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 모듈 12: history

- 설명: 변경 이력 관리
- 대표 테이블: TBHISTORY
- 대표 컬럼: CHANGEDESC
- 포함 파일: Controller, Service, Mapper, Domain, MyBatis XML, Nexacro JS, SQL, 업무문서
- AI 테스트 포인트: 화면 호출에서 DB 컬럼까지 추적 가능한지 확인

## 사용 방법

1. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
2. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
3. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
4. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
5. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
6. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
7. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
8. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
9. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
10. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
11. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
12. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
13. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
14. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
15. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
16. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
17. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
18. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
19. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
20. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
21. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
22. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
23. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
24. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
25. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
26. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
27. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
28. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
29. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
30. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
31. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
32. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
33. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
34. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
35. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
36. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
37. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
38. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
39. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
40. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
41. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
42. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
43. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
44. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
45. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
46. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
47. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
48. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
49. GitHub 저장소에 업로드합니다.
   - AI 개발자는 파일 단위가 아니라 메서드, SQL, transaction 단위로 청킹해야 합니다.
   - Java Service의 changeNameWithoutSnapshotSync 로직은 의도적으로 snapshot을 갱신하지 않습니다.
   - XML Mapper의 updateNameOnly와 updateSnapshot을 구분해서 lineage를 구성해야 합니다.
