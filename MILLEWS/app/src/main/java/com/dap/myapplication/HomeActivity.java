package com.dap.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.dap.myapplication.databinding.ActivityHomeBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(binding.container.getId(), MainFragment.newInstance()).commit();

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btn_home:
                        fragment = MainFragment.newInstance();
                        break;
//                    case R.id.btn_search:
//                        fragment = SavedFragment.newInstance();
//                        break;
//                    case R.id.btn_bookmark:
//                        fragment = ProfileFragment.newInstance();
//                        break;
//                    case R.id.btn_profile:
//                        fragment = HomeFragment.newInstance();
//                        break;
                    default:
                        fragment = MainFragment.newInstance();
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(binding.container.getId(), fragment).commit();
                return true;
            }
        });
    }
}