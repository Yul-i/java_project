<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<%
	session.setAttribute("count", 100);//Object<--번환--int 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="page04.jsp">page04</a>
	현재 카운트 <%= session.getAttribute("count") %>
</body>
</html>