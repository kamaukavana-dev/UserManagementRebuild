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

    public String login(User user) {
        for (User user1 : users) {
            if (user1.getUsername().equalsIgnoreCase(user.getUsername()) &&
                    user1.getPassword().equalsIgnoreCase(user.getPassword())) {
                return "Login successfully!";
            }
        }
        return "Invalid username or password";
    }

    public List<User> getUsers() {
        return users;
    }

    public User updateUser(int id, User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setUsername(updatedUser.getUsername());
                user.setPassword(updatedUser.getPassword());
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }

    public String deleteUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return "User deleted successfully";
            }
        }
        throw new RuntimeException("User not found");
    }

}
