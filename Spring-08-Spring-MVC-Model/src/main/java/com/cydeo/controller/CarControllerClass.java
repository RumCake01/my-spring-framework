package com.cydeo.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car") // localhost:8080/car/info?make=Hond
public class CarControllerClass {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make,@RequestParam Integer year,   Model model){
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }
    @RequestMapping("/info2") // localhost:8080/car/info2?make=Honda&year=2020

    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "BMW") String make, @RequestParam Integer year, Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);



        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}/{color}") // localhost:8080/car/info/Honda/2015/White
    public String getCarInfo(@PathVariable String make, @PathVariable Integer year, @PathVariable String color,   Model model){
        // PathVariable allows to make end point dynamic/ changing
        model.addAttribute("make", make);
        model.addAttribute("year", year);
       model.addAttribute("color", color);
        return "car/car-info" ;
    }

}
