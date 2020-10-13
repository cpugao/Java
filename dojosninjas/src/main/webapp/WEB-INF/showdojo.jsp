<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Dojo</title>
</head>
<body>
<h1><c:out value="${dojo.name}" /> Location Ninjas</h1>
<table>
	<thead>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ninjas}" var="ninja">
		<tr>
			<td><c:out value="${ninja.firstName}" /></td>
			<td><c:out value="${ninja.lastName}" /></td>
			<td><c:out value="${ninja.age}" /></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>