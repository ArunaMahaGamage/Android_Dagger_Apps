package com.aruna.androiddaggerapps.fragments;

import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aruna.androiddaggerapps.MainActivity;
import com.aruna.androiddaggerapps.R;
import com.aruna.androiddaggerapps.viewModel.LoginViewModel;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public class LoginPasswordFragment extends Fragment {

    // Fields that need to be injected by the login graph
    @Inject
    LoginViewModel loginViewModel;


    public static LoginPasswordFragment newInstance() {
        return new LoginPasswordFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.login_password_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);

        // Obtaining the login graph from MainActivity and instantiate
        // the @Inject fields with objects from the graph
        ((MainActivity) getActivity()).loginComponent.inject(((MainActivity) getActivity()));

        // Now you can access loginViewModel here and onCreateView too
        // (shared instance with the Activity and the other Fragment)
    }
}