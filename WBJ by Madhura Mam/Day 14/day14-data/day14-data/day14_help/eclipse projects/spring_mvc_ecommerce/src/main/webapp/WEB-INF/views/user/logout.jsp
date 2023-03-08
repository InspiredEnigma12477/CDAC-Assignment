<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Hello , ${requestScope.details.firstName}
		${requestScope.details.lastName}</h4>
	<h5>You have logged out !</h5>
	<h5>You will be automatically taken to the home page shortly.....</h5>
</body>
</html>