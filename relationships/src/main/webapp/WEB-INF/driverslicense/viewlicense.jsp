<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View License</title>
</head>
<body>
<h1><c:out value="${license.person.firstName} ${license.person.lastName}" /></h1>
<h3>License Number:  <c:out value="${license.number}" /></h3>
<h3>State:  <c:out value="${license.state}" /></h3>
<h3>Expiration Date:  <fmt:formatDate pattern="MM-dd-yyyy" value="${license.expirationDate}" /></h3>
</body>
</html>