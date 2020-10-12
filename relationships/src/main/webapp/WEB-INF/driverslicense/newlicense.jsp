<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
</head>
<body>
	<h1>New License</h1>
	<form:form action="/license" method="post" modelAttribute="license">
	<p>
		<form:label path="person">Person:</form:label>
		<form:select path="person">
			<c:forEach items="${persons}" var="person">
				<form:option value="${person.id}"><c:out value="${person.firstName} ${person.lastName}" /></form:option>
			</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="state">State:</form:label>
		<form:select path="state">
			<c:forEach items="${states}" var="state">
				<form:option value="${state}">
					<c:out value="${state}" />
				</form:option>
			</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="expirationDate">Expiration Date</form:label>
		<form:input type="date" path="expirationDate" />
	</p>
	<input type="submit" value="Create" />
	</form:form>
</body>
</html>