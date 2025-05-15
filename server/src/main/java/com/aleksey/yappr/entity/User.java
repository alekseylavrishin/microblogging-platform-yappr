package com.aleksey.yappr.entity;

import org.springframework.data.annotation.Id;
import java.util.List;

/**
 * A class defining a User domain object
 */
public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private List<String> followedUsers;

    public User(String username, String password, List<String>followedUsers) {
        this.username = username;
        this.password = password;
        this.followedUsers = followedUsers;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, username='%s', password='%s']",
                id, username, password
        );
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFollowedUsers() {
        return followedUsers;
    }

    public void setFollowedUsers(List<String> followedUsers) {
        this.followedUsers = followedUsers;
    }

}
