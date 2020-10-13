<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo Form</title>
</head>
<body>
<h1>New Dojo</h1>
<form:form action="/dojos" method="POST" modelAttribute="dojo">
	<p>
		<form:label path="name">Name:  </form:label>
		<form:input path="name" />
	</p>
	<input type="submit" value="Create">
</form:form>
</body>
</html>