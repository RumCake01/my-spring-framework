package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    // this is our runner class and always has to be under the cydeo package

    public static void main(String[] args) {

        // we pass the modal object here to build the command and then calling the method we create the command publish results

        Comment comment = new Comment();
        comment.setAuthor("Dostoevsky");
        comment.setText("Crime and Punishment");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        // this below is singleton pattern
        CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);
        // we are printing the memory location below
        System.out.println(cs1);
        System.out.println(cs2);

        // this below is singleton pattern
        // lets check if beans are the same or not, returns true because we are using the same objects
        System.out.println(cs1==cs2);

    }
}
