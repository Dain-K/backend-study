## SpringBoot Basic

<details>
<summary> spring 시작하기 ! </summary>
<div markdown="1">

## 프로젝트 생성

- Java 11 사용
- IDE: IntelliJ 또는 Eclipse 사용

### IntelliJ 사용 시 주의사항

IntelliJ 설정에서 [빌드도구 > Gradle] 에서 [빌드 및 실행] 을 모두 Gradle 이 아닌 IntelliJ로 변경해주어야 한다. <br/>
그렇지 않을 경우 Gralde을 통해 실행하여 느려지는 경우가 발생하기 때문이다. IntelliJ를 사용하여 빌드하게 되면 훨씬 빨리 동작한다.

## 스프링 프로젝트 생성 선택

#### 스프링 부트 스타터 사이트로 이동하여 프로젝트 생성

- https://start.spring.io

#### :four_leaf_clover: Project - Maven, Gradle-Groovy Project

- 과거에는 Maven을 많이 사용하였지만, 현재는 Gradle을 많이 사용하는 추세

#### :four_leaf_clover: Language - Java: 11

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

<details>
<summary> build.gradle 코드 보기 </summary>
<div markdown="1">

```java
plugins {
	id 'java'
	id 'org.springframework.boot' version '3.0.1'
	id 'io.spring.dependency-management' version '1.1.0'
}

group = 'hello'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17' // java version

repositories {
	mavenCentral() // dependencies 를 다운로드 받는 공개된 사이트 지정
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	testImplementation 'org.springframework.boot:spring-boot-starter-test' // 자동으로 들어가는 dependencies
}

tasks.named('test') {
	useJUnitPlatform()
}

```

</div>
</details>

</div>
</details>

<details>
<summary> 라이브러리 살펴보기 </summary>
<div markdown="1">

## 라이브러리 살펴보기

#### :pushpin: Gradle은 의존관계가 있는 라이브러리를 함께 다운로드 한다.

Console 창에 <br/>
<b>Tomcat started on port(s): 8080 (http) with context path ''</b> <br/>
라는 문구가 뜬다. <br/>
여기서 Tomcat 은 웹서버 이다.

## 스프링 부트 핵심 라이브러리

- spring-boot-starter-web
  - spring-boot-starter-tomcat: 톰캣 - 웹서버
  - spring-webmvc: 스프링 웹 MVC
- spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
- spring-boot-starter(공통): 스프링부트 + 스프링 코어 + 로깅
  - spring-boot
    - spring-core
  - spring-boot-starter-logging
    - logback, slf4j

## 테스트 라이브러리

- spring-boot-starter-test
  - junit: 테스트 프레임워크
  - mockito: 목 라이브러리
  - assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
  - spring-test: 스프링 통합 테스트 지원

</div>
</details>

<details>
<summary> View 환경설정 </summary>
<div markdown="1">

## View 환경설정

### Welcome Page 만들기

- resources/static/index.html
  [참고] static: 변하지 않는 정적 파일

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    Hello
    <a href="/hello">hello</a>
  </body>
</html>
```

- 스프링 부트가 제공하는 Welcome Page 기능
  - static/index.html 을 올려두면 Welcome Page 기능 제공

### thymeleaf 템플릿 엔진

- 이를 사용하면 내가 원하는 템플릿으로 변경이 가능
- Controller
  - web application에서 첫번째 진입점이 Controller 이다.
- HelloController.java

```java
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // web application 에서 /hello 로 들어올 경우 아래의 method 를 호출
    @GetMapping("hello")
    public String hello(Model model){ // Spring이 만들어주는 Model
        model.addAttribute("data", "hello!!"); // model에 data  hello!! 를 넣어준다
        return "hello"; // resources:templates/ + {ViewName} + .html 파일을 찾아 데이터를 넣어줌
    }
}

```

- resources/templates/hello.html

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
  <!--th: thymeleaf 템플릿 엔진, 위의 코드를 넣어주어야 동작 가능-->
  <head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    <p th:text="'안녕하세요. ' + ${data}">안녕하세요. 손님</p>
  </body>
</html>
```

## 동작 환경 그림

![동작환경그림](https://user-images.githubusercontent.com/81922587/211231632-21291013-efa9-4298-a2e0-d6a035cb3a72.png)
	
- 컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버(viewResolver)가 화면을 찾아서 처리
  - 스프링 부트 템플릿 엔진 기본 ViewName 매핑
  - resources:templates/ + {ViewName} + .html

</div>
</details>

<details>
<summary> 빌드하고 실행하기 </summary>
<div markdown="1">

## 빌드하고 실행하기

### 콘솔로 이동

1. ./gradlew build
2. cd build/libs
3. java -jar hello-spring-0.0.1-SNAPSHOT.jar
4. 실행 확인

### 윈도우일 경우

1. 콘솔로 이동 명령 프롬프트(cmd)로 이동
2. ./gradlew gradlew.bat 를 실행하면 됩니다.
3. 명령 프롬프트에서 gradlew.bat 를 실행하려면 gradlew 하고 엔터를 치면 됩니다.
4. gradlew build

### 서버를 배포할 경우

hello-spring-0.0.1-SNAPSHOT.jar 파일을 복사하여 서버에 넣고 java -jar hello-spring-0.0.1-SNAPSHOT.jar를 실행하면 된다.

</div>
</details>
