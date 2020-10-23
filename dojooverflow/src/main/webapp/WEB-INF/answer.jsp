<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Answer Question</title>
</head>
<body>
<h1><c:out value="${question.question}" /></h1>
<h3>Tags: </h3>
<c:forEach items="${question.tags}" var="tag">
	<c:out value="${tag.subject}" />
</c:forEach>
<table>
	<thead>
		<tr>
			<td>Answers:</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${question.answers}" var="answer">
			<tr>
				<td><c:out value="${answer.answer}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<form:form action="/answers/${question.id}/new" method="POST" modelAttribute="answer">
	<c:out value="${error}" />
	<form:errors path="answer.*" />
	<h3>Add your answer:</h3>
	<form:textarea path="answer" name="answer"></form:textarea>
	<input type="submit" value="Answer it!">
</form:form>
</body>
</html>