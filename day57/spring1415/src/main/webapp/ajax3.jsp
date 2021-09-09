<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		
		$('#b3').click(function(){
			var idValue = $('#user').val();
			$.ajax({
				url: "check2.mega",
				data : {
					//서버에서 받을때는 "id"라는 키로 받아야 한다
					id : idValue,
				},
				success : function(result) {
					alert(result);
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('user.jsp 호출 실패!!')
				}
			})
		})
	
	})//$
</script>
</head>
<body style="background:pink">
	<h3>비동기 통신</h3>
	<hr>
	회원가입할 id 입력 : <input id="user"><button id="b3">회원가입시 id중복 체크</button><br>
	<div id="d1"></div>
</body>
</html>