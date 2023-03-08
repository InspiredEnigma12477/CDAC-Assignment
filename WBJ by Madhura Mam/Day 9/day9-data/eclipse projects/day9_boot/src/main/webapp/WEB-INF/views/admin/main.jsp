<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%--import spring supplied JSP tag lib --%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>Hello , ${sessionScope.user_details.firstName}
		${sessionScope.user_details.lastName}</h5>
	<h5>Currently logged in as : ${sessionScope.user_details.userRole}</h5>
	<spring:url var="url1" value="/admin/categories"/>
	<h5><a href="${url1}">Category Management</a></h5>
	<spring:url var="url2" value="/user/logout"/>
	<h5><a href="${url2}">Log Out</a></h5>
</body>
</html>