<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //pId,pName,amount
    	//누가, 얼마나, 무엇을
    	String pId = request.getParameter("pId");
    	String sId = request.getParameter("sId");
    	String pName = request.getParameter("pName");
    	String amount = request.getParameter("amount");
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= sId %>님의 결제 내역은 아래와 같습니다.
<hr>
상품id: <%= pId %> <br>
상품name: <%= pName %> <br>
상품amount: <%= amount %> <br>
</body>
</html>