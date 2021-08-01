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
	<hr>
	<table border=1>
		<tr>
			<th>id</th>
			<td><%= bag2.getId() %></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><%= bag2.getTitle() %></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%= bag2.getContent() %></td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td><%= bag2.getWriter() %></td>
		</tr>
	</table>
</body>
</html>