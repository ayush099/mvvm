package com.hcl.mvvm_tutorial.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
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
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final UserModel userModel = ViewModelProviders.of(MainActivity.this).get(UserModel.class);

        activityMainBinding.setSlogin(userModel);
        activityMainBinding.setLifecycleOwner(this);

//        userModel.getMutableEmail().observe(MainActivity.this, new Observer<String>()
//        {
//                    @Override
//                    public void onChanged(@Nullable String s)
//                    {
//                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//        userModel.getMutablePassword().observe(MainActivity.this, new Observer<String>()
//        {
//            @Override
//            public void onChanged(@Nullable String s)
//            {
//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
//            }
//        });



//        User user = new User("D_UserName", "D_Password");
//        UserModel userModel = new UserModel(user);

        //activityMainBinding.setSlogin(userModel);

        activityMainBinding.setUserLoginEvent(new UserLogin()
        {
            @Override
            public void onClickLogin()
            {
               // userModel.onButtonClick();

                Toast.makeText(MainActivity.this, userModel.getMutableEmail().getValue(), Toast.LENGTH_SHORT).show();

                /*if (activityMainBinding.getSlogin().getEmail().length()<=0)
                {
                    Toast.makeText(MainActivity.this, "Please enter UserId", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "LogIn Success " + activityMainBinding.getSlogin().getEmail() +" " + activityMainBinding.getSlogin().getPassword(), Toast.LENGTH_SHORT).show();
                }*/
            }
        });




    }
}



//        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//         LoginViewModel loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
//
//        activityMainBinding.setLoginViewModel(loginViewModel);
//
//         activityMainBinding.setLifecycleOwner(this);
//
//         loginViewModel.getUserMutableLiveData().observe(this, new Observer<User>() {
//             @Override
//     public void onChanged(@Nullable User user)
//        {
//                 if (user.getEmail().length() > 0 || user.getPassword().length() > 0) {
//                     Toast.makeText(MainActivity.this, "Your email" + user.getEmail() + "and Password is: " + user.getPassword(), Toast.LENGTH_LONG).show();
//                 }
//             }
//         });

