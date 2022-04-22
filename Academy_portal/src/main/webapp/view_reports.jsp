<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Report</title>
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
	<h1>Class Report</h1>
	<h2>Class: &nbsp;${Class}&emsp;&nbsp;Section:&ensp;${Section}</h2>
	<h1>Students List</h1>
	<table align="center" width=600 height=100>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Class</th>
			<th>Section</th>
			<th>Email</th>
			<th>Age</th>
		</tr>
		<c:forEach var="st" items="${st_List}">
			<tr>
				<td>${st.id}</td>
				<td>${st.firstName}</td>
				<td>${st.lastName}</td>
				<td>${st.classs}</td>
				<td>${st.section}</td>
				<td>${st.email}</td>
				<td>${st.age}</td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<h1>Subjects List</h1>
	<table align="center" width=600 height=100>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Shortcut</th>
		</tr>
		<c:forEach var="subject" items="${sub_List}">
			<tr>
				<td>${subject.id}</td>
				<td>${subject.name}</td>
				<td>${subject.shortcut}</td>
			</tr>
		</c:forEach>
	</table><br><br>
	<h1>Teachers List</h1>
	<table align="center" width=600 height=100>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
		<c:forEach var="teacher" items="${tea_List}">
			<tr>
				<td>${teacher.id}</td>
				<td>${teacher.firstname}</td>
				<td>${teacher.lastname}</td>
				<td>${teacher.age}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>