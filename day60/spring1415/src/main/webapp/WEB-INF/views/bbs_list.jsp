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
<hr color="red">
<table border=1>
	<tr bgcolor="yellow">
		<td width="100">아이디</td>
		<td width="100">제목</td>
		<td width="100">내용</td>
		<td width="100">작성자</td>
		<td width="150">상세페이지</td>
	</tr>
	<c:forEach items="${list}" var="dto">
	<tr bgcolor="lime" align="center">
		<td width="100">${dto.id}</td>
		<td width="100">${dto.title}</td>
		<td width="100">${dto.content}</td>
		<td width="100">${dto.writer}</td>
		<td width="150">
			<a href="one2?id=${dto.id}">
				<button>상세페이지로!</button>
			</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
