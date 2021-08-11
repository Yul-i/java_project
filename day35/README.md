## 1. 복습

### 1) 생성자

- 기본 생성자는 다른 생성자 메서드가 없으면 자동 생성되지만,
			다른 생성자 메서드가 있으면 자동 생성되지 않는다.
- 생성자를 사용하는 이유
1. 객체 생성시 자동 호출 되므로, 생성할 때 자동으로 꼭 실행해주고 싶은 부분이 있으면 생성자에 넣어주면 자동 실행됨.

    2. 객체생성시 입력값에 대한 제약조건을 걸고 싶은 경우

## 2. 클래스 다이어그램

### 1) UML(Unified Modeling Language)

- 통합 모델링 언어를 사용하여 시스템 상호작용, 업무흐름, 시스템 구조, 컴포넌스 관계 등을 그린 도면입니다.
- UML다이어그램을 사용하는 이유는 프로그래밍을 단순화 시켜 표현하여 의사소통하기 좋고 또 대규모 프로젝트 구조의 로드맵을 만들거나 개발을 위한 시스템 구축에 기본을 마련합니다.

> [https://m.blog.naver.com/icbanq/221781238065](https://m.blog.naver.com/icbanq/221781238065)

### 2) ObjectAid  설치

> [https://www.objectaid.com/install-objectaid](https://www.objectaid.com/install-objectaid)

In the 'Add Repository' dialog, enter this information and press 'OK':

Name: ObjectAid UML ExplorerURL: http://www.objectaid.com/update/current

- 생성시 New - Object 검색
- 모두 체크해주고 파일명을 지정해준다.
- 프로젝트 트리에 ucls 파일이 생긴 모습이다.
- 패키지와 클래스를 마우스로 끌어쓴다.
- ctrl+s하면 png로 저장됨

## 3. 상속

### 1) 상속(inheritance)이란?


- 상속(inheritance)이란 기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것을 의미합니다.
- 상속은 캡슐화, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징 중 하나입니다.
- 상속을 이용하면 기존에 정의되어 있는 클래스의 모든 필드와 메소드를 물려받아, 새로운 클래스를 생성할 수 있습니다.

---

- 기존에 정의되어 있던 클래스를 부모 클래스(parent class) 또는 상위 클래스(super class), 기초 클래스(base class)라고도합니다.
- 상속을 통해 새롭게 작성되는 클래스를 자식 클래스(child class) 또는 하위 클래스(sub class), 파생 클래스(derived class)라고도 합니다.


### 2) 상속의 장점

자바에서 클래스의 상속은 다음과 같은 장점을 가집니다.

1. 기존에 작성된 클래스를 재활용할 수 있습니다.

2. 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 됩니다.

3. 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련합니다.

> [http://tcpschool.com/java/java_inheritance_concept](http://tcpschool.com/java/java_inheritance_concept)

### 3) 코드 작성해보기

- UML

- Person.java

```jsx
package 상속;

public class Person extends Object {
	//상태(속성), 멤버변수
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//동작, 멤버메서드를 정의
	
	public void think() {
		System.out.println("생각하다.");
	}
	
	public void tool() {
		System.out.println("도구를 이용하다.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
		
}
```

- Man.java

```jsx
package 상속;

//Person 클래스를 확장해서(상속, 재사용) Man 클래스를 정의하겠다.
//			Man extends Person			
public class Man extends Person{
	//멤버변수 2개 
	//멤버 메소드 2개
	
	int power;
	
	//생성자가 하나도 정의되어 있지 않으면, 기본 생성자가 자동으로 만들어진다.
	//public Man(){
	//	}
	public void run() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}
```

- SuperMan.java

```jsx
package 상속;

public class SuperMan extends Man{
	//멤버 변수 3개
	//멤버 메서드 3개
	
	//다른 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어진다.
	boolean fly;
	
	public void space() {
		System.out.println("우주를 날아다니다.");
	}

	@Override //부모 클래스로 부터 받은 메서드를 덮어써버림. 오버라이드, Overwrite
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
```

- SuperManUser.java

```jsx
package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.name = "클라크"; //Person
		sMan.age = 300; //Person
		sMan.power = 3000; //Man
		sMan.fly = true; //SuperMan
		
		System.out.println(sMan);
		sMan.think();
		sMan.tool();
		sMan.run();
		sMan.space();
		
	}

}
```

## 4. Servlet, 서블릿

### 1) 서블릿이란?

- 자바 서블릿은 자바를 사용하여 웹페이지를 동적으로 생성하는 서버측 프로그램 혹은 그 사양을 말하며, 흔히 "서블릿"이라 불린다.
- 자바 서블릿은 웹 서버의 성능을 향상하기 위해 사용되는 자바 클래스의 일종이다.
- **클라이언트 요청을 처리하고 그 결과를 다시 클라이언트에게 전송하는 Servlet 클래스의 구현 규칙을 지킨 자바 프로그램**

> [https://jusungpark.tistory.com/15](https://jusungpark.tistory.com/15)

### 2) 서블릿 생성

- New - Servlet 으로 생성한다.

- 처음 생성시 이렇게 어마한 코드가 나타난다.

```jsx
package webpage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
```

- 메서드 설명

doGet() : 클라이언트 HTTP GET 요청에 대해 처리.
doPost() : 클라이언트 HTTP POST 요청에 대해 처리.
doPut() : 클라이언트 HTTP PUT 요청에 대해 처리.
doDelete() : 클라이언트 HTTP DELETE 요청에 대해 처리.
init() : 서블릿의 생명주기 처리로 가장처음에 실행.
destory() : 서블릿의 생명주기 처리로 서블릿 객체를 메모리에서 제거할때 마지막으로 실행.

- 서블릿 생명주기

서블릿 생명주기 (servlet Life Cycle)
서블릿 생성 -> init() -> { service() -> doXxx() } -> destory() -> 서블릿 종료 ( {} 반복 )

> [https://jusungpark.tistory.com/15](https://jusungpark.tistory.com/15)

- 이중 doGet만 사용해보자

```jsx
package webpage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MYWeb
 */
@WebServlet("/my.page")
public class MYWeb extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("This is a my page!!");
	}

}
```
