<%@page import="pojos.User"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%!HashMap<String, User> users;

	public void jspInit() {
		users = new HashMap<>();
		users.put("Rama", new User("Rama", "12345", 24));
		users.put("Raj", new User("Raj", "1345", 25));
		users.put("Anita", new User("Anita", "2345", 26));
	}%>
<body>
<h5> Session ID : ${pageContext.session.id}</h5>
	<%
	String userName = request.getParameter("name");
	String userPwd = request.getParameter("pass");
	User user = users.get(userName);
	if (user != null) {
		if (user.getPassword().equals(userPwd)) {
			//successful login
			session.setAttribute("user_dtls", user);
			//redirect
			response.sendRedirect("details.jsp");//CP II
		} else {
	%>
	<h5>
		Invalid Password , Do You want to <a href="login.jsp">Retry</a>?
	</h5>
	<%
	}
	%>
	<%
	} else {
	%>
	<h5>
		Invalid Email , Do You want to <a href="register.jsp">Register</a>?
	</h5>
	<%
	}
	%>

</body>
<%!public void jspDestroy() {
		users = null;
	}%>
</html>