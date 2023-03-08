<%@page import="javax.print.attribute.standard.PagesPerMinuteColor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%!  int count;
public void jspInit()
{int a=10;
	count=0;
	
	System.out.println("----init-----");
}

%>
</head>
<body>
<% count++;
pageContext.setAttribute("count", count);
%>
<h2> Visted :<%=count %></h2>
<hr>
Visted :${pageScope.count } Times 









</body>
</html>