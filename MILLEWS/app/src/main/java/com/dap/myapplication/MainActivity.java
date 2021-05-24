package com.dap.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class MainActivity extends AppCompatActivity {

    private MainPageLogoffBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding =  MainPageLogoffBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.btnLogin.setOnClickListener(view -> {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    });

    binding.ivMainContent.setOnClickListener(view -> {
        Intent intent = new Intent(this,ArticleActivity.class);
        startActivity(intent);
        finish();
    });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle bundle =  getIntent().getExtras();
        if(bundle!=null && !bundle.isEmpty()){
            binding.tvProfile.setText("Welcome, "+bundle.getString("key"));
        }
    }
}