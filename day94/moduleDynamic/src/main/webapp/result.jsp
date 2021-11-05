<%@page import="com.mega.myModule.BasicCal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		int num1 = Integer.parseInt(request.getParameter("first"));	
		int num2 = Integer.parseInt(request.getParameter("second"));	
		
		BasicCal cal = new BasicCal();
		int result = cal.add(num1, num2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>받은 숫자 1: <%= num1 %>, 받은 숫자 2: <%= num2 %></p>
	<p>결과 : <%= result %></p>
</body>
</html>