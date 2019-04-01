package com.hcl.mvvm_tutorial.day_one.model;

public class User {

    public String email;
    public String password;
    public String emailHint;
    public String passwordHint;

    public User(String emailHint, String passwordHint)
    {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }



}
