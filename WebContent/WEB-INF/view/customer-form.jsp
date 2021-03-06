<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- adding spring form tab lib -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>

<!-- defining css style in line -->
<style>
.error {
	color: red
}
</style>
</head>
<body>

	<i>Fill out the form. All the fields with Asterisk (*) are
		required.</i>

	<br>
	<br>
	<form:form action="processForm" modelAttribute="customer">
	
		First name: <form:input path="firstName" />

		<br>
		<br>

		<!-- display error message if set -->
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

		<br>
		<br>

		Free passes (0-10)*: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />

		<br>
		<br>
		
		Postal code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />

		<br>
		<br>
		Course code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" />

		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>