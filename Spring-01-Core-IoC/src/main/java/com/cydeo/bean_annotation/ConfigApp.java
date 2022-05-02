package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    Fulltime_mentor fulltime_mentor(){
        return new Fulltime_mentor();
    }

    @Bean
    Parttime_mentor parttime_mentor(){
        return new Parttime_mentor();

    }

    @Bean(name="p1")

    Parttime_mentor parttime_mentor2(){
        return  new Parttime_mentor();
    }
}
