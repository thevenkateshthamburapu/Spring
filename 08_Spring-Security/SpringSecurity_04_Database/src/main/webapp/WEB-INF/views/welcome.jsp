<%@page session="true" isELIgnored="false"%>
<html>
<head>
<title>Welcome</title>
</head>
<body>
	<h1>Message : ${message}</h1>
	<b>Logged in User : ${name} </b>
	<p>
		<a href="logout">Logout</a>
	</p>
</body>
</html>
