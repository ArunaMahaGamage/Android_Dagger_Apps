package com.aruna.androiddaggerapps;

import dagger.Component;

// The "modules" attribute in the @Component annotation tells Dagger what Modules
// to include when building the graph
@Component(modules = NetworkModule.class)
public interface ApplicationComponent {
    // This tells Dagger that MainActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is injecting.
    void inject(MainActivity mainActivity);
}
