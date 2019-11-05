<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
	<form action="updateAlien">
		Alien ID: <input type = "text" name = aid value="${alien.aid}">
		Alien Name: <input type ="text" name = aName value="${alien.aName}">
		Alien Language: <input type ="text" name=aTech value="${alien.aTech}"><br>
		<input type = "submit">
		<br><br><br>
		${updateStatus}
		<br><br><br><br><br>
	<a href="back">back</a>
	</form>
</body>
</html>