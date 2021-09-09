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
			var foodLike = $('#foodLike').val();
			var foodHate = $('#foodHate').val();
			
			$.ajax({
				url : "b1.jsp",
				data : {
					like : foodLike,
					hate : foodHate
				},
				success : function(result){
					$('#d1').append(result+'<br>');
				},//success
				error : function(){
					alert('b1.jsp 호출 실패!!')
				}//error
			})
		})
		
		
		$('#b2').click(function(){
			var temp = $('#temp').val();
			var weekDay = $('#weekDay').val();
			
			$.ajax({
				url : "b2.jsp",
				data : {
					temp: temp,
					weekDay : weekDay
				},
				success : function(result){
					$('#d1').append(result+'<br>');
				},//success
				error : function(){
					alert('b2.jsp 호출 실패!!')
				}//error
			})
		})
	})
</script>
</head>
<body>
	먹고 싶은 음식 : <input id="foodLike"><br> 
	먹기 싫은 음식 : <input id="foodHate"><button id="b1">무엇을 먹을까요?</button>
	<hr>
	온도 : <input id="temp"><br>
	요일 : <input id="weekDay"><button id="b2">날씨</button>
	<hr>
	<div id="d1"></div>
</body>
</html>