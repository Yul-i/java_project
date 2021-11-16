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
		$('#b1').click(function(){
			$.ajax({
				url: "jsonResponse1",
				success : function(json) {
					//alert(json.id)
					$('div').append("-id : " + json.id + "<br>");
					$('div').append("- name : " + json.name + "<br>");
					$('div').append("- url : " + json.url + "<br>");
					$('div').append("- img : <img src=" + json.img + "/><br><a href="+json.url+">ㅇㅅㅇ</a>");
				}
			})
		})//b1
		
		$('#b2').click(function() {
		      $.ajax({
		         url: "jsonResponse2",   //annotation
		         success: function(jsonList) {
		            alert(jsonList.length)   //길이
		            console.log(jsonList)
		            $(jsonList).each(function(index, json) {   //.each로 가져오는 건 index, json
		               one = json.id + ", "
		                     + json.name + ", "
		                     + json.url + ", "
		                     + "<img src="+json.img+"><br>"
		               $('div').append(index+": " + one)
		            })//end of each
		         }
		      })
		 })//b2
		
	})
</script>
</head>
<body>
	<button id="b1" style="background:yellow">Bag Json</button>
	<button id="b2" style="background:orange">BagLicst Json</button>
	<hr color="red">
	<div>
	
	</div>
</body>
</html>