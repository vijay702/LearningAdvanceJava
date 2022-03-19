<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.Statement" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="<%= request.getContextPath() %>/Sitecontroller" method ="post">
username : <input type="text" name="username" > <br/>

password : <input type="password" name="password" > <br/>
<input type="submit" value="submit">



</form>

</body>
</html>