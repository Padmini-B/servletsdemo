<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subjects List</title>
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
	
	<h1>Subjects List</h1>
	<table align="center" width=600 height=100>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Shortcut</th>
		</tr>
		<c:forEach var="subject" items="${subjectsList}">
			<tr>
				<td>${subject.id}</td>
				<td>${subject.name}</td>
				<td>${subject.shortcut}</td>
			</tr>
		</c:forEach>
	</table><br><br>
	<a href="assign_class.jsp"><button>Assign Class</button></a>
</body>
</html>