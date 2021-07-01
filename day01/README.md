```java
package start;//항상 맨 위에는 package이름이 와야한다.

public class Hello {

	public static void main(String[] args) {//class안에 main은 1개만
		// main 함수에 처리내용을 넣어보자.
		//System은 컴퓨터를 가리킴.출력.프린트!
		System.out.println("나는 자동완성 입니다.!!!");//ln은 line 자동 엔터
		System.out.println("환영합니다.");
		System.out.print("반갑습니다.");
		//syso, sysout + 컨트롤 + 스페이스바
	}

}
```

## 1.JDK(Java Develoment Kit)설치

- 주로 8버전 사용함.
- IDE 를 설치하기 전에 JDK 부터 사전 설치 해야함.

## 2. Eclipse 설정

- General-workspace에서MS949를 UTF-8로 변경
- JDK 언어가 15로 자동 설정되어 있으므로 8로 바꿔준다.
- Show heap status 에 체크를 해준다.
- 이클립스 램 크기 설정(사양의 반 정도로)

## 3. 자바는 부품 조립식 코드

---

1. JDK의 4500여가지의 부품을 사용한다.
2. internet에서 부품을 가져온다 - ex)MVN 저장소

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/27e3b91a-143e-442b-8b0f-488655306f2f/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/27e3b91a-143e-442b-8b0f-488655306f2f/Untitled.png)

3. making , 직접 만든다 - Main역할(클래스 안에 1개만 들어감)

## 4. 파일 생성

- 패키지 생성(이름은 소문자), 패키지에 아무런 클래스가 없으면 비어있는 아이콘으로 뜸
- 클래스 생성(이름은 대문자로 시작)
- src 폴더에 생성한다.

## 5. 자바 파일의 구성

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02720259-4bcf-4bc9-8a28-3431be87e7ca/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/02720259-4bcf-4bc9-8a28-3431be87e7ca/Untitled.png)

## 6. 오늘의 용어

### 1) 싱글톤(Sigleton Pattern)

애플리케이션이 시작될 때 어떤 클래스가 **최초 한번만** 메모리를 할당하고(Static) 그 메모리에 인스턴스를 만들어 사용하는 디자인패턴.

생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나고 최초 생성 이후에 호출된 생성자는 최초에 생성한 객체를 반환한다. (자바에선 생성자를 private로 선언해서 생성 불가하게 하고 getInstance()로 받아쓰기도 함)

=> 싱글톤 패턴은 단 하나의 인스턴스를 생성해 사용하는 디자인 패턴이다.

(인스턴스가 필요 할 때 똑같은 인스턴스를 만들어 내는 것이 아니라, 동일(기존) 인스턴스를 사용하게함)

> [https://jeong-pro.tistory.com/86](https://jeong-pro.tistory.com/86)

### 2) 프로토타입(Prototype)

Prototype은 '원형' 이라는 의미로, 원형이 되는 인스턴스로 새로운 인스턴스를 만드는 방식, 즉 객체에 의해 생성될 객체의 타입이 결정되는 생성 디자인 패턴입니다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d117e4bd-68dd-4521-9a36-4cb93322f847/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d117e4bd-68dd-4521-9a36-4cb93322f847/Untitled.png)

> [https://lee1535.tistory.com/76](https://lee1535.tistory.com/76)
