<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
	<h5>${requestScope.mesg}</h5>
	<spring:url var="url" value="/categories/show_products" />
	<form action="${url}" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<caption>Available Categories</caption>

			<tr>
				<td><select name="catName">
						<c:forEach var="category" items="${requestScope.category_list}">
							<option value="${category.categoryName}">${category.categoryName}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Choose A Category" /></td>
			</tr>
		</table>
	</form>
</body>
</html>