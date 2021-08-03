<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//스크립트릿						applet : application + let(작은) 작은 프로그램
	//쿠키는 브라우저에 텍스트로 저장되어야 하기 때문에 문자열만 허용한다.
	Cookie c1 = new Cookie("name", "honggildong"); //name, value
	Cookie c2 = new Cookie("age", "100");
		
	response.addCookie(c1);	//브라우저에게 쿠키를 심으라고 명령함
	response.addCookie(c2); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	브라우저에 쿠키를 심었음. <a href="쿠키확인.jsp">쿠키확인</a>
</body>
</html>