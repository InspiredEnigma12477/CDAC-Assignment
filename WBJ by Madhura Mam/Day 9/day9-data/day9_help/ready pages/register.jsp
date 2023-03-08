<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--firstName, String lastName, String email, String password, Role role --%>
	<form method="post">
		<table style="background-color: lightgrey; margin: auto">
			<caption>User Registration Form</caption>

			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><input type="text" type="email" path="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="text" type="password" path="password" /></td>
			</tr>
			<tr>
				<td>Choose Role</td>
				<%-- <td><input type="text"  path="role" /></td> --%>
				<td><form:radiobutton path="role" value="CUSTOMER" />Customer</td>
				<td><form:radiobutton path="role" value="ADMIN" />Admin</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>