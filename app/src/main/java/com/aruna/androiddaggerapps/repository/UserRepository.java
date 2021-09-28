package com.aruna.androiddaggerapps.repository;

import javax.inject.Inject;
import javax.inject.Singleton;

// Scope this class to a component using @Singleton scope (i.e. ApplicationGraph)

@Singleton
public class UserRepository {
    private final UserLocalDataSource userLocalDataSource;
    private final UserRemoteDataSource userRemoteDataSource;

    // @Inject lets Dagger know how to create instances of this object
    @Inject
    public UserRepository(UserLocalDataSource userLocalDataSource, UserRemoteDataSource userRemoteDataSource) {
        this.userLocalDataSource = userLocalDataSource;
        this.userRemoteDataSource = userRemoteDataSource;
    }
}
