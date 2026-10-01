package com.catalog.usermanagementrebuild;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<User> users = new ArrayList<>();

    public AuthService() {
        users.add(new User(1,"daniel", "Hurrey"));
        users.add(new User(2,"alice", "pass"));
    }

    public String register(User user) {
        users.add(user);
        return "User registered successfully!";
    }







}
