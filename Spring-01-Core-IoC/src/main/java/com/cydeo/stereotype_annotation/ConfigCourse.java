package com.cydeo.stereotype_annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan
@ComponentScan(basePackages = "com.cydeo") // looks up beans in matching files under com.cydeo packages

public class ConfigCourse {


}
