<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Report</title>
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
	<form action="reportServlet" method="post">
		<h1>Class Report Section Wise</h1><br><br>
		<table align="center">
			<tr>
		      <td align="left" style="padding:10px 20px 10px 5px "><b>Class:</b></td>
		      <td align="left">
		      	<select name="cls">
					<option selected>Select</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>		
				</select></td>
		    </tr>
		    <tr>
		    	<td align="left" style="padding:10px 30px 10px 5px "><b>Section:</b></td>
		    	<td>
		    		<select name="sec">
						<option selected>Select</option>
						<option value="A">A</option>
						<option value="B">B</option>
						<option value="C">C</option>
						<option value="D">D</option>
						<option value="E">E</option>
						<option value="F">F</option>
					</select>
		    	</td>
		    </tr>
	    </table><br><br>
		<button type="submit">Submit</button>&ensp;
		<button type="reset">Reset</button>
	</form>
</body>
</html>