<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Denied</title>
</head>
<body>

	<h1 id="banner">Unauthorized Access !!</h1>

	<hr />

	<c:if test="${not empty error}">
		<div style="color: red">
			Your fake login attempt was bursted, Try again !!<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>

	<p class="message">Access denied!</p>
	<a href="login">Go back to login page</a>
</body>
</html>