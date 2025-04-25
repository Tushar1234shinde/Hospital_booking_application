<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>
    <div class="login-container">
        <div class="login-box">
            <h2>Login</h2>
            <form action="LoginServlet" method="post" class="login-form">
                <!-- ID/No. Field -->
                <div class="input-group">
                    <label for="id-no">ID/No.</label>
                    <input type="text" id="id" name="id" placeholder="Enter your ID or No." required>
                </div>

                <!-- Password Field -->
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" placeholder="Enter your password" required>
                </div>

                <!-- OTP Field -->
                <div class="input-group">
                    <label for="otp">OTP</label>
                    <input type="text" id="otp" name="otp" placeholder="Enter OTP" required>
                </div>

                <!-- Submit Button -->
                <button type="submit">Login</button>
            </form>
        </div>
    </div>
</body>
</html>