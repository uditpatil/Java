<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<title>Save Travels</title>
</head>
<body">

<h1>Expense Details</h1>
<p><a href="/expenses/">Go back</a></p>
<table>
    <tbody>
		<tr>
			<td>Expense Name:</td>
			<td><c:out value="${expense.name}"></c:out></td>
		</tr>
		<tr>
			<td>Expense Description:</td>
			<td><c:out value="${expense.description}"></c:out></td>
		</tr>
		<tr>
			<td>Vendor:</td>
			<td><c:out value="${expense.vendor}"></c:out></td>
		</tr>
		<tr>
			<td>Amount Spent:</td>
			<td>$<fmt:formatNumber type="number" minFractionDigits="2" value="${expense.amount}"/></td>
		</tr>	
    </tbody>
</table>
	

</body>
</html>