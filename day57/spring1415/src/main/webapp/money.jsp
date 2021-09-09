<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String money = request.getParameter("money");
	int moneyIn = Integer.parseInt(money);
	double cost = 0;
	String pay = request.getParameter("pay");
	String payKind = null;
	if(pay.equals("1")){
		payKind = "계좌이체";
		cost = moneyIn*0.7;
	}else if(pay.equals("2")){
		payKind = "신용카드";
		cost =moneyIn*0.8;
	}else if(pay.equals("3")){
		payKind = "휴대폰결제";
		cost = moneyIn;
	}
%>

결제금액 <%= (int)cost %>원 <%= payKind %>로 결제되었습니다.
