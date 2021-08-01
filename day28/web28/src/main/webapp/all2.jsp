<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="shop.dto.게시판Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    	게시판DAO dao = new 게시판DAO();
    	ArrayList<게시판Bag> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전체 게시판 목록의 개수 : <%= list.size() %> <br>
	<hr>
	<%= list %> 
	<hr color="red">
	<%
		for(int i = 0; i <list.size(); i++){
			게시판Bag dto = list.get(i);
	%>
		게시판 id : <%= dto.getId() %> <br>
		게시판 title : <%= dto.getTitle() %> <br>
		게시판 content : <%= dto.getContent() %> <br>
		게시판 writer : <%= dto.getWriter() %> <br><br>
			
	<%}%>
	<hr color="blue">
	<%
		for(게시판Bag dto :list){
	%>
		게시판 id : <%= dto.getId() %> <br>
		게시판 title : <%= dto.getTitle() %> <br>
		게시판 content : <%= dto.getContent() %> <br>
		게시판 writer : <%= dto.getWriter() %> <br><br>
			
	<%}%>
		<hr color="green">
		<table border=1>
			<tr bgcolor="yellow">
				<th>아이디</th>
				<th>제목</th>
				<th>내용</th>
				<th>글쓴이</th>				
			</tr>
	<%
		for(게시판Bag dto :list){
	%>
			<tr bgcolor="pink">
				<td><%= dto.getId() %></td> 
				<td>
				<a href="/web28/read2.jsp?id=<%= dto.getId()%>"><%= dto.getTitle() %></a></td> 
				<td><%= dto.getContent() %></td> 
				<td><%= dto.getWriter() %></td> 
			</tr>
	<%}%>
		</table>
</body>
</html>