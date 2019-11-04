<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
		Alien ID: <input type = "text" name = aid>
		Alien Name: <input type ="text" name = aName>
		Alien Language: <input type ="text" name=aTech><br>
		<input type = "submit">
	</form>
	
	<br><br>
	<h4>Find an Alien by ID</h4>
	<form action="getAlien">
		Alien ID: <input type ="text" name = aid>
		<input type="submit">
	</form>	
</body>
</html>