<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	li{
		list-style : none;
	}
</style>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$('#b1').click(function(){
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.korea.kr%2Frss%2Fpolicy.xml&api_key=3q7rnz9teziro8g9qvs0mdubeb8lbt7jpfuo2wcb",
				data : {
					url : "https://www.korea.kr/rss/policy.xml",
					api_key : "3q7rnz9teziro8g9qvs0mdubeb8lbt7jpfuo2wcb",
					count : 20
				},
				success : function(doc) {
					//alert(doc)
					list = doc.items;
					console.log("개수는 "+list.length)
					//items목록을 가지고 와서, 개수 프린트!
					//반복문으로 전체를 프린트!
					$(list).each(function(index, item){
						$('ul').append("<li><a href="+list[index].link+">"+list[index].title+"</a><small>"+list[index].pubDate+"</small><p>"+list[index].link+"</p></li><hr>");
						
						var title = list[index].title;
						var link = list[index].link;
						var pubDate = list[index].pubDate;
						var author = list[index].author;
						
						$.ajax({
							url : "newsGo",
							data : {
								title,
								link,
								pubDate,
								author
							},
							success : function(){
								console.log("db insert 성공");
							}
						})
					})
				}
			})
		})
	})
</script>
</head>
<body>
	<button id="b1">연예인 뉴스를 가지고 오자</button>
	<hr>
	<ul>
		
	</ul>
</body>
</html>