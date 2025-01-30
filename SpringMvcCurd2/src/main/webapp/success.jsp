<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
</head>
<body>

<form action="success">
<table border="1">
<tr>
<th>RollNo</th>
<th>Name</th>
<th>UserName</th>
<th>Password</th>
<th>Mobile</th>
<th>Email</th>
<th>Modify</th>

</tr>

<c:forEach items="${data}" var="s">
<tr>
<td>${s.rollno}</td>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td>${s.mobile}</td>
<td>${s.email}</td>
<td><a href="delete?rollno=${s.rollno}">DELETE</a> <a href="update?rollno=${s.rollno}">Update</a> <a href="register">Add</a></td>

</tr>



</c:forEach>

</table>
</form>
</body>
</html>