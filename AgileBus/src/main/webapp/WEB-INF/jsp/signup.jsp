<%@include file="header.jsp"%>
<%@include file="slidebus.jsp"%>
<div>
	<h3>Sign Up</h3>
	<form:form id="registerForm" method="post" action="signup"
		modelAttribute="user">

		<form:label path="emailId">Email:</form:label>
		<form:input id="emailId" name="emailId" path="" />
		<form:errors path="emailId" element="div" />
		<br>
		<form:label path="phoneNumber">PhoneNumber:</form:label>
		<form:input id="phoneNumber" name="phoneNumber" path="" />
		<form:errors path="phoneNumber" element="div" />
		<br>
		<form:label path="password">Password:</form:label>
		<form:password id="password" name="password" path="" />
		<form:errors path="password" element="div" />
		<br>
		<form:label path="confirmPassword">Confirm Password:</form:label>
		<form:password id="confirmPassword" name="confirmPassword" path="" />
		<form:errors path="confirmPassword" element="div" />
		<br>

		<input type="submit" value="Submit" />
		<br>
		<form:label path="">Already have an account?  <a
				href="login">Sign In</a>
		</form:label>
	</form:form>
</div>
<%@include file="topbus.jsp"%>
<%@include file="footer.jsp"%>