<!DOCTYPE html>
<html>
<head>
<title>Admin/Employee Selection</title>
<style>
body {
  font-family: sans-serif;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background: url('https://placehold.co/1920x1080') no-repeat center center fixed;
  background-size: cover;
}

.selection-container {
  background-color: rgba(255, 255, 255, 0.8);
  padding: 20px;
  border-radius: 5px;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  text-align: center;
  width: 300px;
}

button {
  display: block;
  margin: 10px auto;
  padding: 10px 20px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 3px;
  cursor: pointer;
  width: 100%; /* Make buttons full width */
  box-sizing: border-box;
}
</style>
</head>
<body>

<div class="selection-container">
  <h1>Login Selection</h1>
  
  <a href="admin">
  <input type="submit" value="Admin login" ></a>
  
  <a href="employee">
  <input type="submit" value="Employee login" ></a>
  
</div>

</body>
</html>
