package com.dap.myapplication.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.dap.myapplication.R;
import com.dap.myapplication.databinding.EmailsendFragmentBinding;
import com.dap.myapplication.entity.User;

public class CheckEmailFragment extends Fragment {

    private EmailsendFragmentBinding emailsendFragmentBinding;
    private static CheckEmailFragment checkEmailFragment;

    private CheckEmailFragment() {

    }

    public static CheckEmailFragment newInstance() {
        if (checkEmailFragment == null) {
            checkEmailFragment = new CheckEmailFragment();
        }
        return checkEmailFragment;
    }

    @Override
    public void onStart() {
        super.onStart();
        if(getArguments() != null && getArguments().containsKey(User.USER_EMAIL)){
            String email = getArguments().getString(User.USER_EMAIL);
            emailsendFragmentBinding.tvSendEmail.setText("Reset link has been sent to " + email);
        }
        emailsendFragmentBinding.btnToLogin.setOnClickListener(view -> {
            LoginFragment loginFragment = LoginFragment.newInstance();

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.loginContainer, loginFragment);
            transaction.commit();
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        emailsendFragmentBinding = emailsendFragmentBinding.inflate(inflater, container, false);
        return emailsendFragmentBinding.getRoot();
    }
}
