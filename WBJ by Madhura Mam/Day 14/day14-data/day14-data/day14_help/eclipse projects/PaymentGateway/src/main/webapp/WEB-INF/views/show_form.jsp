<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<spring:url value="/process_form" var="url"/>
	<form:form action="${url}" method="post" modelAttribute="cardDto">

		<table style="background-color: lightgrey; margin: auto">
			<caption>Payment Card Information</caption>

			<tr>
				<td>Enter Card Number</td>
				<td><form:input path="cardNo" /></td>
				<td><form:errors path="cardNo" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Enter Customer Name</td>
				<td><form:input path="customerName" /></td>
				<td><form:errors path="customerName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter Card Expiry Date</td>
				<td><form:input type="date" path="expiryDate" /></td>
				<td><form:errors path="expiryDate" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Enter CVV</td>
				<td><form:input type="password" path="cvv" /></td>
				<td><form:errors path="cvv" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Payment Amount</td>
				
				<td><form:input type="number" path="amount" readonly="true"/></td>
				<td><form:errors path="amount" cssClass="error" /></td>
			</tr>			
			<tr>
				<td><input type="submit" value="Make Payment" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>