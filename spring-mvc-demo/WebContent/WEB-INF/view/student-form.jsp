<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>
student registration  form
</title>
</head> 


<body>


<form:form action="processForm"  modelAttribute="student">

first name : <form:input path="firstName" />

<br><br>
last name : <form:input path="lastName" />

<br><br>


<form:select path ="country" >

<form:options items="${student.countryOptions}" />

</form:select>
<br><br>

<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageoptions}" />



<br><br>

<input type="submit" value="submit" />

</form:form>


</body>






</html>