<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
<hr>
<form action="success.dahaeng">
	아이디 : <input name="memId"><br>
	비밀번호 : <input name="memPw"><br>
	이름 : <input name="memName"><br>
	생년월일 : <input type="date" name="birthday"><br>
	성별 :
	<label>남:<input type="radio" id="gender" name="gender" value="M"></label> 
	<label>여:<input type="radio" id="gender" name="gender" value="F"></label>
	<br>
	email : <input name="email"><br>
	전화번호 : <input name="tel"><br>
	주소 : <input name="address"><br>
	회원등급 : <input name="memLevel" value="buyer"><br>
	<button>회원가입 신청</button>
</form>
</body>
</html>