package com.aruna.androiddaggerapps.viewModel;

import com.aruna.androiddaggerapps.repository.UserRepository;

import javax.inject.Inject;

public class LoginViewModel {

    private final UserRepository userRepository;
    // @Inject tells Dagger how to create instances of LoginViewModel
    @Inject
    public LoginViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
