<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	
    	ProductDTO dto = new ProductDTO();
    	dto.setId(id);
    	
    	ProductDAO dao = new ProductDAO();
    	ProductDTO dto2 = dao.read(dto);    	
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
			<td><%= dto2.getId() %></td>
		</tr>
		<tr>
			<th>제품명</th>
			<td><%= dto2.getName() %></td>
		</tr>
		<tr>
			<th>제품 소개</th>
			<td><%= dto2.getContent() %></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><%= dto2.getPrice() %></td>
		</tr>
	</table>
</body>
</html>