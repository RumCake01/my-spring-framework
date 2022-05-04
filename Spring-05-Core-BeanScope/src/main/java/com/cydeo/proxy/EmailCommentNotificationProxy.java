package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy  implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending a notification for the comment: " + comment.getText());

    }
}
