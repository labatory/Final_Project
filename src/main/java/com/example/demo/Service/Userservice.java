// UserService.java
package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice {

    private final UserRepository userRepository;

    public Userservice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        // Validate user information if necessary
        return userRepository.save(user);  // Save the user object to the database
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}