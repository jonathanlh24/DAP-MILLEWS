package com.dap.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.dap.myapplication.databinding.ActivityHomeBinding;
import com.dap.myapplication.fragment.BookmarkFragment;
import com.dap.myapplication.fragment.MainFragment;
import com.dap.myapplication.fragment.ProfileFragment;
import com.dap.myapplication.fragment.SearchFragment;
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

        fragmentManager.beginTransaction().add(binding.container.getId(), MainFragment.newInstance()).commit();

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.btn_home:
                        fragment = MainFragment.newInstance();
                        Bundle bundle = new Bundle();
                        bundle.putString("jonathan", "key");
                        fragment.setArguments(bundle);
                        break;
                    case R.id.btn_search:
                        fragment = SearchFragment.newInstance();
                        break;
                    case R.id.btn_bookmark:
                        fragment = BookmarkFragment.newInstance();
                        break;
                    case R.id.btn_profile:
                        fragment = ProfileFragment.newInstance();
                        break;
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