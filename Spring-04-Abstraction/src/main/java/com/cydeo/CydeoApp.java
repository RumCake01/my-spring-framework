package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    // this is our runner class and always has to be under the cydeo package

    public static void main(String[] args) {

        // we pass the modal object here to build the command and then callign the method we create the command publish results

        Comment comment = new Comment();
        comment.setAuthor("Dostoevsky");
        comment.setText("Crime and Punishment");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
