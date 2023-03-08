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
out.print("<h2>Welcome:"+session.getAttribute("cust_info"));
%>
<hr>
User:${sessionScope.cust_info }
</body>
</html>