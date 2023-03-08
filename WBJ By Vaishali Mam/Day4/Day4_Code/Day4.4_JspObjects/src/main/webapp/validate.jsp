<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>This is Validate.Jsp File</h3>
	<%--BL for validating User --%>

	<%--get email and password from login.jsp --%>
	<%
	String email = request.getParameter("em");

	String pass = request.getParameter("pass");
	out.write("<h3>Welcome :"+email+"</h3>");
	 if(email.equals("IACSD") && pass.equals("123"))
	 {
		 session.setAttribute("userinfo", email);
		response.sendRedirect("welcome.jsp");
	 }
	else
		response.sendRedirect("login.jsp"); 
	%>
<hr><%--jsp expression --%>
<%=request.getParameter("em") %>
<br>
<i><%=request.getParameter("pass") %></i>
<hr>
<%--EL --%>
User Email: <h4>${param.em}</h4>








</body>
</html>