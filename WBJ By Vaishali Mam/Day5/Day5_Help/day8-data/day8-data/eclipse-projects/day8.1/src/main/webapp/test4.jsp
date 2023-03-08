<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>From 1st page ....</h5>
	<%
	out.flush();//java.lang.IllegalStateExc
	//create a request scoped attribute to store product details 
	request.setAttribute("product_dtls", "PID " + request.getParameter("pid") + " Sold @ " + request.getParameter("price"));
	// forward the clnt to test5.jsp n display details
	%>
	<jsp:include page="test5.jsp">
		<jsp:param value="oil" name="category" />
		<jsp:param value="veg oil" name="desc" />
	</jsp:include>
	<h5>Dyn contents from the 1st page again...</h5>
</body>
</html>