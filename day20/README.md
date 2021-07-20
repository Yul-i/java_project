## 1. 설치

### 1) 아파치 톰캣

> [https://tomcat.apache.org/](https://tomcat.apache.org/)

- 8.5 버전으로 설치를 한다.
- 포트 설정과 서비스 이름을 정한다.
- 위치는 자바가 설치된 자리로 자동 지정된다.
- 서비스 - Apache Tomcat 8.5가 있는 것을 확인 할 수 있다. 
- 톰캣은 Start/stop을 설정할 수 있다.

### 2) 자바에 TomCat 설치

- window-perspective-Reset Perspective로 가면 인터페이스를 초기화 할 수 있다.
- Window-Web Browser에 가서 띄울 브라우저를 설정해준다.
- window-Preferences-Server-Runtime Environment-Add..를 해준다.
- 설치한 tomcat 8.5버전을 선택해준다.
- Browser를 눌러서 폴더를 선택해준다.
- 범위는 Tomcat 폴더 안까지.
- Server창에 문구를 Click해준다.
- Tomcat이 연결된 모습이다. 여기서 포트를 설정할 수도 있다.

## 2. Dynamic Web Project

### 1) 생성

- 작업은 JavaEE에서 해야한다.
- JavaEE(자바 플랫폼, 엔터프라이즈 에디션은 자바를 이용한 서버측 개발을 위한 플랫폼이다.)
- 생성은 동일하게 New(Ctrl+n) - Web - Dynamic Web Project
- Dynamic ↔ Static
- 프로젝트 이름을 정해주고, Target runTime이 설치한 버전으로 자동으로 잡힌다.
- HTML, JSP 등의 작업 폴더는 Src-main-webapp 이다.
- HTML을  webapp폴더 안에 생성해준다. JSP 파일도 동일하다.

### 2) 개발자 도구

- 브라우저에서 개발자를 위한 다양한 도구를 제공한다.
- F12 키를 누르면 뜬다.

### 3) UTF-8 설정

- Window - Preferences - Web - HTML/CSS/JSP를 UTF-8로 설정해준다.


## 2. HTML, CSS, JavaScript 맛보기

### 1)HTML

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>인덱스입니다.</h1>
		<br>
		<h2>제 이름은 너구리입니다.</h2>
	</body>
</html>
```

### 2) CSS

- HTML 내 인라인으로 작성하기

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Page4번 입니다.</title>
	</head>
	<body>
		나는 <font color="green">page 4번</font> 내용 입니다.<br>
		<h1>나는 제목 제일 큰 거</h1>
		<hr width=500>
		<h6>나는 제목 제일 작은 거</h6>
	</body>
</html>
```

- CSS 파일 내 작성해서 link 하기

```css
@charset "UTF-8";
body{
	background: #ffff00;
}

/* h1에 해당하는 스타일을 괄호안에 여러가지 지정 가능*/
h1{
	width : 300px;
	height : 100px;
	background: lime;	
}
```

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Page5번 입니다.</title>
		<link href="out.css" rel='stylesheet'>
	</head>
	<body>
		나는 <font color="green">page 5번</font> 내용 입니다.<br>
		<h1>나는 제목 제일 큰 거</h1>
		<hr width=500>
		<h6>나는 제목 제일 작은 거</h6>
	</body>
</html>
```

### 3) JavaScript

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>page6</title>
		<script type="text/javascript">
			alert('환영합니다.');
			name = prompt('당신의 이름은?');
			result = confirm('당신의 이름은 ' + name + ' 입니다.'); //true, false
			alert(result);
			if (result) {
				alert('맞군요');
			}else {		
				alert('틀리군요');
			}
		</script>
	</head>
	<body>
	
	</body>
</html>
```

## 3. JSP 맛보기

### 1) 파라미터 통한 데이터 전송

- 로그인.html

```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 화면</title>
	</head>
	<body>
		<h2>로그인</h2>
		<form action="check.jsp">
			<label>아이디 : <input name="id"></label><br>
			<label>비밀번호 : <input name="pw"></label>
			<button>로그인</button><!-- 기본 값이 submit -->
		</form>
	</body>
</html>
```

- check.jsp

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		 String id = request.getParameter("id");
		 String pw = request.getParameter("pw");
		 String id2 = "root";
		 String pw2 = "1234";
		 String result = "로그인 실패";
		 if(id.equals(id2)&&pw.equals(pw2)){
			 result = "로그인 성공";
		 }
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 확인</title>
	</head>
	<body bgColor="pink">
		<p><%= id%>가 아이디 입니다.<p>
		<p><%= pw%>가 비밀번호 입니다.<p>
		<hr>
		<p>로그인 결과는 <%= result %></p>
	</body>
</html>
```

## 4. 오늘의 용어

### 1) CI(Continuous Integration)

- [소프트웨어 개발](https://namu.wiki/w/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4%20%EA%B0%9C%EB%B0%9C)에서 각 [소프트웨어 개발자](https://namu.wiki/w/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8) 가 작업한 변경점을 프로젝트의 원래 소스 코드에 자주, 빠르게 통합하는 것이다.
- 이를 위해 CI를 위한 각종 개발도구와 스크립트를 사용해 코드를 합치고 품질을 검사하며 테스트하는 과정을 자동화한다. 덕분에 사람이 직접 해야 하는 일이 줄어들고 문제가 생겼을 때 빨리 발견할 수 있다.
- 소스 코드로부터 설치, 실행할 수 있는 제품을 생성하여 배포하는 과정인 [Continuous Delivery](https://namu.wiki/w/CD(%EB%8F%99%EC%9D%8C%EC%9D%B4%EC%9D%98%EC%96%B4)) 와 함께 묶어 CI/CD라고 부른다

> [https://namu.wiki/w/CI](https://namu.wiki/w/CI)

### 2) CD(Continuous Delivery)

- 소프트웨어 개발에서, 소스 코드를 빌드하여 실행 가능한 프로그램이나 다른 사람들이 쓸 수 있게 포장한 라이브러리를 만들고, 이를 웹으로 뿌려 공개하기까지의 과정을 자동화하는 것을 말한다.
- Continus Integration과 함께 묶여 CI/CD라고 부른다.

> [https://namu.wiki/w/CD(동음이의어)](https://namu.wiki/w/CD(%EB%8F%99%EC%9D%8C%EC%9D%B4%EC%9D%98%EC%96%B4))

### 3) 쓰레드(thread)

- 스레드(thread)는 어떠한 프로그램 내에서, 특히 프로세스 내에서 실행되는 흐름의 단위를 말한다.
- 일반적으로 한 프로그램은 하나의 스레드를 가지고 있지만, 프로그램 환경에 따라 둘 이상의 스레드를 동시에 실행할 수 있다.

> [https://ko.wikipedia.org/wiki/스레드_(컴퓨팅)](https://ko.wikipedia.org/wiki/%EC%8A%A4%EB%A0%88%EB%93%9C_(%EC%BB%B4%ED%93%A8%ED%8C%85))
