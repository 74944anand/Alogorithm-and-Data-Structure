<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="show" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="fn" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="ln" /></td>
			</tr>
			<tr>
				<td>Enter city </td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>Select Company</td>
				<td><select name="myCompany">
						<%-- <c:forEach var="abbr" items="${requestScope.teams_abbr}">
							<option value="${abbr}">${abbr}</option>
						</c:forEach> --%>
					<option value="TATA">TATA</option>
					<option value="INFOSYS">INFOSYS</option>
					<option value="WIPRO">WIPRO</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add A Employee" /></td>
			</tr>
		</table>
	</form>
	<%-- <h5>Teams : ${applicationScope.ipl.fetchAllTeams()}</h5> --%>
</body>


</html>