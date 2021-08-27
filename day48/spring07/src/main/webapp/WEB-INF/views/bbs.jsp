<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 입력 정보 확인</h3>
	<hr>
	게시판 번호 : ${bbsDTO.bNo} <br> 
	게시판 제목 : ${bbsDTO.title} <br>
	게시판 내용 : ${bbsDTO.content} <br>
	게시판 글쓴이 : ${bbsDTO.writer} <br>
</body>
</html>