package com.virtusa.model;

import lombok.Data;


public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String careerGoals;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCareerGoals() {
        return careerGoals;
    }

    public void setCareerGoals(String careerGoals) {
        this.careerGoals = careerGoals;
    }


    public User(Integer id, String name, String email, String password, String careerGoals) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.careerGoals = careerGoals;
    }
    public User(){

    }
}
