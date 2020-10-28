<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Enrollment Form</title>
</head>
<body
	background="${pageContext.request.contextPath}/resources/images/hogwartsLight.jpg">

	<hr>
	<h2>Welcome to Hogwarts</h2>
<!--	<hr>
	 	<hr width="100%" color="Green">

	<br> -->
	<form action="studentEnrollment" method="get">
		<input type="text" name="studentName" placeholder="what's your name">
		<br> <br> <input type="text" name="enrollNo"
			placeholder="enrollment number"> <br> <br>
		<input type="text" name="branch" placeholder="enter your branch">
		<br> <br> <br> <input type="submit">
	</form>

</body>
</html>