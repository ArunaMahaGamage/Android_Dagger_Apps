package com.aruna.androiddaggerapps;

import javax.inject.Singleton;

import dagger.Component;

// The "modules" attribute in the @Component annotation tells Dagger what Modules
// to include when building the graph
@Singleton
@Component(modules = {NetworkModule.class, SubcomponentsModule.class})
public interface ApplicationComponent {
    // This tells Dagger that MainActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is injecting.
//    void inject(MainActivity mainActivity);

    // This function exposes the LoginComponent Factory out of the graph so consumers
    // can use it to obtain new instances of LoginComponent
    LoginComponent.Factory loginComponent();
}
