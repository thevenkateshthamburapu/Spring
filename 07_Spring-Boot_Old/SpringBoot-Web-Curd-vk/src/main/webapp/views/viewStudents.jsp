<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Students Details</title>
<script>
	function confirmDelete() {

		var status = confirm("Are you sure, you want to delete?");
		if (status) {
			return true;
		} else {
			return false;
		}
	}
</script>

</head>
<body>
	
	<a href="index">+Add new Student Details</a>

	<table>
		<thead>
			<tr>
				<th>Student No</th>
				<th>Student Name</th>
				<th>Student Marks</th>
				<th>Student result</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${students}" var="student" varStatus="index">
				<tr>
					<td><c:out value="${index.count}" /></td>
					<td><c:out value="${student.stuname }" /></td>
					<td><c:out value="${student.marks }" /></td>
					<td><c:out value="${student.result }" /></td>
					<td><a href="edit?stuid=${student.stuid}">Edit</a> | <a href="delete?stuid=${student.stuid}"
						onclick="return confirmDelete()">Delete </a>
				</tr>
			</c:forEach>

		</tbody>



	</table>

</body>
</html>