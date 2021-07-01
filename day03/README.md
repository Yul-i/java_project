## 1. 복습

### 1) 변수 선언 순서

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ff3f6f34-8654-44fb-a40a-d0d96cb91e59/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ff3f6f34-8654-44fb-a40a-d0d96cb91e59/Untitled.png)

1 : 선언

2 , 3 : 대입

### 2) 기본데이터(원시데이터)

- 정수-int, 실수-double, 문자(1자)-char, 논리-boolean
- ' = ' 사용 가능(파생데이터는 사용 불가)

### 3) 연산자

- 산술 연산자(사칙연산 + - * / % )
- 비교연산자(== ≠ ≥ > ≤ <) ⇒논리데이터(true/false)
- 논리연산자(&& || !)

## 2. 정수와 실수의 변환

- 정수와 정수의 계산은 무조건 정수로 나온다.
- 하나라도 실수면 무조건 실수의 결과가 나온다.
- 캐스팅(casting) : cpu가 원래 데이터의 타입을 강제로 다른 타입으로 변환하는 것

(double)count;

- 예시

```java
int x = 111;
int y = 222;

System.out.println("두 수의 합은 " +(x + y));
System.out.println("두 수의 나눗셈은 " +(x / y));

//		int sum = 333;
int sum = x+y;
int avg1 = sum/2;

System.out.println("평균은 " + avg1);
// 자바에서는 정수와 정수의 계산은 무조건 정수로 나온다.

//자바에서는 하나라도 실수면 무조건 실수의 결과가 나온다.
double avg2 = sum / 2.0;
System.out.println("평균은 " + avg2);

int count = 2;
avg2 = sum / (double)count;
//casting, 캐스팅 : cpu가 원래 데이터의 타입을 강제로 다른 타입으로 변환하는 것
//강제로 타입 변환, 강제형변환
// (double)count; 
System.out.println("평균은 " + avg2);

int x2 = 22.0;//작은 바이트 할당했는데 더 큰 숫자를 넣으려니 소화가 안됨ㅠㅠ
double y2 = 22;//22? 용량 되니까 넣을수있지
```

## 3. 변수의 초기화

- 최초로 값을 저장하는 행위를 **변수**를 **초기화**한다. 라고 표현한다....**그렇다면 초기화는 도대체 무엇을 말하는 것인가?**

1. **초기화**는 NULL값을 임의의 값으로 처음 지정해주는 것을 말한다.
2. **변수**이름 = 내용물;

```java
int x = 0;
String s = null;
```

## 4. 제어문

### 1) 순차문 : 데이터 입력 → 처리 → 결과출력

- 위에서 아래로
- 왼쪽에서 오른쪽으로
- 우선순위를 바꾸려면 괄호 (  ) 를 사용한다.
- + or - < * or /

### 2) 조건문

- if/else

```java
int temp = 25;
		if (temp > 27) { //()안에는 비교 연산자가 들어감
			//조건이 true 이면 실행 시키고 싶은 코드 작성
			JOptionPane.showMessageDialog(null, "에어컨ON");
		}else {
			//조건이 false 이면 실행 시키고 싶은 코드 작성
			JOptionPane.showMessageDialog(null, "에어컨OFF");
		}
```

```java
int x = 111;
		int y = 222;
		// x>y 면 x가 더 커요.
		// 그게 아니라면, y가 더 크거나 같아요.

		if (x > y) {
			JOptionPane.showMessageDialog(null, "x가 더 커요.");
		} else {
			JOptionPane.showMessageDialog(null, "y가 더 크거나 같아요.");
		}
```

### 3) 반복문

- for

```java
for (int i = 0; i < 3; i++) {
			System.out.println("밥을 먹자");
		}
```

## 5. Swing 입력(JOptionPane.showInputDialog)

```java
// 당신이 있는 강의실 호수는?
// 당신은 709호에 있습니다.

String classNum = JOptionPane.showInputDialog("당신이 있는 강의실 호수는?");
System.out.println("당신은 "+classNum+"호에 있습니다.");

// 당신의 점심 메뉴는?
// 당신은 자장면을 먹는 군요.

String lunch = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
System.out.println("당신은 "+lunch+"을 먹는 군요.");
```

## 6. 오늘의 용어

### 1) 크롤링

크롤링(crawling) 혹은 스크레이핑(scraping)은 웹 페이지를 그대로 가져와서 거기서 데이터를 추출해 내는 행위다. 크롤링하는 소프트웨어는 크롤러(crawler)라고 부른다.

> [https://namu.wiki/w/크롤링](https://namu.wiki/w/%ED%81%AC%EB%A1%A4%EB%A7%81)

### 2) 절차지향 프로그래밍(Procedural Programming)

절차지향 프로그래밍이란 물이 위에서 아래로 흐르는 것처럼 순차적인 처리가 중요시 되며 프로그램 전체가 유기적으로 연결되도록 만드는 프로그래밍 기법입니다. 대표적인 절차지향 언어에는 C언어가 있다.

### 3)객체지향 프로그래밍(Object Oriented Programming)

객체지향의 정의를 살펴보면 객체지향이란 실제 세계를 모델링 하여 소프트웨어를 개발하는 방법입니다. 객체지향 프로그래밍에서는 데이터와 절차를 하나의 덩어리로 묶어서 생각하게 됩니다. 이는 마치 컴퓨터 부품을 하나씩 사다가 컴퓨터를 조립하는 것과 같은 방법입니다. 대표적인 객체지향 언어에는 JAVA가 있습니다.

> [https://brownbears.tistory.com/407](https://brownbears.tistory.com/407)

### 4) 플러그인(Plug-in)

플러그인(plugin) 또는 추가 기능(애드인;add-in, 애드온;add-on)은 호스트 응용 프로그램과 서로 응답하는 컴퓨터 프로그램이며, 특정한 "주문식" 기능을 제공한다.

> [https://ko.wikipedia.org/wiki/플러그인](https://ko.wikipedia.org/wiki/%ED%94%8C%EB%9F%AC%EA%B7%B8%EC%9D%B8)
