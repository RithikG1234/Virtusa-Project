package com.virtusa.service;

import com.virtusa.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public static List<User> userList = new ArrayList<>();

    public User userRegister(User user) {
        userList.add(user);
        return user;
    }
    public User save(User user) {
        user.setId(user.getId());
        user.setEmail(user.getEmail());
        user.setName(user.getName());
        user.setPassword(user.getPassword());
        user.setCareerGoals(user.getCareerGoals());
        userList.add(user);
        return user;
    }
    public List<User> getAllUser(){
        return userList;
    }

}
