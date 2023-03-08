<%@page import="com.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=session.getId()%>
	<%--create object of Product class --%>
	<%
	Product prd = new Product(Integer.parseInt(request.getParameter("pid")), request.getParameter("name"),
			Double.parseDouble(request.getParameter("price")));

	session.setAttribute("product", prd);
	out.print("Added in DB");

	//BL for add prd in DB

	//client pull
	//response.sendRedirect("logout.jsp");//will not session if cookies are disabled

	//use
	//response.encodeRedirectURL(response.encodeURL("logout.jsp"));
	String url = response.encodeURL("logout.jsp");
	%>


	<a href='<%=url %>'>Logout</a>



</body>
</html>