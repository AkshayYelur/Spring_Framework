<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Registration</title>
<style>
body {
  font-family: sans-serif;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background: url('https://placehold.co/1920x1080') no-repeat center center fixed; /* Background image */
  background-size: cover;
}
.registration-container {
  background-color: rgba(255, 255, 255, 0.8);
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  text-align: center;
}
label {
  display: block;
  margin-bottom: 5px;
}
input[type="text"],
input[type="password"],
input[type="email"],
input[type="tel"] {
  width: 100%;
  padding: 10px;
  margin-bottom: 10px;
  border: 1px solid #ccc;
  border-radius: 3px;
  box-sizing: border-box;
}
input[type="submit"] {
  background-color: #4CAF50;
  color: white;
  padding: 10px 15px;
  border: none;
  border-radius: 3px;
  cursor: pointer;
}
</style>
</head>
<body>

<div class="registration-container">
  <h1>Admin Registration</h1>
  <form action="adminregtohomepage">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" >

    <label for="username">Username:</label>
    <input type="text" id="username" name="username" >

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" >

    <label for="mobile">Mobile:</label>
    <input type="tel" id="mobile" name="mobile" >

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" >

    <input type="submit" value="Register">
  </form>
</div>

</body>
</html>
