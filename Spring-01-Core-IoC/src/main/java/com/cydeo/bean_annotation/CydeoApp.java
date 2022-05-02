package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);
        Fulltime_mentor ft = container.getBean(Fulltime_mentor.class);
        ft.createAccount();
        Parttime_mentor pt = container.getBean("p1", Parttime_mentor.class);
        pt.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);

        Integer salary=container.getBean(Integer.class);
        System.out.println(salary);

    }
}
