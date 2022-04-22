<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Insert title here</title>
<style>
	tr:hover {
  		background-color: skyblue;
  		color:#000066;
	}
	td{
		text-align:center;
		padding: 15px 15px ;
		font-size:30px;
	}
	a{
		color:white;
		text-decoration: none;
	}
	a:hover{
		color:#000066;
	}
</style>
</head>
<body>
	<!--  <h1>
		Learner's Academy Administrative Portal<br><br>-->
	<table width=260 height=200  >
		<tr>
			<td><a  href="classServlet" target="center" >Classes</a> </td>
		</tr>
		<tr>
			<td><a  href="subjectServlet" target="center">Subjects</a></td>
		</tr>
		<tr>
			<td><a  href="teacherServlet" target="center">Teachers</a> </td>
		</tr>
		<tr>
			<td><a  href="studentServlet" target="center">Students</a> </td>
		</tr>
		<tr>
			<td><a  href="class_report.jsp" target="center">Class Report</a></td>
		</tr>
	</table>	
</body>
</html>