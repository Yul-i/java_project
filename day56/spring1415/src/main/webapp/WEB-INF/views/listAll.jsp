<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr bgcolor="yellow">
			<td width="100">아이디</td>
			<td width="200">제목</td>
			<td width="300">내용</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.id}</td>
				<td>${dto.title}</td>
				<td>${dto.content}</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>