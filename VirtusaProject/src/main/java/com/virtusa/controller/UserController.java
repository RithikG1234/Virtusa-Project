package com.virtusa.controller;

import com.virtusa.model.User;
import com.virtusa.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/signUp")
    public User signUp(@RequestBody User user){
        return userRepository.save(user);
    }

}
