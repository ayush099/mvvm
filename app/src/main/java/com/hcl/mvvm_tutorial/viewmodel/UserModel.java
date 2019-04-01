package com.hcl.mvvm_tutorial.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BaseObservable;
import android.view.View;

import com.hcl.mvvm_tutorial.R;
import com.hcl.mvvm_tutorial.model.User;

public class UserModel extends ViewModel
{

//    private String email;
//    private String password;
    private String emailHint;
    private String passwordHint;

    public MutableLiveData<String> mutableEmail;
    public MutableLiveData<String> mutablePassword;
    public MutableLiveData<User> userMutableLiveData;

    public MutableLiveData<String> getMutableEmail() {
        if (mutableEmail == null)
        {
            mutableEmail = new MutableLiveData<>();
        }

        return mutableEmail;
    }


    public MutableLiveData<String> getMutablePassword() {

        if (mutablePassword == null)
        {
            mutablePassword = new MutableLiveData<>();
        }
        return mutablePassword;
    }



    public MutableLiveData<User> getUser()
    {
        if (userMutableLiveData != null)
        {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;
    }

    //    public UserModel(User user)
//    {
//        this.emailHint = user.emailHint;
//        this.passwordHint = user.passwordHint;
//    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//        notifyPropertyChanged(R.id.etEmail);
//    }

//    public String getPassword() {
//        return password;
//    }

//    public void setPassword(String password) {
//        this.password = password;
//        notifyPropertyChanged(R.id.etPassword);
//    }

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


    public void onButtonClick()
    {
        //User user = new User(email.getValue(), password.getValue());
        //userMutableLiveData.postValue(user);
        mutableEmail.postValue(mutableEmail.getValue());
        mutablePassword.postValue(mutablePassword.getValue());
    }
}
