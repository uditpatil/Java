<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<title>Dojo Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
<table class="table table-bordered table-striped"">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
	</tr>
	
	<c:forEach var="ninja" items="${dojo.ninjas}">
		<tr>
			<td><c:out value="${ninja.firstName}"/></td>
			<td><c:out value="${ninja.lastName}"/></td>
			<td><c:out value="${ninja.age}"/></td>
		</tr>	
	</c:forEach>
</table>
</body>