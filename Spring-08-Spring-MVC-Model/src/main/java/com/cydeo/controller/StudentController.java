package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model) {

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        // create random StudentId using Randon.nextInt
        int studentID = new Random().nextInt();
        model.addAttribute("id", studentID);

        List<Integer> numbers = new ArrayList<>();
        // from this arraylist we can access any object with its index number by using numbers.get(0) in the HTML page
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(4);
        model.addAttribute("numbers", numbers);

        Student student = new Student(100, "Ella", "Doo");
        model.addAttribute("student", student);



        return "student/welcome"; // we dont use .html here because it is a template from thymeleaf

    }





    @RequestMapping("/career")
    public String homepage2(Model model) {
        model.addAttribute("newJob", "I landed a Developer role at Apple");

        return "jobs/career";
    }

}
