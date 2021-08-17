<%@page import="main.ListUpDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="main.ListUpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="menu_product">
	<div class="container">
        <h2>카테고리별 상품</h2>
        
        <ul class="menu_btn">
            <li class="on" id="MM"><a href="#">정육·계란</a></li>
            <li id="SA"><a href="#" >해산물·생선</a></li>
            <li id="VE"><a href="#" >채소</a></li>
            <li id="FC"><a href="#" >과일</a></li>
            <li id="LB"><a href="#">견과·쌀</a></li>
        </ul>
        <div id="result">
        	<jsp:include page="menuProduct.jsp"></jsp:include>
		</div>
	<script type="text/javascript">
	//ajax 이용한 jsp 통신
	
	
	$('.menu_btn li').click(function(e) {
		e.preventDefault();
		
		var id = $(this).attr('id');
		$.ajax({
		url : "menuProduct1.jsp?id="+id,
		success: function(result) {
			$('#result').empty();
			$('#result').prepend(result);
		}
		,error:function(jqXHR, textStatus, errorThrown){
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
		})
	
	})


	</script>
	</div>
</div>
 