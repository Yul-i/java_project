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
			<h3>회원 가입</h3>
			<form action="insert.jsp">
			   ID: <input name = "id"><br>
			   PW: <input name = "pw"><br>
			   이름: <input name = "name"><br>
			   tel: <input name = "tel"><br>
			   <button>회원가입 처리</button>
			</form>
			<hr>
			<h3>회원 탈퇴</h3>
			<form action="delete.jsp">
			   ID: <input name = "id"><br>
			   <button>회원탈퇴 처리</button>
			</form>
			<hr>
			<h3>회원 수정</h3>
			<form action="update.jsp">
			   ID: <input name = "id"><br>
			   이름: <input name = "name"><br>
			   tel: <input name = "tel"><br>
			   <button>회원수정 처리</button>
			</form>
			<h3>회원 검색</h3>
			<form action="read.jsp">
			   ID: <input name = "id"><br>
			   <button>회원검색 처리</button>
			</form>
			<hr>
			<h3>회원 전체 검색</h3>
			<a href="all.jsp">전체 검색 페이지로</a>
		</div>
	</div>
</body>
</html>