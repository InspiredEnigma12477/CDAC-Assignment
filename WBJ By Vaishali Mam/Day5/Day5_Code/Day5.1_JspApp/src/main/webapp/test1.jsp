<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("pageObj", "this is pageContext Objected created on Test1");
request.setAttribute("reqObj", "this is request Objected created on Test1");
session.setAttribute("sessionObj", "this is session Objected created on Test1");
application.setAttribute("appObj", "this is Application Objected created on Test1");
System.out.println("---test1.jsp---");
//response.sendRedirect("test2.jsp");
RequestDispatcher rd=request.getRequestDispatcher("test2.jsp");
rd.forward(request, response);
%>













</body>
</html>