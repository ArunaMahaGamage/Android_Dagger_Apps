package com.aruna.androiddaggerapps.viewModel;

import com.aruna.androiddaggerapps.ActivityScope;
import com.aruna.androiddaggerapps.repository.UserRepository;

import javax.inject.Inject;

// A unique instance of LoginViewModel is provided in Components
// annotated with @ActivityScope
@ActivityScope
public class LoginViewModel {

    private final UserRepository userRepository;
    // @Inject tells Dagger how to create instances of LoginViewModel
    @Inject
    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
