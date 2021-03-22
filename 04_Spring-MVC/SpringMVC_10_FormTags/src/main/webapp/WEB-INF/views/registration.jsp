<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>
.error {
	font: bold;
	color: red;
}
</style>
</head>
<body>
	<form:form action="register" method="post" modelAttribute="user">
		<table>
			<tr>
				<th>Enter Your Name:</th>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<th>Enter Your Email ID:</th>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<th>Select Your Gender:</th>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
				<td><form:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<th>Enter Your Password:</th>
				<!-- showPassword="true" its display the password by default it is false -->
				<td><form:password path="password" showPassword="true" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<th>Enter Your Confirm Password:</th>
				<td><form:password path="confirmPassword" /></td>
				<td><form:errors path="confirmPassword" cssClass="error" /></td>
			</tr>
			<tr>
				<th>Choose Your Timings:</th>
				<td><form:checkboxes path="batches" items="${batches}" /></td>
				<td><form:errors path="batches" cssClass="error" /></td>
			</tr>
			<tr>
				<th>Select Your Course(s):</th>
				<td><form:select path="courses" size="6">
						<form:options items="${courses}" />
					</form:select></td>
				<td><form:errors path="courses" cssClass="error" /></td>
			</tr>
			<tr>
				<form:hidden path="hiddenMsg" />
			</tr>
			<tr>
				<td><button type="submit">Submit</button></td>
			</tr>
		</table>

	</form:form>
</body>
</html>