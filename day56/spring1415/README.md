## 1. JavaScript/jquery 함수 실행

### 1) JavaScript 함수 실행

- jquery.jsp

```jsx
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
```

- out.js

```jsx
function add(x, y) {
	return x + y;
}

function site(x){
	location.href="http://www."+x+".com";
}
```

### 2) JQuery 함수 실행

- jquery3.jsp

```jsx
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
	function push() {//일반함수
	   n1Value = $('#n1').val();
	   n2Value = $('#n2').val();
	   n1 = parseInt(n1Value);
	   n2 = parseInt(n2Value);
	   arr=[n1, n2]
	   return arr;
	}
</script>
<script type="text/javascript">
	//BODY부분을 먼저 ram에 읽어들여라
	$(function(){//document.ready()
		   //버튼을 클릭했을 때 n1과 n2의 값을 가지고 오자.
	   $('#b1').click(function(){//콜백함수(CALL-BACK)
		   arr2 = push();
		   result = add(arr2[0], arr2[1])
		   alert(result)
	   })
   	   $('#b2').click(function(){
   			arr2 = push();
		   result = minus(arr2[0], arr2[1])
		   alert(result)
	   })
   	   $('#b3').click(function(){
   			arr2 = push();
		   result = mul(arr2[0], arr2[1])
		   alert(result)
	   })
   	   $('#b4').click(function(){
   			arr2 = push();
		   result = div(arr2[0], arr2[1])
		   alert(result)
	   })
	}) 

</script>
</head>
<body>
	숫자1 : <input id="n1"> <br>
	숫자2 : <input id="n2"> <br>
	<button id="b1">더하기</button>
	<button id="b2">빼기</button>
	<button id="b3">곱하기</button>
	<button id="b4">나누기</button>
</body>
</html>
```

- out2.js

```jsx
function add(x,y){
	var result = x+y;
	return result;
};

function minus(x,y){
	var result = x-y;
	return result;
};

function mul(x,y){
	var result = x*y;
	return result;
};

function div(x,y){
	var result = x/y;
	return result;
};
```

## 2. JQuery 연습

### 1) text(), append()

```jsx
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
```

### 2) append()에 html 태그 써서 넣기

```jsx
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
		$("#b1").click(function(){
			var word = $("#word").val();
			$("#result").append("<p>-"+word+"</p>");
		})
		$("#b2").click(function(){
			var img = "<img src=\"resources/img/ahah.jpg\" width=\"100\" height=\"100\">";
			$("#result").append("<p>"+img+"</p>");
		})
		$("#b3").click(function(){
			var word = $("#word").val();
			var img = "<img src=\"resources/img/ahah.jpg\">";
			$("#result").append("<p>"+word+"</p>");
			$("#result").append("<p>"+img+"</p>");
		})
	}) 

</script>
</head>
<body>
	댓글 : <input id="word"><br>
	<button id="b1">댓글 추가</button>
	<button id="b2">이미지 추가</button>
	<button id="b3">댓글+이미지 추가</button>
	<hr color="red">
	<div id="result">
		
	</div>
</body>
</html>
```

## 3. AJAX

### 1) AJAX 사용

```jsx
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
		//자바에서 키:값의 자료구조는 map(맵)이라고 한다.
		//자바스크립트 JavaScript Object Notation
		//			(자바스크립트에서 대상을 표기하는 방법)
		//			JSON(제이슨)
		//$.ajax(JSON타입의 입력값)
		/* $.ajax({url:'...', data:...,success:...,error:...}) */
		$('#b1').click(function(){
			$.ajax({
				url : "ios.jsp",
				success : function(doc){//호출한 결과를 받아오고 싶음연
					alert("성공!")
					alert(doc);
					$('#result').append(doc+'<br>');
				},
				error : function(){
					alert("실패!")
				}
			})
		})
		
		$('#b2').click(function(){
			$.ajax({
				url : "a.jsp",
				success : function(doc){
					$('#result').append(doc+'<br>');
				},
				error : function(){
					alert("실패!")
				}
			})
		})
		
		$('#b3').click(function(){
			$.ajax({
				url : "b.jsp",
				success : function(doc){
					$('#result').append(doc+'<br>');
				},
				error : function(){
					alert("실패!")
				}
			})
		})

	})
</script>
</head>
<body>
	<button id="b1">Ajax Test</button>
	<button id="b2">A버튼</button>
	<button id="b3">B버튼</button>
	ajax실행 결과는 : <div id="result"></div>
</body>
</html>
```

- ios.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
나를 호출하셨군요!
```

- a.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
오늘은 수요일입니다.
```

- b.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
내일은 목요일입니다.
```
