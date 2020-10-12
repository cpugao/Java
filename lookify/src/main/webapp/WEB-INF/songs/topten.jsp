<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>
</head>
<body>
<h3><a href="/dashboard">Dashboard</a></h3>
<h1>Top Ten Songs:</h1>
<ul>
	<c:forEach items="${songs}" var="song">
	<li>
		<h3><c:out value="${song.rating}" /> - <a href="songs/@{song.id}"><c:out value="${song.title}" /></a> - <c:out value="${song.artist}" /></h3>
	</li>
	</c:forEach>
</ul>
</body>
</html>