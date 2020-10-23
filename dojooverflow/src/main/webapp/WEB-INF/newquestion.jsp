<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Question</title>
</head>
<body>
<h1>What is your question?</h1>
<form method="POST" action="/questions/new">
	<c:out value="${error}" />
	<form:errors path="question.*"/>
	<p>Question:  </p>
	<textarea name="question"></textarea>
	<p>Tags:</p>
	<input type="text" name="tags">
	<input type="submit" value="Submit">
</form>
</body>
</html>