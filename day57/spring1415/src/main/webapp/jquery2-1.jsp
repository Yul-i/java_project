<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/out2-1.js"></script>
<script type="text/javascript">

   
   const handleOnChange = function(event){
	   var id = event.target.id;
	   var a = document.getElementById(n1).value;
	   var b = document.getElementById(n2).value;
	   if (id=="plus"){
			plus(a,b);
		}else if(id=="minus"){
			minus(a,b);
		}else if(id=="multiply"){
			multiply(a,b);
		}else if(id=="division"){
			division(a,b);
		}
	    alert(result);
   }
   
   document.querySelector("#plus").addEventListener("click", handleOnChange);
   document.querySelector("#minus").addEventListener("click", handleOnChange);
   document.querySelector("#multiply").addEventListener("click", handleOnChange);
   document.querySelector("#division").addEventListener("click", handleOnChange);
   
   
</script>
</head>
<body>
	숫자1 : <input id="n1"> <br>
	숫자2 : <input id="n2"> <br>
	<button id="plus">두 수를 더하자.</button>
	<button id="minus">두 수를 빼자.</button>
	<button id="multiply">두 수를 곱하자.</button>
	<button id="division">두 수의 나누자.</button>
</body>
</html>