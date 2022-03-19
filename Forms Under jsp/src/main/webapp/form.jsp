<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>for Demo</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/Controller" method="get">
      Full Name: <input type="text" name="name"><br/>

          Gender: <input type="radio" name="gender" value="male"  checked="checked"> Male
                  <input type="radio" name="gender" value="female"> Female <br/>
          
          
         Languages Known: <input type="checkbox" name="language" value="english"> English
                    <input type="checkbox" name="language" value="hindi"> Hindi
                    <input type="checkbox" name="language" value="french"> French <br/>
      
            Country: <select name="country">
                     <option value="india">India</option>
                     <option value="China">China</option>
                     <option value="Japan">Japan</option>
                     <option value="Russia">Russia</option>
                     <option value="Cuba">Cuba</option>
                     </select> <br/>
                     <input type="submit" value="submit" >
 


</form>

</body>
</html>
