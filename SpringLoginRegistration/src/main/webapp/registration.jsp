<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .registration-container {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .registration-container h2 {
            margin-bottom: 20px;
            text-align: center;
        }
        .registration-container input[type="text"],
        .registration-container input[type="password"],
        .registration-container input[type="tel"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .registration-container input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            color: white;
            border-radius: 4px;
            cursor: pointer;
        }
        .registration-container input[type="submit"]:hover {
            background-color: #45a049;
        }
        .registration-container .login-link {
            text-align: center;
            margin-top: 10px;
        }
        .registration-container .login-link a {
            color: #4CAF50;
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="registration-container">
    <h2>Register</h2>
    <form action="register" method="POST">
        <input type="text" name="name" placeholder="Name" >
        <input type="text" name="username" placeholder="Username" >
        <input type="text" name="password" placeholder="Password" >
        <input type="tel" name="mobile" placeholder="Mobile Number" >
        <input type="submit" value="Register">
    </form>
    <div class="login-link">
        <p>Already have an account? <a href="login">Login here</a></p>
    </div>
</div>

</body>
</html>

</body>
</html>