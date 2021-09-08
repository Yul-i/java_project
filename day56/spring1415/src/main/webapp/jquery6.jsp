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