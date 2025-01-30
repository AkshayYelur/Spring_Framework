<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<table border="1">
<tr>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>Mobile</th>
</tr>

<c:forEach items="${data}" var="s">


<tr>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td>${s.mobile}</td>

</tr>


</c:forEach>


</table>
</body>
</html>