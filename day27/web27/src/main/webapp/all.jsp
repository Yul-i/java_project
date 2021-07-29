<%@page import="shop.dto.회원Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //스크립트릿(서버에서 돌아가는 작은 포르그램)
    
    	//jsp 파일 자동 import 단축키 : 클릭 후, 컨트롤+쉬프트+m
    	회원DAO2 dao = new 회원DAO2();
    	ArrayList<회원Bag> list = dao.read();
    	
    	for(int i = 0; i < list.size()-1; i++){
    		String id = list.get(i).getId();
            String pw =  list.get(i).getPw();
            String name =  list.get(i).getName();
            String tel =  list.get(i).getTel();
    	}
    	
            	
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= list %><!-- 표현식 -->
</body>
</html>