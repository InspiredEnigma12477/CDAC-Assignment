<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag lib --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--import spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center" style="color: green;">${requestScope.mesg}</h4>
	<%-- <h5>Validated User Details : ${sessionScope.user_details}</h5> --%>
	<h5>Hello , ${sessionScope.user_details.firstName}
		${sessionScope.user_details.lastName}</h5>
	<spring:url var="url" value="/customer/products" />
	<form action="${url}">
		<table style="background-color: lightgrey; margin: auto">
			<caption>Available Categories</caption>
			<c:forEach var="cat" items="${requestScope.category_list}">
				<tr>
					<td><input type="radio" name="categoryId" value="${cat.id}" /></td>
					<td>${cat.categoryName}</td>
				</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="Choose A Catgory" /></td>
				<spring:url var="url" value="/user/logout" />

				<td><a href="${url}">Log Me Out</a></td>
			</tr>

		</table>

	</form>
</body>
</html>