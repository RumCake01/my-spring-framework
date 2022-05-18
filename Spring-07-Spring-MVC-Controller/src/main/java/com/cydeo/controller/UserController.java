package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")// the end point we are calling which has the below associated hmtl page
    public String user(){
        return "user/userinfo.html"; // we need to provide the folder where it is located if it is not under the static folder

    }
}
