<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String temp = request.getParameter("temp");
	String weekDay = request.getParameter("weekDay");
	String result = "가을이군!";
	
	int temp2 = Integer.parseInt(temp);
	if(temp2>=30){
		result = "엄청 덥군!";
	}
%>

오늘은 <%= weekDay%>인데 <%= result %>