<!DOCTYPE html>
<html>
<head>
  <title>Registration Page</title>
  <style>
    body{
        background-color: purple;
        color: white;
    }
    h1{
        text-align: center;
    }
    form{
        display: block;
    }
  </style>
  <script>
    function validateForm() {
      // Get form values
      var userId = document.getElementById("userId").value;
      var name = document.getElementById("name").value;
      var password = document.getElementById("password").value;
      var email = document.getElementById("email").value;
      
      // User ID validation
      if (userId.length < 5 || userId.length > 12) {
        alert("User ID must be between 5 and 12 characters long");
        return;
      }
      
      // Name validation
      if (name.length < 10 || !/^[a-zA-Z ]+$/.test(name)) {
        alert("Name must be at least 10 characters long and contain only alphabets");
       return;
      }
      
      // Password validation
      var passwordRegex = /^(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()])[A-Za-z\d!@#$%^&*()]{8,}$/;
      if (!passwordRegex.test(password)) {
        alert("Password must be eight characters including one uppercase letter, one special character, and alphanumeric characters");
        return;
      }
      
      // Email validation
      var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
      if (!emailRegex.test(email)) {
        alert("Invalid email address");
        return;
      }

      let details= "User ID: " + userId + "\nName: " + name + "\nPassword: " + password +"\nEmail: " + email;
      alert(`${details}`)
    }
  </script>
</head>
<body>
  <h1>Registration Page</h1>
  <form name="registrationForm" align="center">
    <label for="userId">User ID:</label>
    <input type="text" id="userId" name="userId"><br><br>
    
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" ><br><br>
    
    <label for="password">Password:</label>
    <input type="text" id="password" name="password"><br><br>
    
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br><br>
    
   <button onclick="validateForm()">Submit</button>
  </form>

  <br>

</body>
</html>
