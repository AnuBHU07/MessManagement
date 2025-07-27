package com.mess.controller;

import com.mess.entity.User;
import com.mess.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        Optional<User> found = service.login(user.getEmail(), user.getPassword());
        return found.isPresent() ? "Login Successful" : "Invalid Credentials";
    }
}
