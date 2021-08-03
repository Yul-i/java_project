## 1. 복습

### 1) 자바 내장 객체(built-in object)

- 미리 객체를 만들어서 제공
- request, response, session, out, application

### 2) 자바스크립트 내장 객체

- location, window, document, history, console
- 

### 3) response

- 서버가 클라이언트에게 특정한 처리를 하라고 명령할 때 사용

### 4) request

- 클라이언트로 부터 넘어온 데이터를 받을 때 사용

## 2. 생각 정리

### 1) 네크워크 연결에서 비연결성 이란?

- 요청에 대한 응답을 처리하게 되면 연결을 끊어 버린다.
- HTTP는 연결을 유지하지 않은 채 응답과 요청을 처리함. 요청에 대한 응답을 처리하게 되면 연결을 끊어버림

### 2) 네트워크 연결에서 무상태성 이란?

- 비 연결성 특징으로 인해 이전에 저장했던 상태값을 계속 가지고 있을 수 없음.
- 이전의 정보가 남아있지 않다.

### 3) 네크워크 연결셰어 상태를 저장하기 위한 2가지 기술은?

- 세션, 쿠키

### 4) 세션과 쿠키의 차이점은?

- 세션 : 서버의 램에 저장, 하나씩 저장했다가 하나씩 꺼내쓸 수 있음, 저장하는 타입 아무거나 괜찮음
- 쿠키 : 클라이언트의 브라우저에 저장, 하나씩 저장했다가 전체를 서버에서 가져와서 꺼내 써야한다.
데이터 타입은 모두 String이다.

### 5) 일반적으로 세션이란?

- 네트워크 연결에서 클라이언트가 서버에 연결하는 하나의 단위
- 연결이 완벽히 끊기기 전까지의 연결의 단위

### 6) 웹프로그램에서 세션이란?

- 브라우저가 닫히기 전까지의 서버와의 연결(자동으로 세션 종료)
- 로그아웃하는 경우(수동으로 세션 종료)

## 3. 쿠키(Cookie)

### 1) 크롬에서 쿠키 확인

- 설정-쿠키 및 기타 사이트 데이터-쿠키 및 기타 사이트 데이터

### 2) 쿠키 심기

```java
//쿠키는 브라우저에 텍스트로 저장되어야 하기 때문에 문자열만 허용한다.
	Cookie c1 = new Cookie("name", "honggildong"); //name, value
	Cookie c2 = new Cookie("age", "100");
		
	response.addCookie(c1);	//브라우저에게 쿠키를 심으라고 명령함
	response.addCookie(c2);
```

### 3) 쿠키 확인

```java
<%
    	Cookie[] cookies = request.getCookies();
    	for(Cookie c: cookies){
    		//out : 브라우저에 텍스트로 프린트하고자 하는 경우
    		//out.print(c.getName()+", "+ c.getValue()+"<br>");
    		// 쿠키의이름이 age인 것만 프린트 해보세요.
    		if(c.getName().equals("age")){
		    	out.print(c.getValue());    			
    		}
    	}
    %>

쿠키의 개수 : <%= cookies.length %> <!-- 표현식, 프린트용 -->
```

## 4. 세션(Session)

### 1) 세션 등록

```java
session.setAttribute("id", id);
```

### 2) 세션 가져오기

```java
session.getAttribute("id")
```

### 3) 세션 삭제하기

```java
//id 세션만 제거하고자 하는 경우
session.removeAttribute("id");
//모든 세션 잡은 것을 없애고자 하는 경우
session.invalidate();
```

### 4) 연습하기(로그인-로그아웃 처리)

- login.jsp

```html
<h3>로그인 화면 입니다.</h3>
	<hr>
	<form action="logCheck.jsp">
		로그인 id : <input type="text" name="id"><br>
		로그인 pw : <input type="text" name="pw"><br>
		<button style="color : orange; background : yellow;">로그인 처리 요청</button>
	</form>
```

- logCherk.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//스크립트릿 : 자바 코드의 일부분
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String id2 = "root";
	String pw2 = "pass";
	String result = "로그인 실패";
	if(id.equals(id2)&&pw.equals(pw2)){
		result = "로그인 성공";
		//로그인 성공 하고 나서, id를 세션으로 잡아주어야 한다.
		//세션도 내장된 객체로 제공된다.
		//HttpSession session = new HttpSession();
		session.setAttribute("id", id);
	}else{
		out.print("재로그인해주세요<br>");		
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인 결과 : <%= result %> <!-- 표현식, expresstion -->
	<!-- 세션이 잡혀있는지 아닌지 체크하고자 하는 경우 세션이 null인지를 체크하면 된다. -->
	<!-- id세션이 잡혀있다는 것은 (null이 아니라는 것은) 로그인이 성공했다라는 의미로 해석!!! -->
	<% if(session.getAttribute("id")!=null){%>
		세션 id 값은 : <%= session.getAttribute("id") %>
	<%} %>
	<a href="logout.jsp">로그아웃 처리</a>
</body>
</html>
```

- logout.jsp

```java
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 세션을 끊어주는 처리를 해야함 -->
    <% 
    	//모든 세션 잡은 것을 없애고자 하는 경우
    	session.invalidate();
    	response.sendRedirect("login.jsp");
    %>
```
