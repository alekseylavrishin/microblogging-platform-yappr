package com.aleksey.yappr.entity;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Comment {

    @Id
    public String commentId;

    public String username;
    public String text;
    public Date commentDate;

    public Comment(String username, String text, Date commentDate) {
        this.username = username;
        this.text = text;
        this.commentDate = commentDate;
    }
}
