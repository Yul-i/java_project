## 1. 자바스크립트

### 1) Document 요소(id, value)

- id값으로 요소 가져오기

```jsx
var idTag = document.getElementById('id');
```

- value값 가져오기

```java
var idValue = idTag.value;
```

- 받아온 value 글자 길이

```jsx
var valueLength = idValue.length;
```

### 2) 연습

- 아이디 글자 수
- js

```jsx
<script type="text/javascript">
	function idCheck() {
		//1. id에 입력한 값 가지고 와야 함
		//1-1. id가 "id"인 input태그를 먼저 찾아야 한다.
		var $idTag = document.getElementById('id'); //<input type="text" name="id" id="id" value="test">
		//1-2. 그 태그 내에 있는 value값을 가지고 오면 됨.
		var idValue = $idTag.value; //value="test"
		alert('id is ' + idValue);
		alert('id 길이>>' + idValue.length);
		//2. 값의 글자수를 세어야 함
		//3. 5글자 이상이 아닌 경우, 메세지를 보여주어야 함
		var result = "";
		if (idValue.length >= 5) {
			result = "5글자 이상입니다. 유효합니다.";
		} else {
			result = "5글자 미만입니다. 재입력 해주세요.";
		}
		var $divTag = document.getElementById('result');//<div id="result"></div>
		$divTag.innerHTML = result;
	}
</script>
```

- html

```jsx
id :<input type="text" name="id" id="id" value="test">
<button onclick="idCheck()" id="b1">글자수 체크</button>
```

### 3) JSON(javascript object notation)

- java의 map(key:value)에 해당
- 자바스크립트에서 데이터(대상)을 표현하는 키와 값을 함께 나타내는 자료의 형태
- 자바스크립트에서 데이터를 표현하는 방법, 제이슨
- name : "hong", age: 100
         키            :     값
       메타데이터  핵심데이터
       메타의 의미 : 보조, 부가적인
- JSON은 속성-값 쌍 또는 "키-값 쌍"으로 이루어진 데이터 오브젝트를 전달하기 위해 인간이 읽을 수 있는 텍스트를 사용하는 개방형 표준 포맷이다.
- 비동기 브라우저/서버 통신 을 위해, 넓게는 XML을 대체하는 주요 데이터 포맷이다.

### 4) XML : exTensible markup language(확장 가능한 ML)

- XML은 데이터를 저장하고 전달할 목적으로 만들어졌으며, 저장되는 데이터의 구조를 기술하기 위한 언어입니다.
- XML은 EXtensible Markup Language의 약자로, 수많은 응용 분야에서 데이터를 저장하고 전달하는 중요한 역할을 맡고 있습니다.

> [https://ko.wikipedia.org/wiki/XML](https://ko.wikipedia.org/wiki/XML)

> [http://tcpschool.com/xml/intro](http://tcpschool.com/xml/intro)

### 5) 이클립스에서 자바스크립트 term 적용하기

- 마켓플레이스에서 term~ 을 다운받는다.
- 프로젝트-configure-Convert to Tern Project..를 들어간다.
- 사용하려는 모듈을 체크해준다.
- 적용 완료!

## 2. 오픈

### 1) 공공데이터포털

> [https://www.data.go.kr/](https://www.data.go.kr/)

### 2) 아임포트(데모 연습)

> [https://docs.iamport.kr/implementation/payment](https://docs.iamport.kr/implementation/payment)

- UI

```html
<h3>주문 정보 입니다.</h3>
	<hr color="red">
	<form action="pay04.jsp">
		주문 물건 id : <input type="text" name="productId"><br>
		주문 물건 name : <input type="text" name="productName"><br>
		주문 총금액 : <input type="text" name="total"><br>
		주문한 사람 id : <input type="text" name="uId" value="summer"><br>
		<button>결제하기</button>
	</form>
```

- pay04.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String productId = request.getParameter("productId");
	String productName = request.getParameter("productName");
	String total = request.getParameter("total");
	int total2 = Integer.parseInt(total);
	String uId = request.getParameter("uId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- jQuery -->
 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
 <!-- iamport.payment.js -->
 <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
 <script type="text/javascript">
	function pay() {
		var IMP = window.IMP; // 생략가능
		IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
		
		IMP.request_pay({
		pg : 'inicis', // version 1.1.0부터 지원.
		pay_method : 'card',
		merchant_uid : 'merchant_' + new Date().getTime(),
		name : '<%= productName %>', 
		amount : <%=total2 %>,
		buyer_email : 'iamport@siot.do',
		buyer_name : '<%= uId %>',
		buyer_tel : '010-1234-5678',
		buyer_addr : '서울특별시 강남구 삼성동',
		buyer_postcode : '123-456',
		m_redirect_url : 'www.yourdomain.com/payments/complete'
		}, function(rsp) {
		if ( rsp.success ) {
		var msg = '결제가 완료되었습니다.';
		msg += '고유ID : ' + rsp.imp_uid;
		msg += '상점 거래ID : ' + rsp.merchant_uid;
		msg += '결제 금액 : ' + rsp.paid_amount;
		msg += '카드 승인번호 : ' + rsp.apply_num;
		console.log(msg);
		location.href = "pay05.jsp?uId=<%= uId %>&productId=<%= productId %>&productName=<%= productName %>&total=<%= total2 %>"
		} else {
		var msg = '결제에 실패하였습니다.';
		msg += '에러내용 : ' + rsp.error_msg;
		alert(msg);
		console.log(msg);
		}
		});
	}
</script>
</head>
<body>
<script type="text/javascript">
	pay();</script>
</body>
</html>
```

- 결과

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String productId = request.getParameter("productId");
	String productName = request.getParameter("productName");
	String total = request.getParameter("total");
	int total2 = Integer.parseInt(total);
	String uId = request.getParameter("uId");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>주문 내역서</h3>
	<hr>
	주문 물건 번호 : <%= productId%><br>
	주문 물건 name : <%= productName%><br>
	주문 총금액 : <%= total2%><br>
	주문한 사람 id : <%= uId%><br>
	<hr>
	<h2>주문 완료 되었습니다.</h2>
</body>
</html>
```

## 3. 오늘의 용어

### 1) 포털 사이트(허브 사이트)

- 인터넷 사용자가 원하는 정보나 사이트를 쉽게 찾을 수 있게 도와주는 사이트. 무수한 인터넷 사이트를 분야별·영역별로 구분지어 놓거나 키 워드를 입력하는 검색 칸을 둠으로써 손쉽게 정보에 접근할 수 있게 함.
- 웹 포털 또는 포털 또는 비공식 용어로 포털 사이트는 월드 와이드 웹에서 사용자들이 인터넷에 접속할 때 기본적으로 거쳐가도록 만들어진 사이트를 말한다. "포털"이라는 단어는 영어로 "정문" 또는 "입구"를 뜻한다.

> [https://ko.wikipedia.org/wiki/포털_사이트](https://ko.wikipedia.org/wiki/%ED%8F%AC%ED%84%B8_%EC%82%AC%EC%9D%B4%ED%8A%B8)

### 2) CDN(content delivery network)

- 콘텐츠를 효율적으로 전달하기 위해 여러 노드를 가진 네트워크에 데이터를 저장하여 제공하는 시스템을 말한다.
- 인터넷 서비스 제공자(ISP)에 직접 연결되어 데이터를 전송하므로, 콘텐츠 병목을 피할 수 있는 장점이 있다.
- CDN의 목적은 높은 사용성과 효율로 사용자에게 컨텐츠를 전달함에 있다. CDN은 오늘날 인터넷에 존재하는 컨텐츠의 상당수를 서비스하고 있는데 이에는 웹 요소 (텍스트, 그래픽, 스크립트), 다운로드 가능한 요소 (미디어 파일, 소프트웨어, 문서), 애플리케이션 (전자상거래, 포털), 실시간 미디어, 주문형 스트리밍, 그리고 소셜 네트워크 등이 있다.

> [https://ko.wikipedia.org/wiki/콘텐츠_전송_네트워크](https://ko.wikipedia.org/wiki/%EC%BD%98%ED%85%90%EC%B8%A0_%EC%A0%84%EC%86%A1_%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC)
