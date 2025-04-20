package com.akshayraichur.todo_spring_app.todo_spring_app.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcomeUser(){
        return "welcome";
    }
}

