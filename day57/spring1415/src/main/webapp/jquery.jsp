<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/out.js"></script>
<script type="text/javascript">
/* 	result = add(200, 100);
	alert(result); */
	function push() {
		//n1, n2에서 가지고 온 데이터를 가지고
		n1Value=document.getElementById("n1").value;
		n2Value=document.getElementById("n2").value;
		//add(n1, n2)
		n1 = parseInt(n1Value);
		n2 = parseInt(n2Value);
		result = add(n1, n2);
		alert(result);
	}
	
	function go(){
		//입력한 값을 가지고 와서 site()함수를 호출함
		goValue = document.getElementById("site").value;
		site(goValue);
	}
</script>
</head>
<body>
	숫자1: <input id="n1"><br>
	숫자2: <input id="n2"><br>
	<button onclick="push()">두 수를 더하자.</button>
	<hr>
	가고 싶은 사이트(naver, google, nate 중 입력) <input id="site"><br>
	<button onclick="go()">사이트로 이동!</button>
</body>
</html>