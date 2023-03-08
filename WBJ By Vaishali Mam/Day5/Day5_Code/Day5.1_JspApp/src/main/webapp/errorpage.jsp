<%@ page language="java" contentType="text/html; charset=UTF-8"
 isErrorPage="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>error page</h3>
<%=exception.getMessage() %><br>
<%=exception.getClass() %><br>
 <br>
 <hr>
 ERR causing URI :  ${pageContext.errorData.requestURI }<br/>
 ERR code :  ${pageContext.errorData.statusCode}<br/>
 ERR Mesg :  ${pageContext.exception.message} <br/>
 Throwable : ${pageContext.errorData.throwable}<br/>
 Throwable Root cause: ${pageContext.errorData.throwable.cause}
</body>
</html>