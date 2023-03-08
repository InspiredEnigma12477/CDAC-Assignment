<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5 style="color: red;"><%=exception%></h5>
	<%--out.write(pageContext.getException().getMessage()); --%>
	<h5 style="color: red;">Exception Mesg via EL : ${pageContext.exception.message}</h5>
	<h5 style="color: red;"> Error causing Page : ${pageContext.errorData.requestURI}</h5>
	<h5 style="color: red;"> Error Code : ${pageContext.errorData.statusCode}</h5>

</body>
</html>