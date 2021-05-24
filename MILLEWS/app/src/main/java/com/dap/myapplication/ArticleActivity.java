package com.dap.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.dap.myapplication.databinding.ArticleBinding;

public class ArticleActivity extends AppCompatActivity {

    private ArticleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ArticleBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("key","jonathan");
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);

        });
    }
}