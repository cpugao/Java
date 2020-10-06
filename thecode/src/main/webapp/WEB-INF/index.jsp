<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<c:out value="${error}" />
	<form method="POST" action="/confirm">
		<label>What is the code?</label>
		<input type="text" name="code">
		<input type="submit" value="Try Code">
	</form>
</body>
</html>