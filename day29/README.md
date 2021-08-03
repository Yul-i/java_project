## 1. JavaScript

### 1) 자바스크립트vs자바

- 자바스크립트 → 클라이언트측에서 실행, 변수의 타입이 값이 들어갈때 결정, 함수 중심의 언어
- 자바 → 서버측에서 실행, 변수의 타입이 선언할 때 결정, 객체 중심의 언어

### 2) 자바스크립트 선언

- 자바스크립트는 변수에 들어가는 데이터의 타입이 값이 들어갈 때 결정

```jsx
var name = prompt('당신의 이름을 입력하세요.');
var age = prompt('나이를 입력하세요.');
var age2 = parseInt(age) + 1;
alert('당신의 이름은 '+ name + '이고, 내년 나이는 '+age2+'입니다.');
```

### 3) 사칙연산

```jsx
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
```

### 4) 내장 객체

- 미리 만들어서 넣어놓은 객체 : 내장된 객체
- window, location, console, history, document

```jsx
var result = confirm('배가 고프신가요?');
	if (result) {
		alert('밥 먹으러 갑시다.');
	}
	console.log('내가 콘솔에 찍혀요');
	document.write('내가 body 부분에 찍혀요.');
	location.href='http://www.naver.com';
```

### 5) 비교 연산자

```jsx
n1 = '100';
n2 = 100
	
	//타입에 상관없이 비교 가능
	alert( n1==n2 ); //true
	//타입도 동일한지 비교
	alert(n1===n2);  //false
```

### 6) 자바스크립트 연결 & function(), onclick

- html

```html
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/out.js"></script>
<script type="text/javascript" src="js/out2.js"></script>
<script type="text/javascript">
	div();
	alert('나는 html 문서에 실행되는 추가된 자바 스크립트@@@@');
</script>
</head>
<body>
	<button style="background:yellow;" onClick="add(10, 20)">더하기 기능 처리</button>
	<button style="background:pink;" onClick="minus(100, 200)">빼기 기능 처리</button>
	<button style="background:pink;" onClick="move()">사이트로 이동</button>
</body>
</html>
```

- out.js

```jsx
//버튼을 누르면 특정한 기능 처리를 하게 하기 위해서 함수를 만들어 주자!!
	//기능을 정의
	function add(x,y) {
	/* 	x = 10;
		y = 20; */
		console.log('더하기 기능 정의할 예정임.' + (x+y))
	}
	
	function minus(x,y) {
	/* 	x= 100;
		y=200; */
		console.log('빼기 기능 정의할 예정임.'+ (x-y))
	}
	
	function move() {
		var site = prompt('1)네이버, 2)daum, 3)google')
		if (site==1) {
			location.href='http://www.naver.com';
		}else if (site==2) {
			location.href='http://www.daum.net';
		}else if (site==3) {
			location.href='http://www.google.com';
		}else{
			alert('해당 사이트가 없습니다.')
		}
	}
```

- out2.js

```jsx
function div(){
	alert('나는 추가된 나누기 기능 함수 입니다.')
}
```

### 7) Array

```html
<script type="text/javascript">
	//배열array
	cars = ['트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스','트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스', '트럭', '승용차', '버스']
	for (var i = 0; i < cars.length; i++) {
		console.log(cars[i]);
	}
</script>
</head>
<body>
	<button onclick="alert('내가 나타났다')">나를 눌러봐요!!!</button>
</body>
```

### 8) 연습

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{
		color : red;
		border-bottom : 1px solid #000;
	}
	label{
		color : blue;
		font-size : 18px;
	}
	div{
		display : none;
	}
	div.on{
		display : block;
	}
</style>
<script type="text/javascript">
	function view() {
		var $div = document.getElementById('view');
		$div.classList.add('on');
	}
	function login() {
		var id = document.getElementById('id').value;
		var pw = document.getElementById('pw').value;
		
		if (id=='root'&&pw=='1234') {
			location.href='http://www.naver.com';
		}else{
			location.href='http://www.daum.net';
		}
	}
	
	function cost() {
		var money = prompt('결제하실 금액은?');
		var intMoney = parseInt(money);
		var level = prompt('회원 등급 : 1)일반, 2)VIP');
		
		if (level==2) {
			alert('VIP 회원님 결제 하실 금액 총 '+(intMoney*0.9)+'원 입니다.');
		}else if (level==1) {		
			alert('일반 회원님 결제 하실 금액 총 '+(intMoney*1.1)+'원 입니다.');
		}
	}
	
</script>
</head>
<body>
	<button style="background:pink;" onclick=view()>로그인</button>
	<button style="background:lime;" onclick=cost()>결제하기</button>
	<div id="view">
		<h2>사이트 연결</h2>
		<label>아이디 : <input id="id" type="text" placeholder="아이디를 입력해주세요."></label>
		<label>비밀번호 : <input id="pw" type="text" placeholder="비밀번호를 입력해주세요."></label>
		<button onclick="login()">로그인</button>	
	</div>
</body>
</html>
```

## 2. 구글 차트

### 1) 구글 차트 주소

[https://developers.google.com/chart/interactive/docs](https://developers.google.com/chart/interactive/docs)

### 2) 연습

- 코드

```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load("current", {packages:["corechart"]});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['한 일', '24시간이 모자라'],
          ['공부',     11],
          ['식사',      2],
          ['노래듣기',  1],
          ['휴식',  2],
          ['게임', 1],
          ['잠',    7]
        ]);
        var options = {
          title: '나의 하루 일과',
          is3D: true,
        };
        var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="piechart_3d" style="width: 900px; height: 500px;"></div>
  </body>
</html>
```
