<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Form</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<div class="formdiv">
		<form method="POST" action="/confirm">
			<label>Your Name: 	</label>
			<input type="text" name="name">
			<label>Dojo Location: 	</label>
			<select id="location" name="location">
				<option value="Arlington">Arlington</option>
				<option value="Bellevue">Bellevue</option>
				<option value="Boise">Boise</option>
				<option value="Chicago">Chicago</option>
				<option value="Dallas">Dallas</option>
				<option value="Los Angeles">Los Angeles</option>
				<option value="Oakland">Oakland</option>
				<option value="Orange County">Orange County</option>
				<option value="San Jose">San Jose</option>
				<option value="Tulsa">Tulsa</option>
				<option value="Online">Online</option>
			</select>
			<label>Favorite Language: 	</label>
			<select id="language" name="language">
				<option value="Python">Python</option>
				<option value="MERN">MERN</option>
				<option value="Java">Java</option>
				<option value="C#">C#</option>
				<option value="Ruby">Ruby</option>
			</select>
			<label>Comment (optional): 	</label>
			<input type="text" name="comment">
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>