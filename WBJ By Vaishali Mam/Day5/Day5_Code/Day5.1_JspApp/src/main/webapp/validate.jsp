<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!  
public void jspInit()
{
	System.out.println("----init-----");
}

%>
</head>

<body>
<%-- display User Name and pwd --%>
<%=session.getId() %>
<%
String username=request.getParameter("username");
String pwd=request.getParameter("pass");

out.print("<h3>Welcome:"+username);
if(username.equals("ram")&& pwd.equals("ram@123"))
{
	session.setAttribute("cust_info", username);
response.sendRedirect("welcome.jsp")	;
}
else
{
%>
<a href="login.jsp">Retry</a>
<%} %>















</body>
</html>