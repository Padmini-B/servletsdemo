<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher</title>
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
<body align="center">
	<form action="teacherServlet" method="post">
		<h1>Teacher Entry</h1>
		<table align="center">
			<tr>
				<td align="left" style="padding:10px 20px 10px 5px "><b>ID:</b> </td>
				<td align="left"><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td align="left" style="padding:10px 20px 10px 5px "><b>FirstName:</b></td>
				<td align="left"><input type="text" name="fname"/></td>
			</tr>
			<tr>
				<td align="left" style="padding:10px 20px 10px 5px "><b>LastName:</b></td>
				<td align="left"><input type="text" name="lname"/></td>
			</tr>
			<tr>
			<tr>
				<td align="left" style="padding:10px 20px 10px 5px "><b>Age:</b></td>
				<td align="left"><input type="text" name="age"/></td>
		</table><br><br>
		<button type="submit">Add</button>&ensp;
		<button type="reset">Reset</button>
</body>
</html>