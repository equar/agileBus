<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Online Bus Tickets Booking with Zero Booking Fees</h3>
	<form:form id="searchForm" method="post" action="searchbus"
		modelAttribute="busBean">

		<form:label path="from">From:</form:label>
		<form:input id="from" name="from" path="" />
		<br>
		<form:label path="to">To:</form:label>
		<form:input id="to" name="to" path="" />
		<br>
		<form:label path="dateJourney">Date of Journey:</form:label>
		<form:input id="dateJourney" name="dateJourney" path="" />
		<br>
		<form:label path="dateReturn">Date of Return(Optional):</form:label>
		<form:input id="dateReturn" name="dateReturn" path="" />
		<br>
		
		<input type="submit" value="Search Buses" />
	</form:form>
</body>
</html>