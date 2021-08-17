<%@page import="java.util.ArrayList"%>
<%@page import="main.ListUpDTO"%>
<%@page import="main.ListUpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <% 
    	String word = request.getParameter("word");
    	ListUpDAO dao = new ListUpDAO();
    	ListUpDTO dto = new ListUpDTO();
    	
    	ArrayList<ListUpDTO> list = dao.search(word);
    %>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- icon Style -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <!-- swiper Style -->
    <link rel="stylesheet"href="https://unpkg.com/swiper/swiper-bundle.min.css"/>
    <!-- common Style -->
    <link rel="stylesheet" href="css/style.css">
    <!-- jquery CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <title>막컬리::매일매일 신선한 장보기</title>
</head>
<body>
    <div id="wrap">
    	<!-- header 건들지마시오 -->
        <jsp:include page="header.jsp"></jsp:include>
 
        <div id="contents">
	        <!-- 이곳 안으로 편집해주시면 됩니다. 가운데 정렬은 class="container"걸어주시면 자동으로 걸립니다. -->
   			<div class="search_page">
			    <div class="container">
			        <h2>검색 결과</h2>
			        <div class="search_box">
			        	<form action="search_page.jsp">
				            <label>검색조건<input type="text" name="word" id="search" placeholder="검색어를 입력해주세요."></label>
				            <button class="btn_search_result"><i class="fas fa-search"></i></button>
			        	</form>
			        </div>
			        <p class="search_result">총 <span class="result_count">0<%= list.size() %></span>건이 검색되었습니다.</p>
			        <div class="search_list">
			            <ul>
			            	<%
			            		for(ListUpDTO loop :list){
			            	%>
			            	<li>
			                    <a href="#">
			                        <div class="img_box"><img src="./img/<%= loop.getProductPic() %>" alt="<%= loop.getProductName()%>"></div>
			                        <div class="text_box">
			                            <p><%= loop.getProductName()%></p>
			                            <span><%= loop.getProductPrice()%>원</span>
			                        </div>
			                    </a>
			                </li>
							<%}%>
			            </ul>
			        </div>
			    </div>
			</div>
        </div>
        <!-- footer 건들지마시오 -->
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
    <script type="text/javascript">
		$('.btn_search_result').click(function(){
			var word = $('#search').val();
			if(word==""){
				alert('검색어를 입력해주세요');
				return false;	
			}else{
				return true;
			}
		});
		
		
    </script>
</body>
</html>