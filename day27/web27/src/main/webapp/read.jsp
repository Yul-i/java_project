<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	String id = request.getParameter("id");
    	
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	
    	회원DAO2 dao = new 회원DAO2();
    	회원Bag bag2 = dao.read(bag);
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원정보 검색 결과 입니다.</h3>
	id : <%= bag2.getId() %> <br>
	pw : <%= bag2.getPw() %> <br>
	name : <%= bag2.getName() %> <br>
	tel : <%= bag2.getTel() %> <br>
</body>
</html>