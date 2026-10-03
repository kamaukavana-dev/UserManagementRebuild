package com.catalog.usermanagementrebuild;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public class Controller {
    private final AuthService authService;

    public Controller(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return authService.getUsers();
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return authService.login(user);
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable int id, @RequestBody User user) {
        return authService.updateUser(id, user);
    }

}


}
