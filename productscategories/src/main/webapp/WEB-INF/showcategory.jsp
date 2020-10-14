<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Category</title>
</head>
<body>
<h1><c:out value="${category.name}"/></h1>
<h2>Products:</h2>
	<c:forEach items="${category.products}" var="prod">
		<h3>-<c:out value="${prod.name}"/></h3>
	</c:forEach>
<form:form action="/attachproduct" method="post" modelAttribute="categoryProductObj">
	<h2>
	<form:label path="product">Add Product:</form:label>
		<form:select path="product">
		<c:forEach items="${products}" var="prod">
			<form:option value="${prod.id}"><c:out value="${prod.name}"/></form:option>
		</c:forEach>
		</form:select>
	</h2>
	<form:hidden path="category" value="${category.id}" />
		<input type="submit" value="Create"/>	 
	</form:form>
</body>
</html>