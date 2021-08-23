<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시글 쓰기</h3>
	<form action="create">
		번호 : <input type="text" name="no"><br>
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		작성자 : <input type="text" name="writer"><br>
		<button type="submit">글 작성 완료</button>
	</form>
</body>
</html>