<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String productId = request.getParameter("productId");
	String productName = request.getParameter("productName");
	String total = request.getParameter("total");
	int total2 = Integer.parseInt(total);
	String uId = request.getParameter("uId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>주문 내역서</h3>
	<hr>
	주문 물건 번호 : <%= productId%><br>
	주문 물건 name : <%= productName%><br>
	주문 총금액 : <%= total2%><br>
	주문한 사람 id : <%= uId%><br>
	<hr>
	<h2>주문 완료 되었습니다.</h2>
</body>
</html>