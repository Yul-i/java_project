<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			cateValue = $(this).text()
			$.ajax({
				url: "ajax02.jsp",
				data: {
					cate : cateValue
				},
				success: function(result) {
					$('#result').html(result)
				}
			})
		})
	})
</script>
</head>
<body>
<button id="b1">채소</button>
<div id = 'result'></div>
</body>
</html>