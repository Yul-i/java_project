<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//json객체로 만들어주자
	JSONObject json = new JSONObject();
	json.put("id", "root");
	json.put("pw", "1234");
	json.put("name", "홍길동");
	
%><%= json.toJSONString() %>