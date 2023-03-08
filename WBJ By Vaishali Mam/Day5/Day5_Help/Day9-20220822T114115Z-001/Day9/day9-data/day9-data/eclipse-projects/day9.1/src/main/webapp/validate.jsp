<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--import JSTL supplied core tag lib --%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<jsp:setProperty property="*" name="user"/>
<body>
<%--invoke B.L method of UserBean without scriptlet --%>
<%-- <h5> Status : ${sessionScope.user.validateUser()}</h5> --%>
<c:redirect url="${sessionScope.user.validateUser()}.jsp"/>
</body>
</html>