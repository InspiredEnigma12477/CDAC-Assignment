<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>All Dept Names :</h5>
	<form method=post>
		<table style="background-color: lightgrey; margin: auto">
			<caption>All Department Names</caption>

			<tr>
				<td>Choose Department</td>

				<td><select name="dept_name">
						<c:forEach var="deptNm" items="${requestScope.dept_list}">
							<option value="${deptNm}">${deptNm}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
			<td><input type="submit" value="Choose A Department"/></td>
			</tr>

		</table>
	</form>
</body>
</html>