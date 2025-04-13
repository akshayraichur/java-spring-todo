package com.akshayraichur.todo_spring_app.todo_spring_app.sayHi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // this creates a spring bean, attaches this class to spring application. // Controller is something that handles web request.
public class SayHelloController {
    @RequestMapping("sayhi")
    @ResponseBody // whatever that we are returning, we will simply attach that as response body to http request.
    public String SayHello(){
        return "hi!";
    }

    @RequestMapping("sayhi-html")
    @ResponseBody // whatever that we are returning, we will simply attach that as response body to http request.
    public String SayHelloHTML(){
        StringBuffer sb = new StringBuffer();
        // we can also use string buffer object to send out multiple strings, instead of concatinating.

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("This is a HTML Title");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1> Hi there! </h1>");
        sb.append("</body>");

//        return "<html><head><title>hi there</title></head><body><h1>This is HTML Page</h1></body></html>";
        return sb.toString();
    }

    // one of the earlier view technologies is JSP, Java Server page
    // url -> sayhi-jsp
    // to use jsp pages, we need to create this directory first, /src/resources/META-INF/resources/WEB-INF/jsp/sayHi.jsp
    @RequestMapping("/sayhi-jsp")
    public String SayHelloJSP(){
        return "sayHi";
    }

}
