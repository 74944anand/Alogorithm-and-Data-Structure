<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="company" method="post">
		<table align="center">
			<tr>
				<td><select name="myCompany">
						<option>TATA</option>
						<option>INFOSYS</option>
						<option>WIPRO</option>
				</select></td>
			</tr>
			<tr>
				<td><input  type="submit" value="Search Employee by Company Name" /></td>
			</tr>
		</table>
	</form>
</body>
</html>