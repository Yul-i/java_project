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
			url: "json.jsp",
			success : function(jsonResult) {
				alert(jsonResult)
			}
		})
	})
</script>
</head>
<body>

</body>
</html>