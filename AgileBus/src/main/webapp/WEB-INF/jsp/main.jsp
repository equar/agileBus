<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

	<%@include file="header.jsp"%>
	<%@include file="slidebus.jsp"%>
	<div>different screens goes here</div>
	<div>Top bus routes, cities and bus operators goes here</div>
	
	<%@include file="footer.jsp"%>
	

</body>
</html>