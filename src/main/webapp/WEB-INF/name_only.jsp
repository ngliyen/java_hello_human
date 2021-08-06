<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<title>Insert title here</title>
</head>
<body>
	<nav class='d-flex justify-content-end me-5'>
		<a href='/' >Go Back</a>
	</nav>
	<div class='ms-5'>
		<!-- getting the value of the name parameter -->
		<% String name = request.getParameter("name"); %>
		
		<h1>Hello <span><%= name %></span>!</h1>
		<p>Welcome to SpringBoot!</p>
	</div>
</body>
</html>