package com.dap.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CategoryTravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_travel_logoff);
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