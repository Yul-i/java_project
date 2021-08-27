<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>제품 등록 결과</h3>
	<hr>
	제품 번호 : ${productDTO.pNo}
	제품 이름 : ${productDTO.name}
	제품 설명 : ${productDTO.content}
	등록 날짜 : ${productDTO.date}
</body>
</html>