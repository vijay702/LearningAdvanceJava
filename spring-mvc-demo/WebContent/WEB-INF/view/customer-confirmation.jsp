<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>

<title>Customer confirmation</title>
</head>
<body>



The Customer is Confirmed: ${customer.firstName} ${customer.lastName}
<br><br>

Free Passes : ${customer.freePasses}

<br><br>

Postalcode : ${customer.postalCode}

<br><br>

courseCode : ${customer.courseCode}

</body>


</html>