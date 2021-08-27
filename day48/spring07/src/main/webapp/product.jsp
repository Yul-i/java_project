<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>제품 입력</h3>
	<form action="productInsert">
		제품 번호 : <input type="text" name="pNo"><br>
		제품 이름 : <input type="text" name="name"><br>
		제품 설명 : <input type="text" name="content"><br>
		등록 날짜 : <input type="date" name="date"><br>
		<button type="submit">제품 등록</button>
	</form>
</body>
</html>