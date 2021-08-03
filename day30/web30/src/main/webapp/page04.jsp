<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int count = (int)session.getAttribute("count");
	//Object(big)--강제형번환-->int(small)
	count++;
	session.setAttribute("count", count);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="page04.jsp">카운트값 증가 후 카운트값 확인/</a>
	<a href="page05.jsp">카운트값 확인</a>
	현재 카운트 <%= session.getAttribute("count") %>
</body>
</html>