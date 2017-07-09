<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- use the 'taglib' directive to make the JSTL 1.0 core tags available; use the uri
"http://java.sun.com/jsp/jstl/core" for JSTL 1.1 --%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%-- XML processing --%>
<%@ taglib uri="http://java.sun.com/jstl/xml" prefix="x" %>

<%-- Formatting data (such as dates and currencies) for international users --%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>

<%-- SQL and database access --%>
<%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql" %>

<%-- use the 'jsp:useBean' standard action to create the Date object; the object is set
as an attribute in page scope --%>
<jsp:useBean id="date" class="java.util.Date" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First JSP</title>
</head>
<body>
<h2>Here is today's date</h2>

<c:out value="${date}" />

</body>
</html>