<%@page import="bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <jsp:useBean id="beanObj" class="bean.UserBean" scope="session" >
   <jsp:setProperty name="beanObj" property="*" /> 
   </jsp:useBean>
  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--validation of User 
<% 
UserBean beanObj=new UserBean();
beanObj.setUsername(request.getParameter("username"));
beanObj.setPass(request.getParameter("pass"));
session.setAttribute("beanObj",beanObj);
String strRole=beanObj.validateUser();

%>

--%>

<%
String role=beanObj.validateUser();
%>
<jsp:forward page='<%=role%>'></jsp:forward>





</body>
</html>