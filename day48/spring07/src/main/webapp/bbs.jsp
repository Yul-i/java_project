<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="index.jsp">to start page</a>
	<hr>
	<form action="bbs">
		번호 : <input type="text" name="bNo"><br>
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		작성자 : <input type="text" name="writer"><br>
		날짜 : <input type="date" name="date">
		<button type="submit">게시판 신청 완료</button>
	</form>
	<a href="bbs?bNo=100&title=test&content=test&writer=test&date=20210827">게시판 신청완료2</a>
</body>
</html>