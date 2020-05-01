<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form  action="login" method="post">
		<label for="username">UserName</label>
		<input type="text" id="username" placeholder="Usernmae" name="username">
		<label for="password">Password</label>
		<input type="password" id="password" placeholder="Password" name="password">
		<input type="submit" value="Login">
	</form>
</body>
</html>