<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get Request Property</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.bean.Demo" scope="request"></jsp:useBean>

<jsp:getProperty property="firstWord" name="user" />
<jsp:getProperty property="lastWord" name="user" />

</body>
</html>