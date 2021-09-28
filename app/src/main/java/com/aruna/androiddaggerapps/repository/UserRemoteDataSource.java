package com.aruna.androiddaggerapps.repository;

import com.aruna.androiddaggerapps.LoginRetrofitService;

import javax.inject.Inject;

public class UserRemoteDataSource {

    private final LoginRetrofitService loginRetrofitService;

    @Inject
    public UserRemoteDataSource(LoginRetrofitService loginRetrofitService) {
        this.loginRetrofitService = loginRetrofitService;
    }
}
