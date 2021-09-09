<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String like = request.getParameter("like");
	String hate = request.getParameter("hate");
%>

오늘은 <%= like %>를 먹고 내일은 <%= hate %>를 먹겠어!