package com.cydeo;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor // with ths constructor we dont need to provide @Autowired annotation
public class Java extends OfficeHours {

    // field injection is not recommended
//    @Autowired
//    OfficeHours officeHours;


    // COnstructor injection, but instead we used ->
    // @AllArgumentsConstructor because we have only one constructor and we dont have a constructor in OfficeHours class.
    OfficeHours officeHours;

    public void getTeachingHours() {
        System.out.println("Weekly teaching hour for java is: " + officeHours.getHours());

    }
}
