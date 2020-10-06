<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter Page</title>
</head>
<body>
	<h3>You have visited <a href="/counter">this page</a> <c:out value="${counter}" /> times</h3>
	<br>
	<a href="/">Test Another Visit</a>
</body>
</html>