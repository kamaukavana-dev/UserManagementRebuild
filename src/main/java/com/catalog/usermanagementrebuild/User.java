package com.catalog.usermanagementrebuild;

public class User {
    private Integer id; // FIXED
    private String username;
    private String password;
    //constructor
    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    //Getters methods
    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    //setter methods
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
