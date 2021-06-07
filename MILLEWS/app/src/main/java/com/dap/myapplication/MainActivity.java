package com.dap.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class  MainActivity extends AppCompatActivity {

    private MainPageLogoffBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding =  MainPageLogoffBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }


}