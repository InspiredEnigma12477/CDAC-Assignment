<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="email">
		<table>
			<tr>
				<td><form:errors /></td>
			</tr>
			<tr>
				<td>To :</td>
				<td><form:input path="destEmail" /></td>
			</tr>
			<tr>
				<td>Subject :</td>
				<td><form:input path="subject" /></td>
			</tr>
			<tr>
				<td>Message :</td>
				<td><form:textarea path="message" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Send Mail" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>