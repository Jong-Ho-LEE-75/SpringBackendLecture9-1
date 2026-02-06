# 프로젝트 가이드

이 문서는 Claude Code가 이 프로젝트에서 작업할 때 따라야 할 규칙과 가이드라인을 정의합니다.

## Git 커밋 규칙

커밋 메시지는 다음 형식을 따를 것:

### 커밋 메시지 형식
```
<제목: 50자 이내로 변경사항 요약>

<본문: 상세 설명>
- 변경한 내용: 무엇을 수정/추가/삭제했는지
- 변경 이유: 왜 이 변경이 필요했는지
- 주요 파일: 핵심적으로 변경된 파일들
```

### 예시
```
SpringHello 프로젝트 초기 설정 추가

- 변경한 내용:
  * Spring Boot 기본 프로젝트 구조 생성
  * Gradle 빌드 설정 추가
  * SpringHelloApplication 메인 클래스 작성

- 변경 이유:
  * Spring 학습을 위한 기본 프로젝트 구성 필요

- 주요 파일:
  * SpringHello/src/main/java/com/sprint/mission/springhello/SpringHelloApplication.java
  * SpringHello/build.gradle
  * SpringHello/settings.gradle

Co-Authored-By: Claude Sonnet 4.5 <noreply@anthropic.com>
```

### 커밋 제목 컨벤션
- 명확하고 구체적으로 작성
- 동사로 시작 (추가, 수정, 삭제, 리팩토링 등)
- "2026년 X월 X일 커밋" 같은 날짜 기반 메시지 지양
- 변경 내용이 한눈에 파악되도록 작성

## 프로젝트 구조

- `SpringHello/`: Spring Boot 학습 프로젝트
- `demo/`: 데모 프로젝트

## 개발 환경

- Java + Spring Boot
- Gradle 빌드 시스템
- 교육 목적 프로젝트
