package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model) {

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");


        return "student/welcome"; // we dont use .html here because it is a template from thymeleaf
    }

    @RequestMapping("/career")
    public String homepage2(Model model) {
        model.addAttribute("newJob", "I landed a Developer role at Apple");

        return "jobs/career";
    }

}
