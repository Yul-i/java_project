<%@page import="com.mega.mvc02.MemberDAO"%>
<%@page import="com.mega.mvc02.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 1. request객체로 클라이언트가 입력해서 서버로 넘긴 데이터 받아오기 -->
	<!-- 2. DTO를 만들어서 1번의 데이터를 넣는다. -->
	<!-- 제어하느 ㄴ부분(Controller, 컨트롤러 -->
	<jsp:useBean id="dto" class="com.mega.mvc02.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<!-- jsp:~~ jsp 액션 태그 -->
	<%	
	MemberDAO dao = new MemberDAO();
	dao.insert(dto);
	%>
	
	
	<!-- 클라이언트가 요청한 결과를 클라이언트에게 보여주는 부분(View) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="yellow">
	회원가입 신청이 완료되었습니다...
</body>
</html>