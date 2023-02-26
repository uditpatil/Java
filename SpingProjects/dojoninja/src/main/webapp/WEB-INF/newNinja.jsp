<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<title>Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<h1>New Ninja</h1>
	<form:form method="post" action="/ninjas/newNinja" modelAttribute="ninja">
		<div>
			<form:label path="dojo">Name:</form:label>
			<form:errors path="dojo"/>
			<form:select path="dojo">
				<c:forEach  var="dojo" items="${everyDojos}">
					<option value="${dojo.id}">
						<c:out value="${dojo.name}"/>
					</option>
				</c:forEach>
			</form:select>
		</div>
		
		<div>
			<form:label path="firstName"> First Name:</form:label>
			<form:errors path="firstName"/>
			<form:input path="firstName" type="text"/>
		</div>
		
		<div>
			<form:label path="lastName">Last Name:</form:label>
			<form:errors path="lastName"/>
			<form:input path="lastName" type="text"/>
		</div>
		
		<div>
			<form:label path="age">Age:</form:label>
			<form:errors path="age"/>
			<form:input path="age" type="number"/>
		</div>
		
		<input type="submit" value="Create">
	</form:form>
</body>