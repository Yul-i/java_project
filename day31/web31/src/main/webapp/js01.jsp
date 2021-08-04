<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function idCheck() {
		//1. id에 입력한 값 가지고 와야 함
		//1-1. id가 "id"인 input태그를 먼저 찾아야 한다.
		var $idTag = document.getElementById('id'); //<input type="text" name="id" id="id" value="test">
		//1-2. 그 태그 내에 있는 value값을 가지고 오면 됨.
		var idValue = $idTag.value; //value="test"
		alert('id is ' + idValue);
		alert('id 길이>>' + idValue.length);
		//2. 값의 글자수를 세어야 함

		//3. 5글자 이상이 아닌 경우, 메세지를 보여주어야 함
		var result = "";
		if (idValue.length >= 5) {
			result = "5글자 이상입니다. 유효합니다.";
		} else {
			result = "5글자 미만입니다. 재입력 해주세요.";
		}

		var $divTag = document.getElementById('result');//<div id="result"></div>
		$divTag.innerHTML = result;
	}

	function pwCherk() {
		var $pwTag1 = document.getElementById('pw1'); //pw1은 id
		var $pwTag2 = document.getElementById('pw2');

		var pwValue1 = $pwTag1.value;
		var pwValue2 = $pwTag2.value;

		var result = `<img src="img/no.png" style="width:100%;">`;
		if (pwValue1 == pwValue2) {
			result = `<img src="img/yes.jpg" style="width:100%;">`;
		}
		var $divTag = document.getElementById('result');
		$divTag.innerHTML = result;
		
		$pwTag1.value = "";
		$pwTag2.value = "";
	}
</script>
</head>
<body>
	<h2>자바스크립트 테스트</h2>
	<hr>
	id :
	<input type="text" name="id" id="id" value="test">
	<button onclick="idCheck()" id="b1">글자수 체크</button>
	<br> pw :
	<input type="text" name="pw1" id="pw1">
	<br> pw확인 :
	<input type="text" name="pw2" id="pw2">
	<button onclick="pwCherk()" id="b2">패스워드 동일 여부 체크</button>
	<br>
	<hr>
	<div id="result"
		style="color: red; background: yellow; width: 500px; height: 50px; font-size: 30px"></div>
</body>
</html>