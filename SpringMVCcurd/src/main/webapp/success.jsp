<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr> 
<th>Id</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>Action</th>

</tr>

<c:forEach items="${data}" var="s">
<tr>
<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>

<td>   <a href="delete?id=${s.id}">DELETE</a></td>
</tr>
</c:forEach>
</table>


</body>
</html>