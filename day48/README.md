## 1. 복습

### 1) MVC2 파일 이동 구조

1. webapp 아래에 있는 jsp 페이지는 클라이언트만 요청할 수 있다.
jsp만 올 수 있다.(html은 불가)
2. 클라이언트가 브라우저를 통해서 요청을 하게 된다.
me.jsp를 호출함.
3. 서버에서는 클라이언트가 요청한 me.jsp를 webapp아래에서 찾음.
4. 찾은 jsp 페이지를 실행시킨 후, html를 만든다, 이 html을 브라우저에 전송한다.
5. 브라우저가 받은 html을 실행 시킴. 화면에 html이 나타남.
6. form에 입력 후, 입력한 데이터를 서버에 주면서 서버에 요청을 해야함.
7. 서버에서는 클라이언트가 입력한 정보를 받아서 dto를 만든 후 넣어야 하고, 이 dto의 데이터를 DB에 넣는 처리를 해야 함
8. 받아서 DB처리 하는 부분은 컨트롤러에 구현해야함.
9. 컨트롤러를 사용해야 하는 요청은 가상의 주소를 만들어서 요청해야 함
10. 컨트롤러 안에 @requestMapping 중에서 가상의 주소와 맵핑되는 것을 찾아서 그 아래에 있는 메서드를 호출한다.
11. 메서드 안에 DTO 변수를 입력 파라메터로 설정해놓으면 DTO를 만들어서 서버에서 받은 값들을 DTO에 다 넣어준다.
12. DB 처리하는 경우 DTO를 입력값으로 처리함
13. 처리결과를 클라이언트에 알려주기 위해 views 아래에 jsp파일을 만들어 놓으면, 자동 호출됨.
14. views아래에 자동 호출되는 jsp페이지는 요청주소가 in.mega인 경우 in.jsp를 찾음.
15. Views/in.jsp를 실행 후 html을 만들어서 클라이언트에 응답!

### 2) MVC 구조

- 객체지향 설계 중 현재 가장 많이 사용하는 설계 방법(MVC)

---

M(model) : 특정한 방법과 절차를 가지고 처리하는 클래스(class)
v(view) : 클라이언트, 브라우저에 보여지는 부분(html로 이루어진 jsp)
c(control) : 제출된 데이터를 어떻게 할 것인가 제어(class)

---

MVC1 : M,V,C가 각각 분리되지 못한 채 혼재되어 있는 설계
MVC2 : M,V,C가 각각 완벽하게 분리되어 있는 설계

### 3) 예시 코드

- product.jsp

```html
<body>
	<h3>제품 입력</h3>
	<form action="productInsert">
		제품 번호 : <input type="text" name="pNo"><br>
		제품 이름 : <input type="text" name="name"><br>
		제품 설명 : <input type="text" name="content"><br>
		등록 날짜 : <input type="date" name="date"><br>
		<button type="submit">제품 등록</button>
	</form>
</body>
```

- ProductController.java

```java
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("productInsert")
	public void insert(ProductDTO dto) {
		System.out.println("받아온 값 결과 : " + dto);
	}
}
```

- views/productInsert.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>제품 등록 결과</h3>
	<hr>
	제품 번호 : ${productDTO.pNo}
	제품 이름 : ${productDTO.name}
	제품 설명 : ${productDTO.content}
	등록 날짜 : ${productDTO.date} //<% bbsDTO.getbNo() %>
</body>
</html>
```

## 2. ProtoType 패턴& Singleton 패턴

### 1) 프로토타입 패턴


- 프로토타입 패턴은 기본 원형이 되는 인스턴스를 사용해서 생성할 객체의 종류를 명시하고 이렇게 만들어진 객체를 복사해서 새로운 객체를 생성하는 패턴이다.
- 프로토타입 패턴을 사용하면 프로토타입으로 생성되는 인스턴스를 복사하는 것 만으로도 마치 새로운 인스턴스를 생성하는 효과를 얻을 수 있다.

> [https://sup2is.github.io/2020/06/23/prototype-pattern.html](https://sup2is.github.io/2020/06/23/prototype-pattern.html)

- 예제 코드

- SingleObject.java

```java
public class SingleObject {
	static int count;
	
	public SingleObject() {
		System.out.println("SingleObject객체 생성됨");
		count++;
	}
}
```

- SingUser.java

```java
public class SingUser {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			SingleObject single1 = new SingleObject();
			
		}
		System.out.println(SingleObject.count+"개");
		System.out.println(SingleObject.count*8+4+"byte");
	}

}
```

- 콘솔 결과

```java
...
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
SingleObject객체 생성됨
1000개
8004byte
```

- **프로토타입에서 생성되는 객체는 각자 다른 참조 주소를 가지고 있다.**

- One1.java

```java
public class One1 {
	static int count;
	
	public One1() {
		count++;
		System.out.println("one1 객체 생성함");
	}
}
```

- One1Main.java

```java
public class One1Main {

	public static void main(String[] args) {
		One1 o1 = new One1();
		One1 o2 = new One1();
		
		System.out.println("o1의 주소: "+o1);
		System.out.println("o2의 주소: "+o2);
	}
}
```

- 콘솔

```java
one1 객체 생성함
one1 객체 생성함
o1의 주소: com.mega.mvc07.test.One1@15db9742
o2의 주소: com.mega.mvc07.test.One1@6d06d69c
```

### 2) 싱글톤 패턴

- 어떤 클래스가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 객체를 만들어 사용하는 디자인 패턴
- 생성자의 호출이 반복적으로 이뤄져도 실제로 생성되는 객체는 최초 생성된 객체를 반환 해주는 것이다.

> [https://elfinlas.github.io/2019/09/23/java-singleton/](https://elfinlas.github.io/2019/09/23/java-singleton/)

- 예제 코드
- SingleObject2.java

```java
public class SingleObject2 {
	static int count;
	static SingleObject2 object;//주소 넣어주려공!
	
	private SingleObject2() {
		System.out.println("SingleObject객체 생성됨");
		count++;
	}
	
	//싱글톤은 객체를 하나만 만들고, 더이상 만들지 않는 방법
	//getInstance라는 static 메서드를 만들어서
	//객체가 이미 만들어졌는지 체크를 하게 된다.
	public static SingleObject2 getInstance() {
		if(object == null ) {
			//object이 null이라는 것은 아직 객체가 하나도 안만들어 졌다라는 의미
			//객체가 만들어지면 주소가 들어가야하는데 null이 들어가있기 때문
			object = new SingleObject2();
		}else {
			//object이 null이 아니라면, 객체가 만들어져서 주소가 들어갔다라는 의미
		}
		return object;
	}
	
}
```

- SingUser2.java

```java
public class SingUser2 {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			//SingleObject2 single2 = new SingleObject2();
			SingleObject2 single2 = SingleObject2.getInstance();
			
		}
		System.out.println(SingleObject2.count+"개");
		System.out.println(SingleObject2.count*8+4);
	}

}
```

- 콘솔

```java
SingleObject객체 생성됨
1개
12byte
```

- 싱글톤 패턴은 객체를 여러번 불러도 하나의 참조 주소를 가지고 있다.

- 예제 코드
- One2.java

```java
public class One2 {
	static int count;
	static One2 object;
	
	private One2() {
		count++;
		System.out.println("one1 객체 생성함");
	}
	
	public static One2 getInstance() {
		if (object==null) {
			object = new One2();
		}
		return object;
	}
}
```

- One2Main.java

```java
public class One2Main {

	public static void main(String[] args) {
		One2 o1 = One2.getInstance();
		One2 o2 = One2.getInstance();
		
		System.out.println("o1의 주소: "+o1);
		System.out.println("o2의 주소: "+o2);
	}

}
```

- 콘솔

```java
one1 객체 생성함
o1의 주소: com.mega.mvc07.test.One2@15db9742
o2의 주소: com.mega.mvc07.test.One2@15db9742
```

### 3) 개념 정리

- 프로토타입은 메서드를 부를때마다 객체를 생성하면 메모리를 많이 잡아 먹게 된다.
boy1의 메서드는 2x8+4 = 20byte
boy2의 메서드는 1x8+4 = 12byte

- 싱글톤 패턴은 어떤 클래스가 최초에 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어 사용하는 디자인 패턴인데,
DTO는 객체 하나하나를 담기위한 수단(프로토는 사용하고 버릴수있는데)
DAO는 데이터를 조작하는 객체이므로 속성이 변경되거나 하는 일이 없음.(싱글톤은 서버가 살아있는 한 싱글톤 계속 살림)

- 싱글톤 꼭 해줘야 하는것 : DAO, 컨트롤러
