<%@include file="header.jsp"%>
<%@include file="slidebus.jsp"%>
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
<%@include file="topbus.jsp"%>
<%@include file="footer.jsp"%>