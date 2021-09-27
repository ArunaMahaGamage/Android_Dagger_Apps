package com.aruna.androiddaggerapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.aruna.androiddaggerapps.viewModel.LoginViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // You want Dagger to provide an instance of LoginViewModel from the graph
    @Inject
    LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Make Dagger instantiate @Inject fields in LoginActivity
        ((MyApplication) getApplicationContext()).appComponent.inject(this);
        // Now loginViewModel is available

        if (loginViewModel == null) {
            Log.e("MainActivity : ", "loginViewModel is null");
        } else {
            Log.e("MainActivity : ", "loginViewModel is not null");
        }
    }
}