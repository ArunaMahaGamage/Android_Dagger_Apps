package com.aruna.androiddaggerapps;

import android.app.Application;

// appComponent lives in the Application class to share its lifecycle
public class MyApplication extends Application {

    // Reference to the application graph that is used across the whole app
    ApplicationComponent appComponent = DaggerApplicationComponent.create();
}
