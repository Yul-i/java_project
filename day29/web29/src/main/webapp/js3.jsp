<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{
		color : red;
		border-bottom : 1px solid #000;
	}
	label{
		color : blue;
		font-size : 18px;
	}
	div{
		display : none;
	}
	div.on{
		display : block;
	}
</style>
<script type="text/javascript">

	function view() {
		var $div = document.getElementById('view');
		$div.classList.add('on');
	}

	function login() {
		var id = document.getElementById('id').value;
		var pw = document.getElementById('pw').value;
		
		if (id=='root'&&pw=='1234') {
			location.href='http://www.naver.com';
		}else{
			location.href='http://www.daum.net';
		}
	}
	
	function cost() {
		var money = prompt('결제하실 금액은?');
		var intMoney = parseInt(money);
		var level = prompt('회원 등급 : 1)일반, 2)VIP');
		
		if (level==2) {
			alert('VIP 회원님 결제 하실 금액 총 '+(intMoney*0.9)+'원 입니다.');
		}else if (level==1) {		
			alert('일반 회원님 결제 하실 금액 총 '+(intMoney*1.1)+'원 입니다.');
		}
	}
	
</script>
</head>
<body>
	<button style="background:pink;" onclick=view()>로그인</button>
	<button style="background:lime;" onclick=cost()>결제하기</button>
	<div id="view">
		<h2>사이트 연결</h2>
		<label>아이디 : <input id="id" type="text" placeholder="아이디를 입력해주세요."></label>
		<label>비밀번호 : <input id="pw" type="text" placeholder="비밀번호를 입력해주세요."></label>
		<button onclick="login()">로그인</button>	
	</div>
</body>
</html>