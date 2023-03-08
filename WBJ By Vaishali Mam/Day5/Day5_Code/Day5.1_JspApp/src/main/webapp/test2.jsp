<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>Retrive Diff objtects created on test1.jsp </h2>

<%=pageContext.getAttribute("pageObj") %><br>
<%=request.getAttribute("reqObj") %><br>
<%=session.getAttribute("sessionObj") %><br>
<%=application.getAttribute("appObj") %>
 
<hr>
<a href="test3.jsp">Logout</a>
</body>
</html>