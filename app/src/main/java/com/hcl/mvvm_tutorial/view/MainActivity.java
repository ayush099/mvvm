package com.hcl.mvvm_tutorial.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hcl.mvvm_tutorial.R;
import com.hcl.mvvm_tutorial.commands.UserLogin;
import com.hcl.mvvm_tutorial.databinding.ActivityMainBinding;
import com.hcl.mvvm_tutorial.model.User;
import com.hcl.mvvm_tutorial.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("D_UserName", "D_Password");
        UserModel userModel = new UserModel(user);

        activityMainBinding.setSlogin(userModel);

        activityMainBinding.setUserLoginEvent(new UserLogin()
        {
            @Override
            public void onClickLogin()
            {
                if (activityMainBinding.getSlogin().getEmail().length()<=0)
                {
                    Toast.makeText(MainActivity.this, "Please enter UserId", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "LogIn Success " + activityMainBinding.getSlogin().getEmail() +" " + activityMainBinding.getSlogin().getPassword(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
