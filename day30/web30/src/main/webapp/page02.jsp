<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	Cookie[] cookies = request.getCookies();
 for(Cookie c: cookies){
	 	if(!c.getName().equals("JSESSIONID")){
			// out.print(c.getName()+": ");    	
	    	//out.print(c.getValue()+"<br>");	 		
 %>
 	<%= c.getValue() %> <br>
 	<% 
	 	}
	}
 %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="page03.jsp">page03</a>
	
	
</body>
</html>