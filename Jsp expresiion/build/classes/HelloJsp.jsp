<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Jsp</title>
</head>
<body>
<h1>hello jsp</h1>
<%! public int x = 22; %>
<%= x %>
<%= new java.util.Date() %>
<br/>
<%= 25*4 %>
<br/>
<b>
<%=25>4 %>
</b>
<p>
<%
int x =25;
out.println(x);
if(x >25){
	out.print("x is greater than 25");
	
}else{
	out.print("x not greater than 25");
}

%>


</p>
<%--! public int y=33; 
String message(){
	return "i love jsp";
}

--%>
<%--= message() --%>
<%




%>

</body>
</html>