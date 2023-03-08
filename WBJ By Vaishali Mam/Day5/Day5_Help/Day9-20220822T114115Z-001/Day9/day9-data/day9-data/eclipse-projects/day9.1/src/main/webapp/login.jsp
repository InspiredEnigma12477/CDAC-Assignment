<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="user" class="beans.UserBean" scope="session" />
<jsp:useBean id="topic" class="beans.TopicBean" scope="session"/>
<jsp:useBean id="tut" class="beans.TutorialBean" scope="session"/>
<body>
<h5 style="color: red;">${sessionScope.user.message}</h5>
	<form action="validate.jsp" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter User Email</td>
				<td><input type="email" name="email" required /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" required /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>