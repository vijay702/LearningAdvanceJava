<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add</title>
</head>
<body>

<form action="<%= request.getContextPath()%>/addservlet" method="get"  >  

first number : <input type="text" name="num1"> <br/>
second number :<input type="text" name="num2"> <br/>
<input type="submit" name="submit" >
<%  int i = Integer.parseInt(request.getParameter("num1"));
int j = Integer.parseInt(request.getParameter("num2"));
int k = i+j;

out.print(k);

%>
</form>

</body>
</html>