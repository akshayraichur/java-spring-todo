package com.akshayraichur.todo_spring_app.todo_spring_app.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * Whenever we want to pass anything from controller to view, you need to make use of Model.
     * Import ModelMap and give it a name. Then we can add anything to model and that will be available to jsp
     */
    @RequestMapping("/login")
    public String login(@RequestParam String redirectTo, ModelMap model){
        model.put("redirectTo", redirectTo);
        logger.debug("Request param is {}", redirectTo);
//        logger.info("I want this to be printed at info level");
//        logger.warn("I want this to be printed at warn level");

        return "login";
    }
}
