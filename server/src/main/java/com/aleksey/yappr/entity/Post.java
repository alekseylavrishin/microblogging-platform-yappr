package com.aleksey.yappr.entity;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

public class Post {

    @Id
    public String id;

    public String username;
    public String text;
    public int likes;
    public Date postDate;
    public List<String> commentIds;

    public Post(String username, String text, int likes, Date postDate, List<String> commentIds) {
        this.username = username;
        this.text = text;
        this.likes = likes;
        this.postDate = postDate;
        this.commentIds = commentIds;
    }

}
