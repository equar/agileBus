<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
	<h3>Online Bus Tickets Booking Zero with Booking Fees</h3>
		<font color="red">${message}</font>
		<form:form id="registerForm" method="post" action="registeruser" modelAttribute="loginBean">

			<form:label path="email">Email address</form:label>
			<form:input id="email" name="email" path="" /><br>
			<form:label path="password">your password</form:label>
			<form:password id="password" name="password" path="" /><br>
			<form:label path="">By signing up, you agree to our <a href#>terms and conditions</a></form:label><br>
			<input type="submit" value="PROCEED" /><br>
			<form:label path="">Already have an account?  <a href#>SIGN IN</a></form:label>
		</form:form>
	</body>
</html>