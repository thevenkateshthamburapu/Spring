<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head><title>Trades</title></head>
<body>
	<h2>Trades</h2>
	<h3>
		Message : ${msg}
		<h3>
			<br />
			<h4>Current visitor history</h4>
			<p>ip : ${visitor.ip}:</p>
			<c:forEach items="${visitor.pagesVisited}" var="page">
				<p>${page}</p>
			</c:forEach>
</body>
</html>