<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>Validated Customer Details : ${sessionScope.user_details}</h5>
<h5>Total Cart Items : ${sessionScope.user_details.cart.totalItems}</h5>
</body>
</html>