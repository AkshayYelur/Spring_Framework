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
<th>Email</th>
</tr>

 
 <c:forEach items="${data}" var="a">
 <tr>
 <td>${a.name}</td>
 <td>${a.username}</td>
 <td>${a.password}</td>
 <td>${a.mobile}</td>
 <td>${a.email}</td>
 </tr>
 </c:forEach>









</table>
</body>
</html>