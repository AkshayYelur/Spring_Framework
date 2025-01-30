<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="doupdate">
<br>
<br>
RollNo:
<input type="hidden" name="rollno" value="${data.rollno}">
<br>
<br>
Name:
<input type="text" name="name" value="${data.name}">
<br>
<br>
UserName:
<input type="text" name="username" value="${data.username}">
<br>
<br>

Password:
<input type="text" name="password" value="${data.password}">
<br>
<br>
mobile:
<input type="text" name="mobile" value="${data.mobile}">
<br>
<br>
Email:
<input type="text" name="email" value="${data.username}">
<br>
<br>
<input type="submit" value="update">
</form>

</body>
</html>