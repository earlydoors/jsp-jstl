<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<jsp:useBean id="zone" class="com.jspservletcookbook.ZoneWrapper" />
<jsp:useBean id="date" class="java.util.Date" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using the Core JSTL tags</title>
</head>
<body>
<h2>Here are the available Time Zone IDs on your system</h2>

<c:if test="${date.time != 0}">

	<c:out value=
		"Phew, time has not stopped yet..........<br /><br />" escapeXml="false" />
</c:if>

<%-- The variable 'zones' contains a String array of TimeZone IDs; it is stored as a 
'session' object attribute. The '${zone.availableIDs}' expression is the equivalent of
calling the ZoneWrapper.getAvaliableIDs() method --%>

<c:set var="zones" value="${zone.availableIDs}" scope="session" />

<c:forEach var="id" items="${zones}">
	<c:out value="${id}<br />"  escapeXml="false" />
</c:forEach>

</body>
</html>