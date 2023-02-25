<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<title>Burger Tracker 1</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1>Burger Tracker</h1>
	<table class="table table-bordered table-striped">
		<thead>
			<tr>
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating (out of 5)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="burger" items="${burgers}">
				<tr>
					<td><c:out value="${burger.burgerName}"/></td>
					<td><c:out value="${burger.restaurantName}"/></td>
					<td><c:out value="${burger.rating}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<h2>Add new burger</h2>
	<form:form action="/burgers" mode="post" modelAttribute="burger">
		<div>
			<form:label path="burgerName">Burger Name:</form:label><br>
			<form:errors path="burgerName" class="text-danger"/>
			<form:input path="burgerName"/>
		</div>
		<div>
			<form:label path="restaurantName">Restaurant Name:</form:label><br>
			<form:errors path="restaurantName" class="text-danger"/>
			<form:input path="restaurantName"/>
		</div>
		<div>
			<form:label path="rating">Rating:</form:label><br>
			<form:errors path="rating" class="text-danger"/>
			<form:input path="rating"/>
		</div>
		<div>
			<form:label path="notes">Notes:</form:label><br>
			<form:errors path="notes" class="text-danger"/>
			<form:input path="notes"/>
		</div>
		<div>
			<input type="submit" value="Submit"/>
		</div>
	</form:form>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>