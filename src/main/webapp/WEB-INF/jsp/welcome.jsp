<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Welcome</title>
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
          color: #333;
        }

        .welcome-container {
          background-color: white;
          padding: 3rem 2rem;
          border-radius: 1rem;
          box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
          text-align: center;
          max-width: 500px;
          width: 100%;
        }

        .welcome-container h1 {
          font-size: 2.5rem;
          margin-bottom: 1rem;
        }

        .welcome-container p {
          font-size: 1.1rem;
          margin-bottom: 2rem;
        }

        .btn {
          display: inline-block;
          padding: 0.75rem 1.5rem;
          background-color: #7f7fd5;
          color: white;
          text-decoration: none;
          border-radius: 0.5rem;
          font-weight: bold;
          transition: background-color 0.3s ease;
        }

        .btn:hover {
          background-color: #5f5fcf;
        }
    </style>
</head>
<body>
<div class="welcome-container">
    <h1>Welcome, ${name}!</h1>
    <p>You've successfully logged in. We're glad to have you back! </p>
    <p>Your username for now is ${email}</p>
    <a href="login.html" class="btn">Logout</a>
</div>
</body>
</html>
