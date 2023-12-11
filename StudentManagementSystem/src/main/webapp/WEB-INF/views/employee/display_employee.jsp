<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5 align="center">${requestScope.employeelist} </h5>
<h1 align="center">List Items:</h1>
    <ul>
        <c:forEach var="item" items="${employee}">
            <li>${item}</li>
        </c:forEach>
    </ul>
</body>
</html>