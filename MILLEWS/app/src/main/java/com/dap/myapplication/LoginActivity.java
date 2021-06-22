package com.dap.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;


import com.dap.myapplication.databinding.LoginFragmentBinding;
import com.dap.myapplication.fragment.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    private LoginFragmentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = LoginFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("key", "jonathan");

            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
        binding.tvSignup.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });
    }

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        ActivityLoginBinding binding = ActivityLoginBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(binding.loginContainer.getId(), LoginFragment.newInstance());
//        fragmentTransaction.commit();
//    }

    @Override
    public void onBackPressed() {
        int count = getSupportFragmentManager().getBackStackEntryCount();

        if(count == 0){
            super.onBackPressed();
        }else{
            getSupportFragmentManager().popBackStackImmediate();
        }
    }
}