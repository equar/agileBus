<%@include file="header.jsp"%>
<%@include file="slidebus.jsp"%>
<h3>Sign In</h3>
<font color="red">${message}</font>
<form:form id="loginForm" method="post" action="login"
	modelAttribute="loginBean">

	<form:label path="username">Enter your email or mobile no</form:label>
	<form:input id="username" name="username" path="" />
	<br>
	<form:label path="password">Enter your password</form:label>
	<form:password id="password" name="password" path="" />
	<br>
	<input type="submit" value="Submit" />
</form:form>
<%@include file="topbus.jsp"%>
<%@include file="footer.jsp"%>