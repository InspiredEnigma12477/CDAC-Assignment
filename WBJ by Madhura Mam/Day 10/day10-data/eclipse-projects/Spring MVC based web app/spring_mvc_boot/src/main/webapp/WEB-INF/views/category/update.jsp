<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form method="post" modelAttribute="category123">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Category ID</td>
				<td><form:input type="number" path="id" readonly="true" /></td>
			</tr>
			<tr>
				<td>Update Category Name</td>
				<td><form:input  path="categoryName" /></td>
			</tr>
			<tr>
				<td>Update Category Description</td>
				<td><form:input  path="description" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Category Details" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>