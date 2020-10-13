<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja Form</title>
</head>
<body>
<h1>New Ninja</h1>
<form:form action="/ninjas" method="POST" modelAttribute="ninja">
	<p>
		<form:label path="dojo">Dojo:  </form:label>
		<form:select path="dojo" name="dojo">
		<c:forEach items="${dojos}" var="dojo">
			<form:option value="${dojo.id}"><c:out value="${dojo.name}" /></form:option>
		</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="firstName">First Name:  </form:label>
		<form:input path="firstName" />
	</p>
	<p>
		<form:label path="lastName">Last Name:  </form:label>
		<form:input path="lastName" />
	</p>
	<p>
		<form:label path="age">Age:  </form:label>
		<form:input path="age" />
	</p>
	<input type="submit" value="Create">
</form:form>
</body>
</html>