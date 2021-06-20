package com.dap.myapplication.fragment;

import android.content.Intent;
import android.icu.text.UnicodeSetIterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.dap.myapplication.HomeActivity;
import com.dap.myapplication.MainActivity;
import com.dap.myapplication.R;
import com.dap.myapplication.databinding.LoginFragmentBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginFragment extends Fragment {

    private LoginFragmentBinding fragmentBinding;
    private static LoginFragment loginFragment;
    private FirebaseAuth mAuth;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    private LoginFragment() {

    }

    public static LoginFragment newInstance() {
        if (loginFragment == null) {
            loginFragment = new LoginFragment();
        }
        return loginFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("users");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentBinding = LoginFragmentBinding.inflate(inflater, container, false);
        fragmentBinding.btnLogin.setOnClickListener(view -> {
            String username = fragmentBinding.inputName.getText().toString();
            String password = fragmentBinding.inputPass.getText().toString();
            if (username.trim().isEmpty() || password.trim().isEmpty()) {
                Toast.makeText(getContext(), getResources().getString(R.string.error_login), Toast.LENGTH_SHORT).show();
            } else {
                mAuth.signInWithEmailAndPassword(username, password).addOnCompleteListener(command -> {
                    if (command.isSuccessful()) {
                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        System.out.println(firebaseUser);
                        updateUI(firebaseUser);
                    } else {
                        Toast.makeText(getContext(), "Wrong email format or password less than 6", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        fragmentBinding.tvForgotPassword.setOnClickListener(view -> {
            ForgotPasswordFragment forgotPasswordFragment = ForgotPasswordFragment.newInstance();

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.loginContainer, forgotPasswordFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        fragmentBinding.tvSignup.setOnClickListener(view -> {
            SignUpFragment signUpFragment = SignUpFragment.newInstance();

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.loginContainer, signUpFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        return fragmentBinding.getRoot();
    }

    private void updateUI(FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        fragmentBinding.inputName.setText("");
        fragmentBinding.inputPass.setText("");
        FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {
            updateUI(user);
        }
    }

}