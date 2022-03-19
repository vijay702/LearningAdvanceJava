<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp File </title>
</head>
<body>
<%@ include file="file1.txt" %>
<p>
<jsp:include page="file2.txt"></jsp:include></p>



</body>
</html>