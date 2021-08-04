<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String productId = request.getParameter("productId");
	String productName = request.getParameter("productName");
	String total = request.getParameter("total");
	int total2 = Integer.parseInt(total);
	String uId = request.getParameter("uId");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- jQuery -->
 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js" ></script>
 <!-- iamport.payment.js -->
 <script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
 <script type="text/javascript">
	function pay() {
		var IMP = window.IMP; // 생략가능
		IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
		
		IMP.request_pay({
		pg : 'inicis', // version 1.1.0부터 지원.
		pay_method : 'card',
		merchant_uid : 'merchant_' + new Date().getTime(),
		name : '<%= productName %>', 
		amount : <%=total2 %>,
		buyer_email : 'iamport@siot.do',
		buyer_name : '<%= uId %>',
		buyer_tel : '010-1234-5678',
		buyer_addr : '서울특별시 강남구 삼성동',
		buyer_postcode : '123-456',
		m_redirect_url : 'www.yourdomain.com/payments/complete'
		}, function(rsp) {
		if ( rsp.success ) {
		var msg = '결제가 완료되었습니다.';
		msg += '고유ID : ' + rsp.imp_uid;
		msg += '상점 거래ID : ' + rsp.merchant_uid;
		msg += '결제 금액 : ' + rsp.paid_amount;
		msg += '카드 승인번호 : ' + rsp.apply_num;
		console.log(msg);
		location.href = "pay05.jsp?uId=<%= uId %>&productId=<%= productId %>&productName=<%= productName %>&total=<%= total2 %>"
		} else {
		var msg = '결제에 실패하였습니다.';
		msg += '에러내용 : ' + rsp.error_msg;
		alert(msg);
		console.log(msg);
		}
		});
	}
</script>
</head>
<body>
<script type="text/javascript">
	pay();</script>
</body>
</html>