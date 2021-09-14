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