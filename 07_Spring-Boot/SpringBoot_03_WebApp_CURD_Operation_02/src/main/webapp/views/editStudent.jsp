<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details Store</title>
</head>
<body>
	<h3>Update Student Info</h3>

	<font color="red">${eMsg}</font>
	<font color="green">${sMsg}</font>

	<form:form action="update" method="POST" modelAttribute="student">
		<table>
			<tr>
				<td>Student ID :</td>
				<td><c:out value="${student.stuid}" />
				<input type="hidden" name="stuid"  value="${student.stuid}" /></td>
			</tr>

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
				<td><input type="Submit" value="Update" /></td>
			</tr>
		</table>

	</form:form>


	<a href="retriveStudents">View All Students</a>
</body>
</html>