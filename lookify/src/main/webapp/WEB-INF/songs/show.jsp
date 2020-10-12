<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Song</title>
</head>
<body>
<a href="/dashboard">Dashboard</a>
<h1>Title:  <c:out value="${song.title}" /></h1>
<h3>Artist: <c:out value="${song.artist}" /></h3>
<h3>Rating (1-10):  <c:out value="${song.rating}" /></h3>
<a href="/delete/<c:out value="${song.id}" />">Delete</a>
</body>
</html>