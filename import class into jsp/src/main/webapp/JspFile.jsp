<%@   page import="java.util.Date,org.studyeasy.Demo" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hello jsp</title>
</head>
<body>

<%-- out.print(new java.util.Date()); --%>
<%= new Date() %>

<%out.print(new Demo().UserDefined()); %>
</body>
</html>