## 1. Java 단축키 연습

```java
package 데이터;

// 저장 : ctrl + s
// 실행 : ctrl + f11 => 번역(컴파일)--> 실행(run)

public class 인사 {

	public static void main(String[] args) {
		// 주석, comment
		// 단축키 ctrl+/(슬러쉬)
		// 들여쓰기 Tab
		// 자동완성 ctrl+spacebar
		// sysout, syso + 자동완성
		// 기본 출력장치(System.out) : 모니터, 기본 입력장치(System.in) : 키보드
		// . -> 접근 연산자(기호)
		System.out.println("또 만났네요."); //명령어
		System.out.println("또또 만나요.");
	}
```

## 2. 자바 기초

### 1)자바 기초

- 데이터, 간단한 처리(연산, 연산자)
- 순차적 처리, 조건적 처리, 반복문 처리

### 2)자바 기본

- 배열, 부품(class)이 필요

[제목 없음](https://www.notion.so/50e7c7eac74042c18280bfc425e741e0)

## 3. 프로그래밍 하기 위한 프로그램

- IDE : intelJ, eclipse(+ spring);

---

- SDK : 라이브러리(부품들의 묶음 4500), 번역기(컴파일러)+실행기

## 4. DB의 종류

### 1) 정형

Structured, 즉 구조화 돼 있다는 말 그대로 관계형 데이터베이스(RDB), 스프레드시트, CSV등이 있습니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bb362785-132c-460b-a6f2-ddc5cd6caf17/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bb362785-132c-460b-a6f2-ddc5cd6caf17/Untitled.png)

### 2) 반정형

형태(Schema, Meta Data)가 있으며, 연산이 불가능한 데이터를 말해요. 예를들면 XML, HTML, JSON, 로그 형태등이 있습니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8f90a7f6-635e-44ea-a66a-ea15a0f11df9/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8f90a7f6-635e-44ea-a66a-ea15a0f11df9/Untitled.png)

### 3) 비정형

형태가 없으며, 연산도 불가능한 데이터를 말합니다. 예를 들면 소셜데이터(트위치, 페이스북), 영상, 이미지, 음성, 텍스트(word, PDF...) 등이 있습니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e6e4e61-2b4b-4211-ab42-e63fe3f8088c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e6e4e61-2b4b-4211-ab42-e63fe3f8088c/Untitled.png)

> [https://deep-jin.tistory.com/entry/정형-반정형-비정형-데이터](https://deep-jin.tistory.com/entry/%EC%A0%95%ED%98%95-%EB%B0%98%EC%A0%95%ED%98%95-%EB%B9%84%EC%A0%95%ED%98%95-%EB%8D%B0%EC%9D%B4%ED%84%B0)

## 5. 입력, 출력(기본 입,출력 장치)

- System.out - 모니터
- [System.in](http://system.in) - 키보드

## 6. 변수(variable)

- 프로그램을 할 때 다루는 데이터를 저장하는 공간
- 데이타 종류(변수 종류)
    - 숫자형 : 정수형 - 소수점이 아닌 숫자, 실수형 - 소수점이 들어간 숫자
    - 문자형 : 한글자(a, A, 김...)
    - 논리형 : true(참)/false(거짓)

## 7. 기본 데이터(primitive data)

```java
// 컴퓨터에서 다루는 기본데이터 종류
// 문자(1글자) 
// 선언! => 자바는 선언할 때 데이터의 타입을 결정한다.		
char gender; //저장공간에 들어갈 데이터의 유형 + 저장공간의 이름
// 숫자(정수)
int age;
// 숫자(실수)
double temp;

// =(대입, 할당) => 저장공간에 값을 넣는 것. 
gender = '남';
age = 100;
temp = 25.5; //실수자리에 정수를 넣어도 가

// 출력
// + : 결합연산자
System.out.println("gender");
System.out.println("성별: "+gender);
System.out.println("나이: "+age);
System.out.println("온도: "+temp);
```

- 기본데이터의 종류 :  정수(int), 실수(double), 문자(char), 논리(boolean)
- 기본데이터의 반대는 파생데이터(Derived Data)
- 프로그램의 모든 제어는 CPU가 한다.
- CPU가 프로그램을 제어하면서 사용하는 데이터들은  RAM에 넣어두면서 변경한다.
- 기본 데이터는 변수에 해당 유형의 "값"을 넣는다.

```java
int num = 100;
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/51f9dab9-2769-4b53-98f1-e7efe02fdf04/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/51f9dab9-2769-4b53-98f1-e7efe02fdf04/Untitled.png)

- 연습 문제

```java
// 나에 대한 정보
// 내 이름, 나이, 내 몸무게, 성별, 점심	먹었나요?
// 부품은 무조건 대문자.		
String name = "홍길동"; //스트링(문자열)
int age = 100;
double weight = 99.9;
char gender = 'F';
boolean food = true; //false, 부울렌

System.out.println(name);
System.out.println(weight);
System.out.println(age+1);

weight = weight-10;//변수 수가 바뀔때 대입 연산자를 사용해야 변수 값이 변한다.
System.out.println(weight);
```

## 8. 연산자

- CPU가 RAM에 저장된 데이터들을 꺼내서 "간단한 처리", 코드상에서는 기호를 사용하게 된다.
- 기호 ⇒ 연산자
- 연산자의 종류 : 산술 / 비교 / 대입 / 연결 / 논리

### 1)산술연산자

사칙연산자(+, -, *(아스테르크), /), %(나머지)

```java
	// 산술연산자 : 사칙연산자(+, -, *(아스테르크), /), %(나머지)
	int x = 100;
	int y = 200;
	 
	//괄호로 우선순위 주기
	//구분하기 쉽게 명시적으로 표시해주기도 한다.
	System.out.println("두 수의 합은 " + (x + y));
	System.out.println("두 수의 차는 " + (x - y));
	System.out.println("두 수의 곱은 " + (x * y));
	System.out.println("두 수의 나눗셈은 " + (x / y));
	System.out.println("두 수의 나머지는 " + (x % y));
```

### 2)비교연산자

- 비교연산자 : ==(같다), !=(다르다), >(초과,미만), >=(이상,이하)
- 비교결과가 중요(논리데이터, boolean, true/false)

```java
public static void main(String[] args) {
		// 비교연산자 : ==(같다), !=(다르다), >(초과,미만), >=(이상,이하)
		// 비교결과가 중요(논리데이터, boolean, true/false)
		int x = 100;
		int y = 200;
		 
		//괄호로 우선순위 주기
		//구분하기 쉽게 명시적으로 표시해주기도 한다.
		System.out.println(x==y);//false
		System.out.println(x!=y);//true
		System.out.println(x>=y);//fals
		System.out.println(x>y);//false
		System.out.println(x<y);//true

	}
```

### 3)논리연산자

- 논리연산자, 조건이 여러개 있을 때 판단의 기준
- 조건이 모두 만족해야 true(and 조건, &&)
- 조건이 하나만 만족해도 true(or 조건, ||)
- 조건에 해당되지 않을 때 true(not 조건, !)
- 자바에서 비교연산자로 비교가능 한 것은 기본데이터만 제공! (String은 연산자로 비교 불가능)

```java
// 논리연산자, 조건이 여러개 있을 때 판단의 기준
// 조건이 모두 만족해야 true(and 조건, &&)
// 조건이 하나만 만족해도 true(or 조건, ||)
// 조건에 해당되지 않을 때 true(not 조건, !)

// 자바에서 비교연산자로 비교가능 한 것은 기본데이터만 제공!
// String은 연산자로 비교가 불가능하다

// 입력데이터
int id = 1111; // 회원가입은 1111
int pw = 2222; // 회원가입pw는 2000

System.out.println(id == 1111);
System.out.println(pw == 2000);
System.out.println(id == 1111 && pw == 2000);

int manager1 = 5555;
int manager2 = 4444;
System.out.println(manager1 == 5555 || manager2 == 4000);
// 컨트롤 + 쉬프트 + f : 자동 포맷팅(코드 정리)
```

## 9. 반복문 맛보기

```java
// 반복 해보자.
		for (int i = 0; i < 100000; i++) {
			System.out.println("내가 반복됨.");
		}
		
		JOptionPane.showInputDialog("당신의 이름은");
```

## 10. 오늘의 용어

### 1) IDE(Integrated Development Environment)  :

통합 개발 환경 이란 공통된 개발자 툴을 하나의 그래픽 사용자 인터페이스(Graphical User Interface, GUI)로 결합하는 애플리케이션을 구축하기 위한 소프트웨어이다.

> [https://www.redhat.com](https://www.redhat.com/) › topics › middleware › what-is-ide]

### 2) SDK(Software development kit) :

소프트웨어 개발 키트는 일반적으로 소프트웨어 기술자가 사용하여 특정한 소프트웨어 꾸러미, 소프트웨어 프레임워크, 하드웨어 플랫폼, 컴퓨터 시스템, 게임기, 운영 체제 등을 위한 응용 프로그램 등을 만들 수 있게 해주는 개발 도구의 집합이다.

> [https://ko.wikipedia.org/wiki/소프트웨어_개발_키트](https://ko.wikipedia.org/wiki/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4_%EA%B0%9C%EB%B0%9C_%ED%82%A4%ED%8A%B8)

### 3) MSA(Micro-Service Architecture) :

하나의 큰 어플리케이션을 여러개의 작은 어플리케이션으로 쪼개어 변경과 조합이 가능하도록 만든 아키텍쳐

(ex) 미디어 서버 / DB서버 / 웹(HTTP)서버 각각 따로 두는 것 = 서버를 분산시켜서 데이터를 대량으로 다룸)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d00d08b1-b8b6-43d0-b22f-55d3a6e1e4ee/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d00d08b1-b8b6-43d0-b22f-55d3a6e1e4ee/Untitled.png)

> [https://kr.tmaxsoft.com/info/storyTView.do?seq=345](https://kr.tmaxsoft.com/info/storyTView.do?seq=345)
[https://velog.io/@tedigom/MSA-제대로-이해하기-1-MSA의-기본-개념-3sk28yrv0e](https://velog.io/@tedigom/MSA-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0-1-MSA%EC%9D%98-%EA%B8%B0%EB%B3%B8-%EA%B0%9C%EB%85%90-3sk28yrv0e)
