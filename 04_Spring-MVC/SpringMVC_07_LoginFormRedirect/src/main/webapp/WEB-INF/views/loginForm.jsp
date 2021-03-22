<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>

	<h1>Login here</h1>
	<b style="color: red">${errorMsg }</b>
	<form:form action="login" method="POST" modelAttribute="user">
		Username : <form:input path="uname" />
		<br />
		Password : <form:password path="pwd" />
		<br />
		<input type="submit" value="Register" />

	</form:form>

</body>
</html>