<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자 더해보기</title>
<script type="text/javascript">
	//두 수를 입력 받아서 사칙 연산을 수행해주세요.
	var num1 = prompt('첫 번째 숫자');
	var num2 = prompt('두 번째 숫자');
	
	var int1 = parseInt(num1);
	var int2 = parseInt(num2);
	
	var sum = int1+int2;
	var minus = int1-int2;
	var multiply = int1*int2;
	var divide = int1/int2;
	
	alert(int1+"+"+int2+"="+sum+", "+int1+"-"+int2+"="+minus+", "+int1+"x"+int2+"="+multiply+", "+int1+"/"+int2+"="+divide);
</script>
</head>
<body>

</body>
</html>