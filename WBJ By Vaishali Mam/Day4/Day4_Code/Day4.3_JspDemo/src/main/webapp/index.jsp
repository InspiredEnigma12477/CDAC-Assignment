<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome To JSP</h2>

<%=LocalDateTime.now()  %>
<%-- this is server side comment --%>
<hr>
<%-- comment text --%>

 <!-- this is cliient side comment -->
 <hr>
<h2>JSP Scriptlets</h2>
<%
int no1=10;
int no2=40;
int c=no1+no2;
out.write("Addition="+c);
%>

<hr><h3>JSP Expression</h3>
<%=LocalDateTime.now() %>


<hr><h3>JSP Declaration</h3>
<%! int i=10; %>
<br>
<%=i %>







</body>
</html>