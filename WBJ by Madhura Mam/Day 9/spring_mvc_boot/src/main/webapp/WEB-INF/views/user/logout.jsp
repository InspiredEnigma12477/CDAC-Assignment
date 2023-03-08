<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>Hello , ${requestScope.user_details.firstName}
		${requestScope.user_details.lastName}</h5>
	<h5>You have logged out...</h5>
	<h5>You will be automatically taken to the home page shortly...</h5>
</body>
</html>