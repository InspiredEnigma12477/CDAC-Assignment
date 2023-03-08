<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import Spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>
		<spring:url var="url" value="/user/login" />
		<a href="${url}">User Login</a>
	</h4>
	<h4>
		<spring:url var="url" value="/user/register" />
		<a href="${url}">User Sign Up</a>
	</h4>
</body>
</html>