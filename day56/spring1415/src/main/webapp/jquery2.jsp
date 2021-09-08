<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/out2.js"></script>
<script type="text/javascript">
   /* result = add(200,100); // 300
   alert(result) */
   
   function push() {
      // n1, n2 에서 가지고 온 데이터를 가지고
      n1Value = document.getElementById("n1").value
      n2Value = document.getElementById("n2").value
      
      // add(n1, n2)
      n1 = parseInt(n1Value)
      n2 = parseInt(n2Value)
      arr = [n1, n2]
      return arr
   }
   function push1() {
      //입력한 값 가지고 와서 정수로 변경처리해야함.
      arr2 = push()
      result = add(arr2[0], arr[1])
      alert(result)
   }
   function push2() {
      //입력한 값 가지고 와서 정수로 변경처리해야함.
      arr2 = push()
      result = minus(arr2[0], arr[1])
      alert(result)
   }
   function push3() {
      //입력한 값 가지고 와서 정수로 변경처리해야함.
      arr2 = push()
      result = mul(arr2[0], arr[1])
      alert(result)
   }
   function push4() {
      //입력한 값 가지고 와서 정수로 변경처리해야함.
      arr2 = push()
      result = div(arr2[0], arr[1])
      alert(result)
   }
   
</script>
</head>
<body>
숫자1 : <input id="n1"> <br>
숫자2 : <input id="n2"> <br>
<button onclick="push1()">두 수를 더하자.</button>
<button onclick="push2()">두 수를 빼자.</button>
<button onclick="push3()">두 수를 곱하자.</button>
<button onclick="push4()">두 수의 나누자.</button>


</body>
</html>