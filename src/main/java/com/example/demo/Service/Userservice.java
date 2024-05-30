package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class Userservice {

    private final UserRepository userRepository;

    @Autowired
    public Userservice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(User user) {
        if (user.getTag() == 1 || user.getTag() == 2) {
            return userRepository.save(user);
        } else {
            throw new IllegalArgumentException("tag must be 1 or 2");
        }
    }
}