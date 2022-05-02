package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "developer John";
    }

    @Bean
    Integer num(){
        return 1000000;
    }


}
