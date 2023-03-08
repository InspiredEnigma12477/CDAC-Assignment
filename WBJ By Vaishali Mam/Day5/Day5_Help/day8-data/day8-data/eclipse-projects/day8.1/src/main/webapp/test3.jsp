<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>
		Instance var :
		<%=mesg%></h5>
	<h5>
		Local var :
		<%=anotherMesg%></h5>
	<h5>Page Scoped Attribute : ${pageScope.nm1}</h5>
</body>
</html>