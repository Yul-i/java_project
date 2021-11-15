<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		
		$.ajax({
			url: "resources/text/rank.xml",
			success : function(xmlResult) {
				alert(xmlResult)
				list = $(xmlResult).find('rank')
				//alert(list.length+"개 "+$(list[0]).find('name').text())
		/* 		for (var i = 0; i < list.length; i++) {
					console.log($(list[i]).find('name').text());
				} */
				$(list).each(function(i, x){
					//console.log($(x).find('name').text())
					//console.log($(x).find('tel').text())
					n = $(x).find('name').text()
					t = $(x).find('tel').text()
					
					$.ajax({
						url : "dbGo",
						data : {
							name : n,
							tel : t,
						},
						success : function(){
							console.log("db insert 성공");
						}
					})
				})
			}
		})
	})
</script>
</head>
<body>
	<div style-"background:yellow; color:blue; font-size: 20;"></div>
</body>
</html>