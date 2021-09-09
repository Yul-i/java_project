<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원 아이디 : ${dto.memId}<br>
	회원 비밀번호 : ${dto.memPw}<br>
	회원 이름 : ${dto.memName}<br>
	회원 생년월일 : ${dto.birthday}<br>
	회원 성별 : ${dto.gender}<br>
	회원 이메일 : ${dto.email}<br>
	회원 전화번호 : ${dto.tel}<br>
	회원 주소 : ${dto.address}<br>
	회원 등급 : ${dto.memLevel}<br>
</body>
</html>