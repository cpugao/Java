<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<h2>Submitted Info</h2>
	<div>
		<p>Name: 	<c:out value="${name}"></c:out></p>
		<p>Dojo Location: 	<c:out value="${location}"></c:out></p>
		<p>Favorite Language: 	<c:out value="${language}"></c:out></p>
		<p>Comment: 	<c:out value="${comment}"></c:out></p>
	</div>
	<a href="/">Go back to the survey</a>
</body>
</html>