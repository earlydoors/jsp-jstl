<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<%-- Include this taglib for i18n related actions --%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formatting numbers and dates</title>
</head>
<body>
<h2>Dates and numbers in Swiss and US style formats</h2>

<%-- create an object representing the current date --%>
<jsp:useBean id="now" class="java.util.Date" />

<%-- set the locale to German language, Swiss country code --%>
<fmt:setLocale value="de_CH"/>

<strong>Swiss-style date:</strong>

<%--output the date --%>
<fmt:formatDate type="both" value="${now}" dateStyle="full" timeStyle="short" />

<br />

<strong>Swiss-style number:</strong>

<%-- output the equivalent of java.util.Date.getTime() to show how numbers are formatted --%>
<fmt:formatNumber value="${now.time}" />

<br /><br />

<%-- reset the locale to English language, US country code --%>
<fmt:setLocale value="en_US" />

<strong>US-style date:</strong>

<%-- output the date --%>
<fmt:formatDate type="both" value="${now}" dateStyle="full" timeStyle="short" />

<br />

<strong>US-style number:</strong>

<fmt:formatNumber value="${now.time}" />

<br /><br />
</body>
</html>