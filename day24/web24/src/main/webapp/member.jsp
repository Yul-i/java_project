<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<form action="insert.jsp">
			   ID: <input name = "id"><br>
			   PW: <input name = "pw"><br>
			   이름: <input name = "name"><br>
			   tel: <input name = "tel"><br>
			   <button>회원가입 처리</button>
			</form>
		</div>
	</div>
</body>
</html>