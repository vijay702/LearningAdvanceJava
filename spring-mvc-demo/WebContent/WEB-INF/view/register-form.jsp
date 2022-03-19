<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>
student registration  form
</title>
<style>
.error{color:red}
</style>

</head> 


<body>


<form:form action="details"  modelAttribute="student">

        Name : <form:input path="name" />
        <form:errors path="name" cssClass="error" />
<br><br>
age : <form:input path="age" />
       <form:errors path="age" cssClass="error" />
<br><br>
number : <form:input path="number" />
         <form:errors path="number" cssClass="error" />
<br><br>


<form:radiobuttons path="department" items="${student.departmentoption}" />



<br><br>

<input type="submit" value="submit" />

</form:form>


</body>






</html>