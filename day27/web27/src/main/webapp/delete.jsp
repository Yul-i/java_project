<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    	String id = request.getParameter("id");
    	//DB처리하는 DAP에게 주면서 탈퇴하는 SQL문을 만들어서 전송
    	
    	//가방을 만들어서 데이터를 넣자.
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	
    	//DAO를 만들어서 탈퇴 요청
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.delete(bag);
    	String text = "회원 탈퇴 처리 실패";
    	if(result==1){
    		text = "회원 탈퇴 처리 성공";
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= text %>
</body>
</html>