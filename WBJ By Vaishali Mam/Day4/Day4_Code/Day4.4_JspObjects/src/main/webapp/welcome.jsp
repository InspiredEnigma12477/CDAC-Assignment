<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>
<%=session.getId() %>
<hr>
<h3>Email:${sessionScope.userinfo }</h3>

</h2>
</body>
</html>