package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigCar {

    //@Bean(name="car1")
    @Bean
    Car car() {
        Car c = new Car();
        c.setMake("Jeep");
        return c;
    }

    //@Bean(name="car2")
    @Bean
    @Primary
    Car car2() {
        Car c = new Car();
        c.setMake("Aston Martin");
        return c;
    }

    // ****   // Example of direct wiring
    @Bean
    Person person(){
        Person p =new Person();
        p.setName("Anna");
        p.setCar(car2());
        return p;
    }
}
