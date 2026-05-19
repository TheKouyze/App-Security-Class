<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h1>Student Register Page</h1>

		<!-- form action ="StudentServlet" method="post"> -->
		<form action="<%=request.getContextPath()%>/StudentServlet"
			method="post">
			<table style="width: 80%">
				
			<tr>
				<td>age</td>
					<td><input type="number" name="age" required /></td>
				</tr>
						
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" required /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="grade" /></td>
				</tr>
			
			<!-- Fix this .. to match the entity given.. in this case if you have
			5 attributes  you must have 5 fields of input type to match the input. -->	
				
				
			</table>
			<input type="submit" value="Submit" />
		</form>
	</div>

</body>
</html>