package com.hcl.mvvm_tutorial.viewmodel;

import android.databinding.BaseObservable;

import com.hcl.mvvm_tutorial.R;
import com.hcl.mvvm_tutorial.model.User;

public class UserModel extends BaseObservable {

    private String email;
    private String password;
    private String emailHint;
    private String passwordHint;

    public UserModel(User user)
    {
        this.emailHint = user.emailHint;
        this.passwordHint = user.passwordHint;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(R.id.etEmail);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.etPassword);
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
