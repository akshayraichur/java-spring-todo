<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Login Form</title>
    <style>
        * {
          box-sizing: border-box;
        }

        body {
          margin: 0;
          padding: 0;
          font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
          background: linear-gradient(to right, #74ebd5, #9face6);
          display: flex;
          justify-content: center;
          align-items: center;
          height: 100vh;
        }

        .login-container {
          background-color: white;
          padding: 2rem;
          border-radius: 1rem;
          box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
          width: 100%;
          max-width: 400px;
        }

        .login-container h2 {
          text-align: center;
          margin-bottom: 1.5rem;
          color: #333;
        }

        .form-group {
          margin-bottom: 1.2rem;
        }

        .form-group label {
          display: block;
          margin-bottom: 0.5rem;
          color: #555;
          font-weight: 500;
        }

        .form-group input {
          width: 100%;
          padding: 0.75rem;
          border: 1px solid #ccc;
          border-radius: 0.5rem;
          font-size: 1rem;
          outline: none;
          transition: border-color 0.3s ease;
        }

        .form-group input:focus {
          border-color: #7f7fd5;
        }

        .login-btn {
          width: 100%;
          padding: 0.75rem;
          background-color: #7f7fd5;
          color: white;
          border: none;
          border-radius: 0.5rem;
          font-size: 1rem;
          font-weight: bold;
          cursor: pointer;
          transition: background-color 0.3s ease;
        }

        .login-btn:hover {
          background-color: #5f5fcf;
        }

        .bottom-text {
          margin-top: 1rem;
          text-align: center;
          font-size: 0.9rem;
          color: #555;
        }

        .bottom-text a {
          color: #7f7fd5;
          text-decoration: none;
        }

        .bottom-text a:hover {
          text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Login</h2>
    <form method="post">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" id="name" name="name" placeholder="Enter your name" required />
        </div>
        <div class="form-group">
            <label for="username">Email</label>
            <input type="email" id="username" name="email" placeholder="Enter your email" required />
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required />
        </div>
        <button class="login-btn" type="submit">Sign In</button>
    </form>
    <div class="bottom-text">
        Dont have an account? <a href="#">Register</a>
    </div>
</div>
</body>
</html>
