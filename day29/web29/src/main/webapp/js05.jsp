<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//미리 만들어서 넣어놓은 객체 : 내장된 객체
//window, location, console, history, document
	var result = confirm('배가 고프신가요?');
	if (result) {
		alert('밥 먹으러 갑시다.');
	}
	console.log('내가 콘솔에 찍혀요');
	document.write('내가 body 부분에 찍혀요.');
	location.href='http://www.naver.com';
</script>
</head>
<body>

</body>
</html>