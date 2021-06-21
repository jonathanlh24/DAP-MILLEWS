package com.dap.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dap.myapplication.HomeActivity;
import com.dap.myapplication.R;
import com.dap.myapplication.databinding.SignUpPageBinding;
import com.dap.myapplication.entity.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SignUpFragment extends Fragment {
    private SignUpPageBinding signupFragmentBinding;
    private static SignUpFragment signUpFragment;
    private FirebaseAuth mAuth;

    private String gender;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    private SignUpFragment() {

    }

    public static SignUpFragment newInstance() {
        if (signUpFragment == null) {
            signUpFragment = new SignUpFragment();
        }
        return signUpFragment;
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth = FirebaseAuth.getInstance();
        signupFragmentBinding.etNameSU.setText("");
        signupFragmentBinding.etEmailSU.setText("");
        signupFragmentBinding.etPasswordSU.setText("");
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        signupFragmentBinding.radioMale.setOnCheckedChangeListener((buttonView, isChecked) -> gender = "male");
        signupFragmentBinding.radioFemale.setOnCheckedChangeListener((buttonView, isChecked) -> gender = "female");

        signupFragmentBinding.btnSignUp.setOnClickListener(view -> {
            String name = signupFragmentBinding.etNameSU.getText().toString();
            String email = signupFragmentBinding.etEmailSU.getText().toString();
            String password = signupFragmentBinding.etPasswordSU.getText().toString();


            if (email.trim().isEmpty() || password.trim().isEmpty() || name.trim().isEmpty()) {
                Toast.makeText(getContext(), getResources().getString(R.string.error_login2), Toast.LENGTH_SHORT).show();
            } else {
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(command -> {
                    if (command.isSuccessful()) {
                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        User user = new User();
                        user.setName(name);
                        user.setEmail(email);
                        user.setPassword(password);
                        user.setGender(gender);

                        databaseReference.child(firebaseUser.getUid()).setValue(user);
                        Toast.makeText(getContext(), "Success", Toast.LENGTH_SHORT).show();

                        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(command2 -> {
                            if (command2.isSuccessful()) {
                                FirebaseUser firebaseUser2 = mAuth.getCurrentUser();
                                updateUI(firebaseUser2);
                            } else {
                                Toast.makeText(getContext(), "Failed", Toast.LENGTH_SHORT).show();
                            }
                        });
                    } else {
                        Toast.makeText(getContext(), "Wrong email format or password less than 6", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        signupFragmentBinding = SignUpPageBinding.inflate(inflater, container, false);
        return signupFragmentBinding.getRoot();
    }

    private void updateUI(FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Intent intent = new Intent(getActivity(), HomeActivity.class);
            startActivity(intent);
        }
    }
}
