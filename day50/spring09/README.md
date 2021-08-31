## 2. Spring MVC

- index.jsp

```html
<form action="login.mega">
		id : <input name="id"><br>
		pw : <input name="pw"><br>
		<button>로그인 처리 요청</button>
</form>
```

- MemberController.java

```java
@Autowired //자동연결
	MemberDAO dao; //스프링이 만들어놓은 싱글톤 객체의 주소를 넣어준다.
	
	//요청 주소 하나당 메서드 하나
	@RequestMapping("login.mega")
	public String login(MemberDTO memberDTO) {
		System.out.println(memberDTO);
		System.out.println("싱글톤으로 만들어진 주소 프린트 : "+ dao);
		boolean result = dao.login(memberDTO);
		if (result) {
			return "ok"; //views/ok.jsp
		}else {
			return "no"; //vies/no.jsp
		}
	}
```

- MemberDAO.java

```java
@Repository //싱글톤으로 만들어준다. //싱글톤으로 만들어줄 객체가 아니면 어노테이션 달면 안됨.
public class MemberDAO {
	//DAO는 무조건 싱글톤으로 만들어 주어야 한다.
	//잘 사용하지 않는 DB는 프로토로 만들어도 됨
	public boolean login(MemberDTO dto) {
		//컨트롤러의 메서드 내에 선언된 파라메터는 무조건 프로토타입으로 만들어진다.
		
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; //컨트롤러에 결과를 알려주기 위한 변수
		
		if (dto.getId().equals(dbId)&&dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}
```

- views/ok.jsp, views/no.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="green">
	<h1>ok!!!!!</h1> 
</body>
</html>
```

### 2) Front Controller, DispatcherServlet

**DispatcherServlet**이란?

- Spring MVC에서 프론트 컨트롤러 패턴을 구현한 Servlet이다.


**Front Controller**란?

- Front Controller가 없었던 시절에는 REST API를 구현할 때, 한 개의 URL에 한 개의 서블릿이 매핑되는 구조였다.
- 이 구조는 매 서블릿을 구현할때마다 중복되는 소스가 발생하였다. 예를 들어 서블릿에서 처리한 결과를 JSP에 넘기기 위해, RequestDispatcher에 forward를 해주는 로직은 매번 필요한 작업이었다.
- 또한, 컨트롤러의 테스트 코드를 작성할 때, 서블릿에 의존되어 순수한 자바 코드로 단위 테스트가 불가능했다.
- 하지만 프론트 컨트롤러라는 서블릿이 컨트롤러 앞에 수문장 역할을 하면서 컨트롤러의 공통영역을 처리해주고 컨트롤러를 순수한 자바로 만들어 주었다.
- 프론트 컨트롤러가 없으면 모든 컨트롤러는 서블릿으로 구현되어야 했다. **프론트 컨트롤러가 서블릿으로서 모든 요청을 받고 이에 알맞는 컨트롤러를 찾아 호출해주는 역할을 함으로서 자연스럽게 컨트롤러는 서블릿으로 구현하지 않아도 된다.**
- 또한 프론트 컨트롤러는 호출하는 컨트롤러에 HttpServletRequest와 HttpServletResponse를 직접 넘기지 않고 Map과 Model 또는 ModelAndView를 직접 생성하여 컨트롤러에 넣어줌으로 인해서 컨트롤러가 서블릿에 의존하지 않도록 해준다.
- 이렇게 프론트 컨트롤러 패턴을 구현하면 여러가지 장점을 가질 수 있고 Spring에서 프론트 컨트롤러를 구현한 서블릿 이름이 DispatcherServlet이다.


### 3) Annotation

- 어노테이션은 코드 사이에 주석처럼 쓰여서 특별한 의미, 기능을 수행하도록 하는 기술이다.
- 즉, 프로그램에게 추가적인 정보를 제공해주는 메타데이터(meta data: 데이터를 위한 데이터)라고 볼 수 있다.
- 어노테이션의 용도
    1. 컴파일러에게 코드 작성 문법 에러를 체크하도록 정보를 제공
    2. 소프트웨어 개발툴이 빌드나 배치시 코드를 자동으로 생성할 수 있도록 정보 제공
    3. 실행시(런타임시)특정 기능을 실행하도록 정보를 제공

> [https://honeyinfo7.tistory.com/56](https://honeyinfo7.tistory.com/56)

- 지금까지 사용해본 어노테이션 종류
    - @Controller : 싱글톤객체 생성, 스프링에 컨트롤러로 등록
    - @Repository : 싱글톤객체 생성, 스프링에 모델로 등록(DB처리 클래스로 등록)
    - @Autowired : 싱글톤객체 생성된 것 중에 해당 타입의 객체의 주소를 넣어줌.
    (데이터 타입을 가지고 찾아줌.)
    - @RequestMapping : 요청한 주소와 맵핑되는 것을 찾아서 아래 정의된 메서드를 호출

## 3. 코드연습

- movie.jsp

```html
<form action="movie.do">
		영화 제목 : <input name="mvName">
		영화관람표 : <input name="mvCost">
		<button>결제하기</button>
</form>
```

- MovieController.java

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;
	
	@RequestMapping("movie.do")
	public String movie(String mvName, int mvCost) {
		System.out.println("영화 이름: "+mvName+", 가격 : "+mvCost);
		if (mvCost>=10000) {
			return "pay";
		}else {
			return "redirect:movie.jsp";
		}
	}
	
	@RequestMapping("pay.do")
	public void moviePay() {
		dao.pay();
	}
}
```

- MovieDAO.java

```java
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAO {
	public void pay() {
		System.out.println("결제처리를 DB에 저장함");
	}
}
```

- views/pay.jsp

```html
<h2>결제하는 화면 입니다.</h2>
<a href=pay.do>결제하기</a>
```
