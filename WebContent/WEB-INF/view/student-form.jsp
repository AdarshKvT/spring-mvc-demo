<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName" />

		<br>
		<br>
		
		Last Name: <form:input path="lastName" />

		<br>
		<br>
		
		Country:

		<form:select path="country">
			<form:options items="${student.countryOptions}" />

			<!--  			<form:option value="Usa" label="Usa" />
			<form:option value="Russia" label="Rusia" />
			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
-->
		</form:select>

		<br>
		<br>
		
		Favorite Language:
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

		<br>
		<br>
		
		Operating Systems:
		GNU Linux <form:checkbox path="operatingSystems" value="GNU Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />

		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>