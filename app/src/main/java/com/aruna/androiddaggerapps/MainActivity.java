package com.aruna.androiddaggerapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.aruna.androiddaggerapps.viewModel.LoginViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Reference to the Login graph
    public LoginComponent loginComponent;

    // You want Dagger to provide an instance of LoginViewModel from the graph
    @Inject
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Make Dagger instantiate @Inject fields in LoginActivity
//        ((MyApplication) getApplicationContext()).appComponent.inject(this);
        // Now loginViewModel is available

        // Creation of the login graph using the application graph
        loginComponent = ((MyApplication) getApplicationContext()).appComponent.loginComponent().create();

        // Make Dagger instantiate @Inject fields in LoginActivity
        loginComponent.inject(this);

        if (loginViewModel == null) {
            Log.e("MainActivity : ", "loginViewModel is null");
        } else {
            Log.e("MainActivity : ", "loginViewModel is not null");
        }
    }
}