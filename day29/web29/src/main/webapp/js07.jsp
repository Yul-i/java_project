<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/out.js"></script>
<script type="text/javascript" src="js/out2.js"></script>
<script type="text/javascript">
	div();
	alert('나는 html 문서에 실행되는 추가된 자바 스크립트@@@@');
</script>
</head>
<body>
	<button style="background:yellow;" onClick="add(10, 20)">더하기 기능 처리</button>
	<button style="background:pink;" onClick="minus(100, 200)">빼기 기능 처리</button>
	<button style="background:pink;" onClick="move()">사이트로 이동</button>
</body>
</html>