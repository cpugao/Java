<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Language</title>
</head>
<body>
<p><a href="/languages">Dashboard</a></p>
<h1><c:out value="${language.name}" /></h1>
<h3><c:out value="${language.creator}" /></h3>
<h3><c:out value="${language.version}" /></h3>
<a href="/languages/edit/${language.id}">Edit</a>
<form:form action="/languages/${language.id}" method="POST">
  		<input type="hidden" name="_method" value="delete">
  		<input type="submit" value="Delete"/>
  	</form:form>
</body>
</html>