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
		$('#b1').click(function(){
			//alert('b1 click;');
			var wordValue = $('#word').val();
			//alert(word);
			$.ajax({
				url : "test.jsp",
				data : {
					word : wordValue
				},
				success : function(result){
					alert('test.jsp 호출 성공!!')
					alert(result);
					$('#d1').append(result+'<br>');
				},//success
				error : function(){
					alert('test.jsp 호출 실패!!')
				}//error
			})//ajax
		})//b1
		
		$('#b2').click(function(){
			var moneyValue = $('#money').val();
			var payValue = $('#pay').val();
			$.ajax({
				url: "money.jsp",
				data : {
					money : moneyValue,
					pay : payValue
				},
				success : function(result) {
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('money.jsp 호출 실패!!')
				}
			})
		})
		
		$('#b3').click(function(){
			var idValue = $('#user').val();
			$.ajax({
				url: "user.jsp",
				data : {
					//서버에서 받을때는 "id"라는 키로 받아야 한다
					id : idValue,
				},
				success : function(result) {
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('user.jsp 호출 실패!!')
				}
			})
		})
		
		$('#b4').click(function(){
			var telValue = $('#tel').val();
			$.ajax({
				url: "tel.jsp",
				data : {
					//서버에서 받을때는 "id"라는 키로 받아야 한다
					tel : telValue,
				},
				success : function(result) {
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('tel.jsp 호출 실패!!')
				}
			})
		})
	})//$
</script>
</head>
<body style="background:pink">
	<h3>비동기 통신</h3>
	<hr>
	ajax 테스트 : <input id="word"><button id="b1">ajax 테스트(test.jsp)</button><br>
	결제금액 : <input id="money"><br>
	1) 계좌이체, 2) 신용카드, 3)휴대폰결제<br>
	결제수단 : <input id="pay"><button id="b2">결제하기</button><br>
	<hr style="background:red">
	회원가입할 id 입력 : <input id="user"><button id="b3">회원가입시 id중복 체크</button><br>
	<hr style="background:red">
	인증받을 전화번호 입력 : <input id="tel"><button id="b4">인증번호 받기</button>
		<hr style="background:green">
	<div id="d1"></div>
</body>
</html>