package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Annotate the class with the @Controller stereotype annotation, creating a view from this class.
public class HomeController {


    @RequestMapping("/home") //Use @RequestMapping annotation to associate the action with an HTTP request path
    public String home(){
        return "home.html"; // return HTML document name that contains details that the browser will show on the UI
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }

    @RequestMapping
    public String home2(){
        return "welcome.html";
    }

}
