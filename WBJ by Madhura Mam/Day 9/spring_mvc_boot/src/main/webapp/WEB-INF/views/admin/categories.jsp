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
	<h5>${requestScope.mesg}</h5>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Available Categories</caption>
		<c:forEach var="category" items="${requestScope.category_list}">
			<tr>
				<td>${category.id}</td>
				<td>${category.categoryName}</td>
				<td>${category.description}</td>
				<%-- <td>${category.products}</td> --%>
				<td><a
					href="<spring:url value='/categories/update?catId=${category.id}' />">Update</a></td>
				<td><a
					href="<spring:url value='/categories/delete/${category.id}'/>">Delete</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td><a href="<spring:url value='/categories/add'/>">Add New
					Category</a></td>
			<td></td>
			<td><a href="<spring:url value='/admin/main' />">Back</a></td>
		</tr>
	</table>
</body>
</html>