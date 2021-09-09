## 1. AJAX

### 1) data 전송하기

```jsx
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
			//alert('b1 click;');
			var wordValue = $('#word').val();
			//alert(word);
			$.ajax({
				url : "test.jsp",
				data : {
					word : wordValue
				},
				success : function(result){
					alert('test.jsp 호출 성공!!')
					alert(result);
					$('#d1').append(result+'<br>');
				},//success
				error : function(){
					alert('test.jsp 호출 실패!!')
				}//error
			})//ajax
		})//b1
		
		$('#b2').click(function(){
			var moneyValue = $('#money').val();
			var payValue = $('#pay').val();
			$.ajax({
				url: "money.jsp",
				data : {
					money : moneyValue,
					pay : payValue
				},
				success : function(result) {
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('money.jsp 호출 실패!!')
				}
			})
		})
		
		$('#b3').click(function(){
			var idValue = $('#user').val();
			$.ajax({
				url: "user.jsp",
				data : {
					//서버에서 받을때는 "id"라는 키로 받아야 한다
					id : idValue,
				},
				success : function(result) {
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('user.jsp 호출 실패!!')
				}
			})
		})
		
		$('#b4').click(function(){
			var telValue = $('#tel').val();
			$.ajax({
				url: "tel.jsp",
				data : {
					//서버에서 받을때는 "id"라는 키로 받아야 한다
					tel : telValue,
				},
				success : function(result) {
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('tel.jsp 호출 실패!!')
				}
			})
		})
	})//$
</script>
</head>
<body style="background:pink">
	<h3>비동기 통신</h3>
	<hr>
	ajax 테스트 : <input id="word"><button id="b1">ajax 테스트(test.jsp)</button><br>
	결제금액 : <input id="money"><br>
	1) 계좌이체, 2) 신용카드, 3)휴대폰결제<br>
	결제수단 : <input id="pay"><button id="b2">결제하기</button><br>
	<hr style="background:red">
	회원가입할 id 입력 : <input id="user"><button id="b3">회원가입시 id중복 체크</button><br>
	<hr style="background:red">
	인증받을 전화번호 입력 : <input id="tel"><button id="b4">인증번호 받기</button>
		<hr style="background:green">
	<div id="d1"></div>
</body>
</html>
```

- test.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String word = request.getParameter("word");
	System.out.println(word);
%>

당신이 받은 말은 <%= word %>
```

- money.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String money = request.getParameter("money");
	int moneyIn = Integer.parseInt(money);
	double cost = 0;
	String pay = request.getParameter("pay");
	String payKind = null;
	if(pay.equals("1")){
		payKind = "계좌이체";
		cost = moneyIn*0.7;
	}else if(pay.equals("2")){
		payKind = "신용카드";
		cost =moneyIn*0.8;
	}else if(pay.equals("3")){
		payKind = "휴대폰결제";
		cost = moneyIn;
	}
%>

결제금액 <%= (int)cost %>원 <%= payKind %>로 결제되었습니다.
```

- user.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String[] list = {"root", "summer", "park"};
	String result = "중복된 아이디가 없습니다. 가입 가능합니다.";
	//반복문을 돌려서 하나씩 꺼내온다.
	//꺼내와서 내가 입력한 user에 들어있는 값과 동일한지 체크
	//동일하다면 result = "중복된 이이디입니다. 가입 불가능합니다."
	for(int i = 0; i < list.length; i++){
		if(id.equals(list[0])){
			result = "중복된 아이디입니다. 가입 불가능합니다.";
		}
	}
	/* for(String data:list){
		if(data.equals(id)){
			result = "중복된 아이디입니다. 가입 불가능합니다.";
		}
	} */
%>

<%= result %>
```

- tel.jsp

```jsx
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String tel = request.getParameter("tel");
	String num = tel.substring(0, 3);
	String first = "";
	int second = 0;
	String total = "";
	
	if(num.equals("010")){
		first = "111";
	}else if(num.equals("011")){
		first = "222";
	}else{
		first = "333";
	}
	
	Random r = new Random();
	second = r.nextInt(900)+100;
	String second2 = Integer.toString(second);
	
	total = first+second2;

	
%>

인증번호 : <%= total %>
```

## 2. Spring-ajax

### 1) ajax3.jsp

```jsx
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
		
		$('#b3').click(function(){
			var idValue = $('#user').val();
			$.ajax({
				url: "check2.mega",
				data : {
					//서버에서 받을때는 "id"라는 키로 받아야 한다
					id : idValue,
				},
				success : function(result) {
					alert(result);
					$('#d1').append(result+'<br>');
				},
				error : function(){
					alert('user.jsp 호출 실패!!')
				}
			})
		})
	
	})//$
</script>
</head>
<body style="background:pink">
	<h3>비동기 통신</h3>
	<hr>
	회원가입할 id 입력 : <input id="user"><button id="b3">회원가입시 id중복 체크</button><br>
	<div id="d1"></div>
</body>
</html>
```

### 2) MemberController.java

```java
@RequestMapping("check2.mega")
	public void check(MemberDTO memberDTO, Model model) {
		System.out.println(memberDTO);
		String result = "중복된 아이디가 없습니다. 사용 가능합니다.";
		MemberDTO dto = dao.check2(memberDTO);
		if(dto!=null) {
			result = "중복된 아이디가 있습니다. 사용불가능 합니다.";
		}
		model.addAttribute("result", result);
	}
```

### 3) MemberDAO.java

```java
public MemberDTO check2(MemberDTO memberDTO) {
		MemberDTO dto = mybatis.selectOne("member.check2", memberDTO);
		return dto;
	}
```

### 4) memberMapper.xml

```xml
<select id="check2" parameterType="memberDTO" resultType="memberDTO">
		select id from MEMBER where id = #{id}
</select>
```

### 5) views/check2.jsp

```jsx
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
${result}
```
