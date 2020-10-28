<! DOCTYPE html>
<html>
<head>
<title>Welcome to Fortune Service</title>
</head>

<body>
	<hr>
	<form action="processForm" method="get">
		<input type="text" name="userName" placeholder="What's your name" />
		<input type="submit" />
	</form>

	<img alt=""
		src="${pageContext.request.contextPath}/resources/images/helloSpring.jpg">
	<form action="processFormVersionTwo" method="get">
		<input type="text" name="studentName" placeholder="what's your name">
		<input type="submit">
	</form>
</body>
</html>