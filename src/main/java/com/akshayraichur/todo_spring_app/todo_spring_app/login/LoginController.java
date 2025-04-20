package com.akshayraichur.todo_spring_app.todo_spring_app.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService){
        super();
        this.authenticationService = authenticationService;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * Whenever we want to pass anything from controller to view, you need to make use of Model.
     * Import ModelMap and give it a name. Then we can add anything to model and that will be available to jsp
     */
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login(){
//        logger.info("I want this to be printed at info level");
//        logger.warn("I want this to be printed at warn level");

        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String redirectToWelcomePage(@RequestParam String name, @RequestParam String email, @RequestParam String password, ModelMap model){
        model.put("name", name);
        model.put("email", email);
        model.put("password", password);

//        Adding hardcoded authentication
//        The below implementation is vanilla java. But lets make use of spring to do that same.
//        AuthenticationService auth = new AuthenticationService();
//        boolean isCorrect = auth.authenticateUser(name, password);

        boolean isCorrect = authenticationService.authenticateUser(name, password);

        if(isCorrect){
            return "welcome";
        }

        return "login";
    }
}
