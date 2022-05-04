package com.cydeo.proxy;

import com.cydeo.model.Comment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("New comment is added here - go workout " + comment.getText());
    }
}
