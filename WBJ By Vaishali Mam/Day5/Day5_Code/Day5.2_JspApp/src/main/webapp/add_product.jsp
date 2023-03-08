<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=session.getId() %>
<form action="save_product.jsp" method="post">
<table> 
<tr><td>PrdId</td><td><input type="text" name="pid"></td></tr>
<tr><td>Name</td><td><input type="text" name="name"></td></tr>
<tr><td>price</td><td><input type="text" name="price"></td></tr>
<tr><td><input type="submit" value="Add"></td></tr>

</table>


</form>
</body>
</html>