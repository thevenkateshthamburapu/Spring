<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Message</title>
</head>
<body>
	

	<table>
		<tr>
			<td>Name : ${user.name}</td>
		</tr>
		<tr>
			<td>Email : ${user.email}</td>
		</tr>
		<tr>
			<td>Gender : ${user.gender}</td>
		</tr>
		<tr>
			<td>Languages : ${user.languages}</td>
		</tr>
	</table>

</body>
</html>