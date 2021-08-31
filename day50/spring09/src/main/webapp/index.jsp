<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome..! login page..!
	<form action="password.mega">
		password : <input name="pass"><br>
		<button>암호 처리 요청</button>
	</form>
	<hr>
	<form action="login.mega">
		id : <input name="id"><br>
		pw : <input name="pw"><br>
		<button>로그인 처리 요청</button>
	</form>
	<hr>
	<form action="check.mega">
		NickName : <input name="nick"><br>
		<button>닉네임 처리 요청</button>
	</form>
</body>
</html>