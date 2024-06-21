// UserController.java
package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.Userservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    private final Userservice userService;

    public UserController(Userservice userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/signup")
    public String signupForm() {
        return "signup";
    }
}