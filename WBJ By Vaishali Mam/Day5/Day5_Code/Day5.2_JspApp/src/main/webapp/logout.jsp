<%@ page language="java" contentType="text/html; charset=UTF-8"
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
This is Logput Page
<br>
<h3> Added Prd Details :<%=session.getAttribute("product") %></h3>
<hr>
Details:${sessionScope.product}












</body>
</html>