package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigCar {

    @Bean(name="car1")
    Car car() {
        Car c = new Car();
        c.setMake("BMW");
        return c;
    }

    @Bean(name="car2")
    Car car2() {
        Car c = new Car();
        c.setMake("Jeep");
        return c;
    }
}
