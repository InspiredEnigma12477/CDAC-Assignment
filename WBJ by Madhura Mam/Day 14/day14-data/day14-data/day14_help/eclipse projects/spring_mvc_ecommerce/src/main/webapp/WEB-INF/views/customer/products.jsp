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

	<spring:url var="url" value="/customer/product_details" />
	<form method="get" action="${url}">

		<table style="background-color: lightgrey; margin: auto">
			<caption>All Available Products under Category ID
				${param.catId}</caption>
			<c:forEach var="product" items="${requestScope.product_list}">
				<tr>
					<td><input type="radio" name="pid" value="${product.id}" /></td>
					<td>${product.productName}</td>
				</tr>
			</c:forEach>
			<tr>
				<td><input type="submit" value="Choose A Product" /></td>
			</tr>

		</table>
	</form>
</body>
</html>