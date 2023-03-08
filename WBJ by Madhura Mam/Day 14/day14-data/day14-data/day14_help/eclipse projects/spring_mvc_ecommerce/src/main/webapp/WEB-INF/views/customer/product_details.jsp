<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4 align="center">Product Details : ${requestScope.product_dtls}</h4>
	<spring:url var="abc" value="/customer/add_to_cart" />
	<form action="${abc}">
		<table style="background-color: lightgrey; margin: auto">
			<caption>Product Details</caption>

			<tr>
				<td>Enter Quantity</td>
				<td><input type="number" name="quantity" /></td>
				<td><input type="hidden" name="productId"
					value="${requestScope.product_dtls.id}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add To cart" /></td>
				<spring:url var="url" value="/customer/categories" />
				<td><a href="${url}">Back To Categories</a></td>
			</tr>
		</table>
	</form>

</body>
</html>