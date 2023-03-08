<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="emp" class="beans.EmployeeBean" scope="session" />
<jsp:setProperty property="*" name="emp"/>
<body>
<c:forEach var="e" items="${sessionScope.emp.fetchEmpList()}">
${e.empId} ${e.firstName} ${e.lastName} ${e.salary} <br/>
</c:forEach>
</body>
</html>