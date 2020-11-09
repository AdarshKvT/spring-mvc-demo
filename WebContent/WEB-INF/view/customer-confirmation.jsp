<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>

<body>

	<h1>Results</h1>
	<hr>
	<br>
	<b>The customer with name ${customer.firstName}
		${customer.lastName} has been confirmed </b>
	<br>
	<br>
	<b>Free passes: ${customer.freePasses}</b>
	<br>
	<br>
	<b>Postal code: ${customer.postalCode}</b>
	<br>
	<br>
	<b>Course code: ${customer.courseCode}</b>
</body>
</html>