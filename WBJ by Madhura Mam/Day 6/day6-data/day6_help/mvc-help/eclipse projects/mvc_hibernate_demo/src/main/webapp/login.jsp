<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="cust" class="beans.CustomerBean" scope="session" />
<body>
	<form action="<c:url value='validate123'/>">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>User Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>User Password</td>
				<td><input type="password" name="pass" /></td>
				<td><input type="hidden" name="cmd" value="login" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>



			</tr>
		</table>
	</form>

</body>
</html>