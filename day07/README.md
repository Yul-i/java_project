## 1. 반복조건

### 1) continue

- 계속 해라! 반복은 계속 하지만 밑에 코드는 돌리지마
- 반복문을 계속 하라는 의미, 조건에 맞는 경우 아래에 있는 코드는 더이상 실행x
- 제외의 의미
- braek의 반대

```java
int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;

			}
			if (sum2 > 20 ) {
				System.out.println("20보다 합이 크므로 stop!");
				break;
			}
			sum2 = sum2 + i;
```

- 예시 문제

```java
// 문제 2.
		// 1부터 1000까지 중 3씩 점프해 더해주세요.
		// 만약 더한 값이 100이 넘으면 더하기를 종료.
		// 5의 배수는 더하지 않습니다.

		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum > 100) {
				System.out.println("더하기를 종료");
				break;// for문 종료
			}
			if (i % 5 == 0) {
				continue;//이번 횟수가 제외하고 for문은 개속 돌아용
			}
			sum = sum + i;
			count++;
			System.out.println(i + ": " + sum);
			System.out.println(count);
		}
```

## 2. 변수에 누적

- 예시

```java
// 1-10까지 더해봅시다.
		int sum = 0; //초기값 넣어주기.
		for (int i = 1; i <= 10000; i++) {
			// 1+2+3+...
			sum = sum + i;//1=0+1
						  //3=1+2
						  //6=3+3
		}
		System.out.println(sum);
```

- 예시2

```java
// 문제 1
		// 33~222 모두 더해주세요.
		int sum1 = 0;
		for (int i = 33; i <= 222; i++) {
			sum1 = sum1 + i;
			System.out.println(i+": "+sum1);
		}
		System.out.println(sum1);

		// 문제 2
		// 55~4500 2씩 점프하면서 더해주세요.
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
//			System.out.println(i+":"+sum2);
		}
		System.out.println(sum2);

		// 문제 3
		// 0~6000, 5씩 점프하면서 더해주세요.
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
//			System.out.println(i+":"+sum3);
		}
		System.out.println(sum3);
```

- 인기투표

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5cdc45a-29b1-48e4-aa0f-919a53196175/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5cdc45a-29b1-48e4-aa0f-919a53196175/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5e3407c-6b29-4ded-aa0e-cb4949ab8702/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d5e3407c-6b29-4ded-aa0e-cb4949ab8702/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae5a9b2c-5073-4564-a932-6bf843320e0b/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae5a9b2c-5073-4564-a932-6bf843320e0b/Untitled.png)

## 3. 콘솔입력스캐너

### 1) Scanner

```java
package 누적연습;

import java.util.*;
//import java.util.*; //*은 모든 것, 임포트 할때 
// java.util.a.Test //이거꺄지 * 인식 못해서 따로 써줘야댕 하위 패키지는 다시 써줘야함

public class 콘솔입력스캐너 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//scanner은 자바 유틸리티다.
		System.out.print("당신의 이름을 입력해주세요.>");
		String name = sc.next(); //String 입력(공백이 있으면 뒤는 무시해버림:단어)
		System.out.print("당신의 소속을 입력해주세요.>");
		String team = sc.next();
		System.out.println("당신의 이름은 : "+name);
		System.out.println("당신의 소속은 : "+team);
		
	}

}
```

- 예시 하나 더

```java
Scanner sc = new Scanner(System.in);

		
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 "+(age+1)+"세");
		System.out.print("키를 입력>>");
		double height = sc.nextDouble();
		System.out.println("내년 키는 "+(height+10));
		System.out.print("저녁을 먹었는지 입력(true/false)>> ");
		boolean night = sc.nextBoolean();
		if (night) {//if는 true면? 이라서  true=1, false=0
			System.out.println("배가 부르시겠군요!");
		}else {
			System.out.println("배가 고프시겠군요!");
		}
		sc.nextLine();//앞의 엔터 인식하니까 하나 더 넣어줘야 한다.
		System.out.print("올해의 목표는>> ");
		String say = sc.nextLine();
		System.out.println("올해의 목표는 "+say+" !!!");
```

- 예시 둘

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/305bd16b-ae55-4f25-8bb1-a335366ef69d/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/305bd16b-ae55-4f25-8bb1-a335366ef69d/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8cf05b8c-e332-48d5-afca-4a190262774e/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8cf05b8c-e332-48d5-afca-4a190262774e/Untitled.png)

## 4. equal(==) 와 equals

==연산자와 String클래스의 equals()메소드의 가장 큰 차이점은 

== 연산자는 비교하고자 하는 두개의 대상의 주소값을 비교하는데 반해 

String클래스의 equals 메소드는 비교하고자 하는 두개의 대상의 값 자체를 비교합니다.

## 5. 데이터의 크기

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0c871a54-e3e5-4cf9-ba27-e9e672f00174/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0c871a54-e3e5-4cf9-ba27-e9e672f00174/Untitled.png)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7c4be8c2-41f5-4a31-9d33-bdf8d69a5d87/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7c4be8c2-41f5-4a31-9d33-bdf8d69a5d87/Untitled.png)

> [https://m.blog.naver.com/satyee/140127143696](https://m.blog.naver.com/satyee/140127143696)

- boolean : 1bit
- char : 2byte
- int : 4byte
- String : 8byte

## 6. 오늘의 용어

### 1) 유틸리티

유틸리티 소프트웨어는 컴퓨터 소프트웨어의 하나로, 컴퓨터의 동작에 필수적이지는 않지만 컴퓨터를 이용하는 주 목적에 대한 부차적인 일부 특정 작업을 수행하는 소프트웨어를 두루 가리킨다.

> [https://ko.wikipedia.org/wiki/유틸리티_소프트웨어](https://ko.wikipedia.org/wiki/%EC%9C%A0%ED%8B%B8%EB%A6%AC%ED%8B%B0_%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4)

### 2) 단위테스트(Unit Test)

단위 테스트(Unit Test)는 하나의 모듈을 기준으로 독립적으로 진행되는 가장 작은 단위의 테스트이다. 여기서 모듈은 애플리케이션에서 작동하는 하나의 기능 또는 메소드로 이해할 수 있다. 예를 들어 웹 애플리케이션에서 로그인 메소드에 대한 독립적인 테스트가 1개의 단위테스트가 될 수 있다.

즉, 단위 테스트는 애플리케이션을 구성하는 하나의 기능이 올바르게 동작하는지를 독립적으로 테스트하는 것으로, "어떤 기능이 실행되면 어떤 결과가 나온다" 정도로 테스트를 진행한다.

### 3) 통합 테스트(Integration Test)

통합 테스트(Integration Test)는 모듈을 통합하는 과정에서 모듈 간의 호환성을 확인하기 위해 수행되는 테스트이다.

일반적으로 애플리케이션은 여러 개의 모듈들로 구성이 되고, 모듈들끼리 메세지를 주고 받으면서(함수 호출) 기능을 수행한다. 그렇기에 통합된 모듈들이 올바르게 연계되어 동작하는지 검증이 필요한데, 이러한 목적으로 진행되는 테스트가 통합 테스트이다. 그렇기에 통합 테스트는 독립적인 기능에 대한 테스트가 아니라 웹 페이지로부터 API를 호출하여 올바르게 동작하는 지를 확인하는 것이다.

> [https://mangkyu.tistory.com/143](https://mangkyu.tistory.com/143)
