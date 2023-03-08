<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--demo of JSTL Core Lib --%>
<%-- assign and read using set and out --%>
Set:<c:set  value="90" var="no1" ></c:set><br>
Show:<c:out value="${no1}"></c:out>

<%--if --%>
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>



</body>
</html>