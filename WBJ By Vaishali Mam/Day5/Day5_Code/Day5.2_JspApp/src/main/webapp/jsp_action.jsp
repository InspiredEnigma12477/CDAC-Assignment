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
<h3>This is Test JSP Action Page</h3>
<hr>
<%=LocalDateTime.now() %>
<hr>
<%-- <%@include file="anotherpage.jsp" %> --%>

<%--  <jsp:include page="anotherpage.jsp"></jsp:include>--%>
<jsp:forward page="anotherpage.jsp">
<jsp:param value="this is user name" name="param1"/>
<jsp:param value="9054646" name="cellno"/>

</jsp:forward>
</body>
</html>