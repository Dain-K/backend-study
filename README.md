## 프로젝트 생성

- Java 11 사용
- IDE: IntelliJ 또는 Eclipse 사용

### IntelliJ 사용 시 주의사항

IntelliJ 설정에서 [빌드도구 > Gradle] 에서 [빌드 및 실행] 을 모두 Gradle 이 아닌 IntelliJ로 변경해주어야 한다. <br/>
그렇지 않을 경우 Gralde을 통해 실행하여 느려지는 경우가 발생하기 때문이다. IntelliJ를 사용하여 빌드하게 되면 훨씬 빨리 동작한다.

## 스프링 프로젝트 생성

#### https://start.spring.io

- 스프링 기반 프로젝트를 만들어주는 사이트

#### :four_leaf_clover: Project - Maven, Gradle

- 과거에는 Maven을 많이 사용하였지만, 현재는 Gradle을 많이 사용하는 추세

#### :four_leaf_clover: Language - Java

#### :four_leaf_clover: Spring Boot

- 스프링 버전 선택

## 프로젝트 파일 구성요소

- pom.xml: 메이븐 프로젝트 빌드 파일
- src/main/java: 자바 소스 경로
- src/main/java/DevProjectApplication.java: 애플리케이션을 시작할 수 있는 스프링 구성 메인 클래스 소스파일
- src/main/java.SevletInitializer.java: Project 생성시 Packaging을 War로 선택하였을 때 생성되는 파일
- src/main/resources: 리소스 파일 경로 - 자바 파일을 제외한 모든 파일
- src/main/resources/application.properties: 애플리케이션에서 사용할 여러가지 프로퍼티 정의
- src/main/resouces/static: 스타일시트, 자바스크립트, 이미지 등의 정적 리소스 파일 경로
- src/main/resources/template: 뷰 템플릿(Thymeleaf, Velocity 등) 파일 경로
- src/test: test 코드와 관련된 소스의 경로 - test 코드 중요
- src/build.gradle: version 설정, dependencies 설정

```java
```

## 스프링부트 dependencies

- thymeleaf
- spring-web
