<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>CAFE</h3>
	<hr>
	<% if(session.getAttribute("id") != null){%>
		<%= session.getAttribute("id") %> 님이 로그인 하셨습니다.
	<%}%>
</body>
</html>