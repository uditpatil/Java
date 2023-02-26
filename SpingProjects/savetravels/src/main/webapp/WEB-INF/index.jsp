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
<body>
<h1>Save Travels</h1>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th class="text-center">Expense</th>
            <th class="text-center">Vendor</th>
            <th class="text-center">Amount</th>
            <th class="text-center">Actions</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="expense" items="${saveTravels}">
			<tr>
				<td class="text-center"><a href="/expenses/<c:out value="${expense.id}"></c:out>"><c:out value="${expense.name}"></c:out></a></td>
				<td class="text-center"><c:out value="${expense.vendor}"></c:out></td>
				<td class="text-center">$<fmt:formatNumber type="number" minFractionDigits="2" value="${expense.amount}"/></td>
				<td class="text-center"><a href="/expenses/edit/${expense.id}">edit</a> <a href="/expenses/delete/${expense.id}">delete</a></td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
<br>
<div>
<h1>Add an expense:</h1>
<form:form action="/expenses" method="post" modelAttribute="saveTravels">

	<div>
		<form:label path="expenseName">Expense Name: </form:label><br />
		<form:errors path="expenseName" class="text-danger"/>
		<form:input path="expenseName"/>
	</div>

	<div>
		<form:label path="vendorName">Vendor: </form:label><br />
		<form:errors path="vendorName" class="text-danger"/>
		<form:input path="vendorName"/>
	</div>
	
	<div>
		<form:label path="amount">Amount: </form:label><br />
		<form:errors path="amount" class="text-danger"/>
		<form:input type="number" step="0.01" min="0" path="amount"/>
	</div>
	
	<div>
		<form:label path="desc">Description: </form:label><br />
		<form:errors path="desc" class="text-danger"/>
		<form:textarea rows="3" path="desc"/>
	</div>
	
	<div>
		<input type="submit" value="Submit"/>
	</div>
	
	

</form:form>
</div>
</body>
</html>