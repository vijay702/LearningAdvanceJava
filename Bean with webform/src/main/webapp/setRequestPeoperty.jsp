<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.studyeasy.User" scope="request"></jsp:useBean>
<form action="getRequestProperty.jsp">

first name : <input type="text" name="firstName" value='jsp:getProperty property="firstName" name="user" /> '>
last name : <input type="text" name="lastName" value='jsp:getProperty property="lastName" name="user" /> '>
<input type="submit" value="submit">




</form>
</body>
</html>