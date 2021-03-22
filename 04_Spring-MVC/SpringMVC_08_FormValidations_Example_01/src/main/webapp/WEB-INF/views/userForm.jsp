<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>User Form</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.error {
	font: bold;
	color: red;
}
</style>
</head>
<body>
	<h2>User Input Form</h2>
	<form:form action="saveUser" method="post" modelAttribute="user">
		<table>
			<tr>
				<th>Name</th>
				<td><form:input path="name" /> <form:errors path="name"
						cssClass="error" /></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error" /></td>
			</tr>
			<tr>
				<th>Gender</th>
				<td><form:radiobutton path="gender" value="male" label="Male" />
					<form:radiobutton path="gender" value="female" label="Female" /> <form:errors
						path="gender" cssClass="error" /></td>
			</tr>
			<tr>
			<th valign="top">Languages</th>
				<td>
				<form:select path="languages" multiple="true">
				<form:option value="US English">US English</form:option>
				<form:option value="UK English">UK English</form:option>
				</form:select>
				 <form:errors path="languages"
						cssClass="error" /></td>
			</tr>
			<tr>
			<td><button type="submit">Submit</button></td>
			</tr>
		</table>

	</form:form>



</body>
</html>