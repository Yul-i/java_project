<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<h3>제품 하나 검색</h3>
			<form action="read3.jsp">
				id 검색 <input type="text" name="id">
				<button type="submit">검색</button>
			</form>
			<hr>
			<h3>제품 전체 검색</h3>
			<a href="all3.jsp">목록 보기</a>
		</div>
	</div>
</body>
</html>