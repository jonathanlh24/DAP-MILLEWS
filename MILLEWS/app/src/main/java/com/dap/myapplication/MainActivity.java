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


    }
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