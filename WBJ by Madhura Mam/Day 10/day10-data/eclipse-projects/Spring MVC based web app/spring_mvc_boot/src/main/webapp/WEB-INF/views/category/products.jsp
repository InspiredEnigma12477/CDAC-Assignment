<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<c:choose>
		<c:when test="${empty requestScope.product_list}">
			<h4>No Products under this Category : ${param.catName}</h4>
		</c:when>
		<c:otherwise>
			<table style="background-color: lightgrey; margin: auto">
				<caption>Available Products</caption>
				<c:forEach var="product" items="${requestScope.product_list}">
					<tr>
						<td>${product.id}</td>
						<td>${product.productName}</td>
						<td>${product.price}</td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	<spring:url var="url2" value="/user/logout" />
	<h5>
		<a href="${url2}">Log Out</a>
	</h5>


</body>
</html>