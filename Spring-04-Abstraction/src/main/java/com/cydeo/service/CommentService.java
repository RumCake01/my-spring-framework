package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService{

    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;


    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;


    }

    // now we need to provide the logic to build the comment and save it
    // The below is the old way of doing this with Java.

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
