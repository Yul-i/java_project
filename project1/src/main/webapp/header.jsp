<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header class="row">
      <div class="notice_header">
          <div class="container">
              <a href="notice.html"><p>지금 가입하시면 신선한 상품을 빠르게 배송해드려요.<i class="fas fa-angle-right"></i></p></a>
          </div>
      </div>
      <div class="list_header">
          <div class="container">
              <ul class="list_menu">
                  <li><a href="#">회원가입</a></li>
                  <li><a href="#">로그인</a></li>
                  <li><a href="#">공지사항</a></li>
              </ul>
          </div>
      </div>
      <div class="logo_header">
          <div class="container">
              <h1>
                  <a href="index.jsp"><span class="blind">막컬리 logo</span><img src="img/logo.png" alt="logo"></a>
              </h1>
          </div>
      </div>

  </header>
  <nav>
      <div class="container">
          <ul id="gnb">
              <li class="total_menu"><a href="#"><i class="fas fa-bars"></i> 전체 카테고리</a>
                  <div class="sub_nav">
                      <ul class="sub_gnb">
                          <li><a href="#"><i class="fas fa-drumstick-bite"></i>정육·계란</a>
                              <ul class="sub_lnb">               
                                  <li><a href="#">국내산 소고기</a></li>
                                  <li><a href="#">수입산 소고기</a></li>
                                  <li><a href="#">돼지고기</a></li>
                                  <li><a href="#">계란</a></li>
                                  <li><a href="#">닭·오리</a></li>
                                  <li><a href="#">양념육·돈까스</a></li>
                              </ul>
                          </li>
                          <li><a href="#"><i class="fas fa-fish"></i>해산물·생선</a>
                              <ul class="sub_lnb">               
                                  <li><a href="#">생선</a></li>
                                  <li><a href="#">어패류</a></li>
                                  <li><a href="#">갑각류</a></li>
                              </ul>
                          </li>
                          <li><a href="#"><i class="fas fa-carrot"></i>채소</a>
                              <ul class="sub_lnb">               
                                  <li><a href="#">친환경</a></li>
                                  <li><a href="#">고구마·당근·감자</a></li>
                                  <li><a href="#">시금치·쌈채소·나물</a></li>
                                  <li><a href="#">브로콜리·파프리카·양배추</a></li>
                                  <li><a href="#">양파·대파·마늘·배추</a></li>
                                  <li><a href="#">오이·호박·고추</a></li>
                                  <li><a href="#">냉동·간편채소</a></li>
                              </ul>
                          </li>
                          <li><a href="#"><i class="fas fa-apple-alt"></i>과일</a>
                              <ul class="sub_lnb">               
                                  <li><a href="#">친환경</a></li>
                                  <li><a href="#">제철 과일</a></li>
                                  <li><a href="#">국산 과일</a></li>
                                  <li><a href="#">수입 과일</a></li>
                              </ul>
                          </li>
                          <li><a href="#"><i class="fas fa-egg"></i>견과·쌀</a>
                              <ul class="sub_lnb">               
                                  <li><a href="#">견과류</a></li>
                                  <li><a href="#">쌀·잡곡</a></li>
                              </ul></li>
                      </ul>
                  </div>
              </li>
              <li><a href="#">신상품</a></li>
              <li><a href="#">베스트</a></li>
              <li><a href="#">알뜰쇼핑</a></li>
          </ul>
          <div id="side_search">
              <form action="search_page.jsp">
                  <input type="text" placeholder="검색어를 입력해주세요." name="word" id="word">
                  <button type="submit" class="btn_main_search"><span class="blind">검색</span><i class="fas fa-search"></i></button>
              </form>
          </div>
          <div id="sub_menu">
              <a href="basket.html"><i class="fas fa-shopping-cart"></i></a>
          </div>
      </div>
  </nav>
  
  <script>
	
	$('.btn_main_search').click(function(){
		var word = $('#word').val();
		if(word==""){
			alert('검색어를 입력해주세요');
			return false;	
		}else{
			return true;
		}
	});
  </script>