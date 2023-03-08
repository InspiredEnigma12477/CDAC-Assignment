<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Category</title>
</head>
<body>

	<form:form method="post" modelAttribute="category">
		<table style="background-color: lightgrey; margin: auto">			
			<tr>
				<td>Enter Category Name</td>
				<td><form:input  path="categoryName" /></td>
			</tr>
			<tr>
				<td>Enter Category Description</td>
				<td><form:input  path="description" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add New Category Details" /></td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>