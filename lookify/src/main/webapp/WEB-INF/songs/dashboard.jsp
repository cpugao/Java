<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<div class="container">
		<div class="top">
			<h3><a href="/songs/new">Add New</a></h3>
			<h3><a href="/search/topten">Top Songs</a></h3>
			<div class="searchform">
				<form action="/search" method="post">
					<input class="form" type="submit" value="Search Artists">
					<input class="form" type="search" name="artist" placeholder="Artist">
				</form>
			</div>
		</div>
		<table>
			<thead>
				<tr>
					<th>Title</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
				<tr>
					<td><a href="/songs/${song.id}"><c:out value="${song.title}" /></a></td>
					<td><c:out value="${song.rating}" /></td>
					<td>
						<a href="/delete/<c:out value="${song.id}" />">Delete</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>