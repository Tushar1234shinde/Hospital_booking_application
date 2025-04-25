<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up page</title>
<link rel="stylesheet" href="signup.css">
</head>
<body>
<div class="signup-container">
        <form action="SignupServlet" method="post" class="signup-form">
            <h2>Create Account</h2>

            <!-- ID Field -->
            <label for="id">Enter ID:</label>
            <input type="text" id="id" name="id" placeholder="Enter your unique ID" required>

            <!-- Phone Number Field -->
            <label for="phone">Phone No.:</label>
            <input type="tel" id="phone" name="phone" placeholder="Enter your phone number" required>

            <!-- Password Field -->
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            <!-- Submit Button -->
            <button type="submit">SignUp</button>
        </form>
    </div>
</body>
</html>