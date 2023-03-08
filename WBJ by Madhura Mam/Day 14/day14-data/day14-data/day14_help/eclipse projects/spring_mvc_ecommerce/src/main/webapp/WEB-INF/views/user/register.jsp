<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- import spring supplied JSP form tag lib to enable data binding--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<%--firstName, String lastName, String email, String password, Role role --%>
	<form:form method="post" modelAttribute="new_user">
	
		<table style="background-color: lightgrey; margin: auto">
			<caption>User Registration Form</caption>

			<tr>
				<td>Enter First Name</td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error"/></td>
				
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><form:input type="email" path="email" /></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><form:input type="password" path="password" /></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Choose Role</td>
				
				<td><form:radiobutton path="userRole" value="CUSTOMER" />Customer</td>
				<td><form:radiobutton path="userRole" value="ADMIN" />Admin</td>
				<td><form:errors path="userRole" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td>Enter Aadhar Card No</td>
				<td><form:input  path="card.cardNo" /></td>
				<td><form:errors path="card.cardNo" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Location</td>
				<td><form:input  path="card.location" /></td>
				<td><form:errors path="card.location" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Select Creation Date</td>
				<td><form:input type="date" path="card.creationDate" /></td>
				<td><form:errors path="card.creationDate" cssClass="error"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register Me" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>