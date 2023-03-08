<%@page import="java.util.List"%>
<%@page import="dao.TopicDaoImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Topic"%>
<%@page import="bean.UserBean"%>
<%@page import="pojos.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <jsp:useBean id="topicDao" class="dao.TopicDaoImpl" scope="session"></jsp:useBean>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
User  obj=((UserBean)session.getAttribute("beanObj")).getValidatedUser();
%>
<h2>Welcome Customer:  </h2>
 
${sessionScope.beanObj.getValidatedUser() }
<hr>
<h4>Name:${ sessionScope.beanObj.getValidatedUser().getName()}</h4>
<hr>
All Topics:
<table>
<tr><th>Topic Id</th><th>Topic Name</th></tr>
<c:forEach var="topic" items="${sessionScope.topicDao.getAllTopics()}">
<tr>
<td>
<c:out value="${topic.getTopicId() }"/>
</td>
<td>
<c:out value="${topic.getTopicName() }"/></td>
</tr>
</c:forEach>
</table>





<%-- ${sessionScope.topicDao.getAllTopics()}--%>
<hr>
<%-- 
<%
 List<Topic> allTopics=((TopicDaoImpl)session.getAttribute("topicDao")).getAllTopics();
%>
--%>




<%-- 
<table border="1">
<tr><th>Topic Id</th><th>Topic Name</th></tr>
<% for(Topic t:allTopics)
{
	%>
	<tr><td><%=t.getTopicId() %></td> 
	  <td><%=t.getTopicName()%></td>
	  </tr>
	<%
}
%>

</td></tr>
</table>--%>
</body>





</html>










