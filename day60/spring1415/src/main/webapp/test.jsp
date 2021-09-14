<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String word = request.getParameter("word");
	System.out.println(word);
%>

당신이 받은 말은 <%= word %>
