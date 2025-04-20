package com.akshayraichur.todo_spring_app.todo_spring_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticateUser(String username, String password){
        return username.equalsIgnoreCase("akshay") && password.equalsIgnoreCase("dummy");
    }
}
