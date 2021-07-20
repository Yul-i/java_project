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