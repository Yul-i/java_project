<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String title = request.getParameter("title");
    	String auther = request.getParameter("auther");
    	String content = request.getParameter("content");
    	String type = request.getParameter("type");
    	String dpart = request.getParameter("dpart");
    	String today = request.getParameter("today");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게 시 판</h2>
	<table border="1">
		<tr>
			<th>제목</th>
			<td><%= title %></td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td><%= auther %></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%= content %></td>
		</tr>
		<tr>
			<th>종류</th>
			<td>
				<%= type %>
			</td>
		</tr>
		<tr>
			<th>부서</th>
			<td>
				<%= dpart %>
			</td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><%= today %></td>
		</tr>
	</table>
</body>
</html>