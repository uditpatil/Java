<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>Hello</h1>
	<% for(int i=0; i< 5; i++) {%>
		<h1><%= i %></h1>
	<% } %>
	
	<h3>the time is : <%= new Date() %></h3>
	<h4>Fruit of the day: </h4>
	<h2><c:out value="${fruit}"/></h2>
</body>
</html>