<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<title>Books</title>
</head>
<body>
	<div class="container">
		<h1>New Book</h1>
		<form:form action="/books" method="post" modelAttribute="book">
			
			<div>
				<form:label path="title">Title</form:label>
				<form:errors path="title"/>
				<form:input path="title"/>
			</div>
			<div>
				<form:label path="description">Description</form:label>
				<form:errors path="description"/>
				<form:input path="description"/>
			</div>
			<div>
				<form:label path="language">Language</form:label>
				<form:errors path="language"/>
				<form:input path="language"/>
			</div>
			<div>
				<form:label path="numberOfPages">Pages</form:label>
				<form:errors path="numberOfPages"/>
				<form:input type="number" path="numberOfPages"/>
			</div>
			<input type="submit" name="Submit">
			
		</form:form>
		
	</div>
	<!-- For any Bootstrap that uses JS or jQuery-->
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>