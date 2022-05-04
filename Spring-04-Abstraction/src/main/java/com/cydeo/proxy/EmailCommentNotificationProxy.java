package com.cydeo.proxy;

import com.cydeo.model.Comment;

public class EmailCommentNotificationProxy  implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending a notification for the comment: " + comment.getText());

    }
}
