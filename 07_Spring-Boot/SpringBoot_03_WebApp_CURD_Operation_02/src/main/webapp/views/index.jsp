<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Store Student Details</title>
</head>
<body>
	<h3>Student Details Info</h3>

	<font color="red">${eMsg}</font>
	<font color="green">${sMsg}</font>

	<form:form action="store" method="POST" modelAttribute="student">
		<table>
			<%-- <tr>
				<td>Student ID :</td>
				<td><form:input path="stuid" /></td>
			</tr> --%>
			<tr>
				<td>Student Name :</td>
				<td><form:input path="stuname" /></td>
			</tr>
			<tr>
				<td>Student Marks:</td>
				<td><form:input path="marks" /></td>
			</tr>
			<tr>
				<td>Student Result:</td>
				<td><form:input path="result" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="Submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>


	<a href="retriveStudents">View All Books</a>
</body>
</html>