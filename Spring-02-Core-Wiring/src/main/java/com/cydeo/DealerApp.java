package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
        Car newCar = container.getBean(Car.class);
        System.out.println("cars brand : "+ newCar.getMake());

        Person person1 = container.getBean(Person.class);
        System.out.println("Person's name: "+ person1.getName());
        System.out.println("Car's name: "+ newCar.getMake());
        System.out.println("Person's car: "+ person1.getCar());




    }
}
