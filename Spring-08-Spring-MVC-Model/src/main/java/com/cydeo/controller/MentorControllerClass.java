package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor") // this is representing the class level.
public class MentorControllerClass {

    @RequestMapping("/list") // can be many methods and thats why we have the mentor end point separated on top.
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Johnson", 30, Gender.MALE));
        mentorList.add(new Mentor("Melanie", "Ben", 33, Gender.FEMALE));
        mentorList.add(new Mentor("Dan", "Brock", 40, Gender.MALE));
        mentorList.add(new Mentor("Jeyna", "Broler", 29, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);




        return "mentor/mentor-list";
    }

}


