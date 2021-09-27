package com.aruna.androiddaggerapps;

import dagger.Component;

// Definition of the Application graph
@Component
public interface ApplicationComponent {
    // This tells Dagger that MainActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is injecting.
    void inject(MainActivity mainActivity);
}
