package com.aruna.androiddaggerapps;

import dagger.Subcomponent;

// @Subcomponent annotation informs Dagger this interface is a Dagger Subcomponent
@Subcomponent
public interface LoginComponent {

    // Factory that is used to create instances of this subcomponent
    @Subcomponent.Factory
    interface Factory {
        LoginComponent create();
    }

    void inject(MainActivity mainActivity);
}
