<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

	<br>
	<hr>
	<b>The student is confirmed: ${student.firstName}
		${student.lastName}</b>
	<br>
	<br>
	<b>Enrollment Number: ${student.enrollmentNo}</b>

	<br>
	<br>
	<b>Country: ${student.country}</b>

	<br>
	<br>
	<b>Favorite Language: ${student.favoriteLanguage}</b>

	<br>
	<br>
	<b>Operating Systems:
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
	</b>


</body>
</html>