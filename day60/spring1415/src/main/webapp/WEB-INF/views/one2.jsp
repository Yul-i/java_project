<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색된 게시판 정보입니다.</h1>
	<hr>
	<a href="bbs_list">
		<button>게시판 전체 목록으로 가기!</button>
	</a>
	<br>
		검색된 id : ${dto.id} <br>
		검색된 제목 : ${dto.title} <br>
		검색된 내용 : ${dto.content} <br>
		검색된 작성자 : ${dto.writer} <br>
	<hr>
	${dto2.id}<br>
	${dto2.id}<br>
</body>
</html>