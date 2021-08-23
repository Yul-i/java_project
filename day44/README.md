## 3. spring 코드 작성

### 1) back단과 front단의 작업 영역

- src/main/java 내 패키지 내에서 back단 파일을 작업한다.
- src/main/webapp 폴더 내에 front단 파일을 작업한다.


### 2) webApp, views의 차이

- webApp : 클라이언트 브라우저로 요청할 수 있는 jsp파일 들어있는 디렉토리

    a태그, form action, location.href

- views : mvc2로 하려면 컨트롤러, 모델, 뷰를 완벽하게 분리 시켜야 함.
입력한 값을 서버로 전달하면 컨트롤러가 받아서 dto 만들어서 넣은 후 DB처리 하게 됨.
컨트롤러는 자바파일로 상속 받아서 만들어준다.
컨트롤러에서 처리한 결과를 서버가 클라이언트에게 보여주고자 서버가 호출하는 jsp파일이 들어있는 디렉토리

### 3) MVC2 모델로 파일 구성(예시 코드)

- src/main/webapp/login.jsp

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
	<a href="index.jsp">to start page</a>j
	<hr>
	<form action="check.mega">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="text" name="pw"><br>
		<button type="submit">로그인 완료</button>
	</form>
</body>
</html>
```

- src/main/java/com/mega/mvc02/HomeController.java

```java
@Controller
public class HomeController {
	
	@RequestMapping("check.mega")
	public void check(MemberDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨....!");
		System.out.println("컨트롤러에서 받은 id"+dto.getId());
		System.out.println("컨트롤러에서 받은 pw"+dto.getPw());
		//컨트롤러에서 처리를 한 후, 클라이언트에게 결과를 알려주어야 한다.
		//views 아래에 check.jsp로 만든다.
	}
```

- src/main/java/com/mega/mvc02/MemberDTO.java

```java
package com.mega.mvc02;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
}
```

- src/main/webapp/WEB-INF/views/check.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="skyBlue">
	<h3>로그인이 완료되었습니다.</h3>
</body>
</html>
```


### 4) jsp 액션 태그

- me.jsp

```html
<body>
	<a href="index.jsp">to start page</a>j
	<hr>
	<form action="insert.jsp">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="text" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		전화번호 : <input type="text" name="tel"><br>
		<button type="submit">회원가입 신청 완료</button>
	</form>
</body>
```

- insert.jsp

```java
<%@page import="com.mega.mvc02.MemberDAO"%>
<%@page import="com.mega.mvc02.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 1. request객체로 클라이언트가 입력해서 서버로 넘긴 데이터 받아오기 -->
	<!-- 2. DTO를 만들어서 1번의 데이터를 넣는다. -->
	<!-- 제어하는 부분(Controller, 컨트롤러 -->
	<jsp:useBean id="dto" class="com.mega.mvc02.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<!-- jsp:~~ jsp 액션 태그 -->
	<%	
	MemberDAO dao = new MemberDAO();
	dao.insert(dto);
	%>
```
