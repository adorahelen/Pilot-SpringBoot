# 스프링 부트 3

## 스프링 부트 특징
- 톰캣 같은 웹 애플리케이션 서버(WAS)가 내장되어 있어, 설치가 불필요하다.
- XML 설정이 아닌, 자바 코드로 모두 작성 가능하다.
- JAR를 이용해서 자바 옵션 만으로 배포가 가능하다.
- 모니터링 및 관리 도구를 제공한다. (스프링 액츄에이터)

## 스프링 핵심
- 제어의 역전 & 의존성 주입 : IoC & DI
    * 개발자가 객체를 생성 -> 객체를 받아와서 사용 (스프링이 관리)
    * @Autowired, 빈을 주입(스프링이 컨테이너에서 관리하는 객체)
- 스프링 컨테이너 & 빈
- 관점 지향 프로그래밍 : AOP
- 이식 가능한 서비스 추상화 : PSA

## 스프링 부트 코드
- @SpringBootApplication > @SpringBootConfiguratuon + @ComponentScan + @EnableAutoConfiguration
- @Configuration:설정파일등록, @Repository:ORM매핑, @Controller&@RestController:라우터, @Service:비즈니스로직

## 스프링 부트 구조
- 프레젠테이션 계층 : 컨트롤러, Http요청을 받고 비즈니스 계층으로 전송 
- 비즈니스 계층 : 서비스, 웹사이트에서 벌어지는 모든 작업, 데이터를 처리하기 위한 로직, 예외처리, 프로세스 구현
- 퍼시스턴스 계층 : 리포지토리, DB관한 모든 로직, DAO 객체를 사용할 수도 아닐 수도 있다.
- 데이터베이스
    * 계층은 개념의 영역, 컨트롤러+서비스+리포지토리는 구현의 영역

## 테스트 (스프링 부트 stater Test List)
    * Junit : 자바 프로그래밍 언어용 단위 테스트 프레임워크
- AssertJ : 검증문인 어설션을 작성하는데 사용되는 라이브러리
- Hamcrest : 표현식을 이해하기 쉽게 만드는데 사용되는 Matcher 라이브러리
- Mockito : 테스트에 사용될 가짜 객체인 목 객체를 만들고, 관리하고, 검증할 수 있게 지원하는 테스트 프레임워크
- JSONassert : Json용 어설션 라이브러리
- JsonPath : Json데이터에서 특정 데이터를 선택하고 검색하기 위한 라이브러리

## JPA
- ORM : 관계형 데이터베이스와 프로그램 간의 통신 개념
- JPA : 자바 애플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 기술 명세
- 하이버네이트 : JPA의 구현체 (인스턴스 같은 개념인듯)
- 스프링 데이터JPA : JPA를 쓰기 편하도록 만들어놓은 모듈
    * 엔티티는 영속성을 가진 객체, 엔티티 매니저는 CRUD&관리, 영속성컨텍스트

## 아키텍처
<img width="700" alt="image" src="https://github.com/user-attachments/assets/c81732b9-f7ed-4ba3-8b7e-0be4248895bf">
<img width="700" alt="image" src="https://github.com/user-attachments/assets/dd032871-f7c7-4a56-af02-e037bb52d19a">

