<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 입력</title>
<script type="text/javascript">
	var pass1 = prompt('패스워드를 입력해주세요.');
	var pass2 = prompt('패스워드 확인 입력 해주세요.');
	
	if (pass1==pass2) {
		alert("비밀번호가 일치합니다.");
	}else{
		alert("비밀번호가 틀립니다.");
	}
</script>
</head>
<body>

</body>
</html>