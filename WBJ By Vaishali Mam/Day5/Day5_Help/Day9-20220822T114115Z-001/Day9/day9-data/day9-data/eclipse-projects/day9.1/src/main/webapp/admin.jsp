<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5 style="color: green;">${sessionScope.user.message}</h5>
	<h5>Hello ${sessionScope.user.validatedUserDetails.name}</h5>
	<h5>You have logged in as
		${sessionScope.user.validatedUserDetails.role}</h5>
		<h5>${sessionScope.tut.message}</h5>
	<h5>
		<a href="add_new_tut.jsp">Add New Tutorial</a>
	</h5>
	<h5>
		<a href="logout.jsp">Log Out</a>
	</h5>
</body>
</html>