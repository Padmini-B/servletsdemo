<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teachers List</title>
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
</style>
</head>
<body align="center">
	
	<h1>Teachers List</h1>
	<table align="center" width=600 height=100>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="teacher" items="${teachersList}">
			<tr>
				<td>${teacher.id}</td>
				<td>${teacher.firstname}</td>
				<td>${teacher.lastname}</td>
				<td>${teacher.age}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="add_teacher.jsp"><button>Add Teacher</button></a>	
</body>
</html>