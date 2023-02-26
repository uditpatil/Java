<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<title>Dojo</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form method="post" action="/dojos/newDojo" modelAttribute="dojo">
		<div>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name" type="text"/>
		</div>
		<input type="submit" value="Create"/>
	</form:form>
</body>