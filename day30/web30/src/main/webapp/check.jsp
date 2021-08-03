<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String id2 = "root";
	String pw2 = "pass";
	String result = "로그인 실패하셨습니다";
	if(id.equals(id2)&&pw.equals(pw2)){
		result = "로그인 성공";
		session.setAttribute("id", id);
	}else{
		out.print("재로그인해주세요<br>");		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인 결과 : <%= result %><br>
	<% if(session.getAttribute("id") != null){%>
		<%= session.getAttribute("id") %> 님이 로그인 하셨습니다.
	<%}%>
	<ul>
		<li><a href="news.jsp">뉴스</a></li>
		<li><a href="mail.jsp">메일</a></li>
		<li><a href="cafe.jsp">카페</a></li>
	</ul>
</body>
</html>