<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*,com.admin.model.Student" %>    
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
<style>
	tr:nth-child(odd) {
  		background-color: skyblue;
	}
	th{
		background-color:#000066;
		color:white;
	}
	th,td{
		padding:5px 5px 5px 5px;
	}
	button{
		border:none;
		font-size: 16px;
		background-color: #000066;
		padding: 10px 20px;
		border-radius: 25px;
		color:white;
	}
	button:hover{
		box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
	}
</style>
</head>
<body align="center">
	<h1>Students List</h1>
	<table align="center"  width=600 height=100>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Class</th>
			<th>Section</th>
			<th>Email</th>
			<th>Age</th>
		</tr>
		<c:forEach var="student" items="${studentsList}">
			<tr>
				<td>${student.id}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.classs}</td>
				<td>${student.section}</td>
				<td>${student.email}</td>
				<td>${student.age}</td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="add_student.jsp"><button>Add Student</button></a>
</body>
</html>