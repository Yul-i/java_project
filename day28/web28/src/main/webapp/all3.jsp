<%@page import="shop.dto.ProductDTO"%>
<%@page import="shop.db.ProductDAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
		ProductDAO dao = new ProductDAO();
    	ArrayList<ProductDTO> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전체 제품 개수 : <%= list.size() %> <br>
	<hr>
	<table border=1>
		<tr>
			<th>ID</th> 
			<th>제품 이름</th> 
			<th>제품 설명</th> 
			<th>제품 가격</th> 
		</tr>

	<%
		for(ProductDTO dto : list){
	%>
		<tr>
			<td><%= dto.getId() %></td> 
			<td>
			<a href="/web28/read3.jsp?id=<%= dto.getId()%>"><%= dto.getName() %></a></td> 
			<td><%= dto.getContent() %></td> 
			<td><%= dto.getPrice() %>원</td> 
		</tr>
	<%}%>
	</table>
</body>
</html>