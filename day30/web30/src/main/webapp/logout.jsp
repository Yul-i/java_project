<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 세션을 끊어주는 처리를 해야함 -->
    <% 
    	//id 세션만 제거하고자 하는 경우
    	//session.removeAttribute("id");
    	//모든 세션 잡은 것을 없애고자 하는 경우
    	session.invalidate();
    	//response : 서버가 클라이언트에게 특정한 처리를 하라고 명령할 때 사용 
    	//request : 클라이언트로 부터 넘어온 데이터를 받을 때 사용 
    	response.sendRedirect("login.jsp");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>