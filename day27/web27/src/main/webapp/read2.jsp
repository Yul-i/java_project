<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	String id = request.getParameter("id");
    	
    	게시판Bag bag = new 게시판Bag();
    	bag.setId(id);
    	
    	게시판DAO dao = new 게시판DAO();
    	게시판Bag bag2 = dao.read(bag);
    	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시글 검색 결과 입니다.</h3>
	id : <%= bag2.getId() %> <br>
	제목 : <%= bag2.getTitle() %> <br>
	내용 : <%= bag2.getContent() %> <br>
	글쓴이 : <%= bag2.getWriter() %> <br>
</body>
</html>