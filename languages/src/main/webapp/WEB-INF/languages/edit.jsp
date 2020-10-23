<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Language</title>
</head>
<body>
<form:form action="/languages/${language.id}" method="POST">
  		<input type="hidden" name="_method" value="delete">
  		<input type="submit" value="Delete"/>
  	</form:form>
<p><a href="/languages">Dashboard</a></p>
<br>
<h1>Edit Language</h1>
<form:form action="/languages/${language.id}" method="post" modelAttribute="language">
	<input type="hidden" name="_method" value="put">
	<p>
		<form:label path="name">Name</form:label>
		<form:errors path="name" />
		<form:input path="name" />
	</p>
	<p>
		<form:label path="creator">Creator</form:label>
		<form:errors path="creator" />
		<form:input path="creator" />
	</p>
	<p>
		<form:label path="version">Version</form:label>
		<form:errors path="version" />
		<form:input path="version" />
	</p>
	<input type="submit" value="Submit">
</form:form>
</body>
</html>