<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="resources/js/out2.js"></script>

<script type="text/javascript">
	$(function(){
		$("#b1").click(function() {
			var userLength = $("#user").val().length;
			if (userLength>=5) {
				$("#result").text("유효한 아이디 입니다.");
			}else{
				$("#result").text("유효햐지 않은 아이디 입니다.");
				$("#user").val("");
			}
		})
		
		$("#b2").click(function() {
			var pw1Value = $("#pw1").val();
			var pw2Value = $("#pw2").val();
			if (pw1Value==pw2Value) {
				$("#result").append("패스워드가 동일합니다.<br>");
			}else{
				$("#result").append("패스워드가 틀립니다.<br>");
				 $("#pw1").val('');
				 $("#pw2").val('');
			}
		})
	}) 

</script>
</head>
<body>
	아이디 입력 : <input id="user"><br><button id="b1">아이디 유효성 검사</button><br>
	비밀번호 : <input id="pw1"> <br>
	비밀번호 : <input id="pw2"> <br> <button id="b2">암호 유효성 검사</button>
	<hr>
	<div id="result">
		
	</div>
</body>
</html>