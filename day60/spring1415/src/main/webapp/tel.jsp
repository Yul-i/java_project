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
