<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DashBoard</title>
</head>
<body>
<h1>Questions Dashboard</h1>
<table>
	<thead>
		<tr>
			<td>Question</td>
			<td>Tags</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${questions}" var="question">
		<tr>
			<td><a href="/questions/${question.id}"><c:out value="${question.question}" /></a></td>
			<td><c:out value="${question.showTags()}" /></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a href="/questions/new">New Question</a>
</body>
</html>