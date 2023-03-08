<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--form will be submitted : http://host:port/spring_mvc_lab/products/desc, method : POST --%>
	<form  method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter Desc Keyword</td>
				<td><input type="text" name="keyword" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enter Product Desc Keyword" />
				</td>
			</tr>
		</table>
	</form>

</body>
</html>