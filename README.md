## 프로젝트 생성

- Java 11 사용
- IDE: IntelliJ 또는 Eclipse 사용

## 스프링 프로젝트 생성

### :paperclip: https://start.spring.io

- 스프링 기반 프로젝트를 만들어주는 사이트

### :four_leaf_clover: Project - Maven, Gradle

과거에는 Maven을 많이 사용하였지만, 현재는 Gradle을 많이 사용하는 추세

### :four_leaf_clover: Language - Java

### :four_leaf_clover: Spring Boot

버전 선택

## 프로젝트 파일 구성요소

- pom.xml: 메이븐 프로젝트 빌드 파일
- src/main:
- src/test: test 코드와 관련되 소스의 경로 - test 코드 중요
- src/main/java: 자바 소스 경로
- src/main/java/DevProjectApplication.java: 애플리케이션을 시작할 수 있는 스프링 구성 메인 클래스 소스파일
- src/main/java.SevletInitializer.java: Project 생성시 Packaging을 War로 선택하여을 때 생성되는 파일
- src/main/resources: 리소스 파일 경로
- src/main/resources/application.properties: 애플리케이션에서 사용할 여러가지 프로퍼티 정의
- src/main/resouces/static: 스타일시트, 자바스크립트, 이미지 등의 정적 리소스 파일 경로
- src/main/resources/template: 뷰 템플릿(Thymeleaf, Velocity 등) 파일 경로
