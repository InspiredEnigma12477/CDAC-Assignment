<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" 
contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=session.getId() %>
<hr>
<h2>Welcome To JSP @ <%=LocalDateTime.now() %></h2>
<hr>
<a href="login.jsp">Login</a>
<hr>
<a href="visits.jsp">Visit</a>
<hr>
<a href="test1.jsp">Test Scopes in JSP</a>

<hr>
<a href="Test4.jsp">Test Exceptions</a>


</body>
</html>