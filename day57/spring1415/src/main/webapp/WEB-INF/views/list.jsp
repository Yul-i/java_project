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
			<td width="200">이름</td>
			<td width="300">전화번호</td>
			<td width="100">상세페이지</td>
			<td width="100">삭제</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr bgcolor="lime" align="center">
				<td>${dto.id}</td>
				<td>${dto.name}</td>
				<td>${dto.tel}</td>
				<td>
					<a href="one.do?id=${dto.id}">
						<button style="background:pink;">상세 페이지로</button>
					</a>
				</td>
				<td>
					<a href="del.do?id=${dto.id}">
						<button style="background:blue; color:white;">삭제</button>
					</a>
				</td>
			</tr>
		</c:forEach>	
	</table>
</body>
</html>