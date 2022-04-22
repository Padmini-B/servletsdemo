<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
<style>
	td{
		font-size:20px;
	}
	button{
		border:none;
		font-size: 16px;
		background-color: #000066;
		padding: 5px 15px;
		border-radius: 25px;
		color:white;
	}
	button:hover{
		box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
	}
</style>
</head>
<body style="background-color:skyblue;" align="center">
	<form action="loginActionServlet" method="post">
	<br><br><br><br><br>
		<h1>Admin Login</h1>
		<br>
		<table align="center">
			<tr>
				<td align="left" style="padding:10px 20px 10px 5px "><b>Username</b></td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td align="left" style="padding:10px 20px 10px 5px "><b>Password</b></td>
				<td><input type="password" name="password"/></td>
			</tr>
		</table><br><br>
		<button type="submit">Login</button>&ensp;
		<button type="reset">Reset</button>
	</form>
</body>
</html>