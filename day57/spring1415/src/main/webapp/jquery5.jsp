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