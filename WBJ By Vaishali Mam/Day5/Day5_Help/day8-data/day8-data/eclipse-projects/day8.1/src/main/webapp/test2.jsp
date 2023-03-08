<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!String mesg = "some mesg";%>
<body>
	<%
	String anotherMesg = "testing 12345";
	pageContext.setAttribute("nm1", 12345);
	%>
	<%@ include file="test3.jsp"%>
</body>
</html>