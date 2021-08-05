<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#btn').click(function(){
		var contentTag = $('#content');
		var result1Tag = $('#result1');
		var contentValue = contentTag.val();
		if (contentValue=='') {
			alert('내용을 입력해주세요.');
		}else{
			result1Tag.append('<p>'+contentValue+'</p><hr>');
		}		
		contentTag.val('');
	})
})
</script>
</head>
<body>
	댓글 입력 : <input id="content">
	<button id="btn">댓글달기</button>
	<hr color="red">
	<div id="result1"></div><br>
</body>
</html>