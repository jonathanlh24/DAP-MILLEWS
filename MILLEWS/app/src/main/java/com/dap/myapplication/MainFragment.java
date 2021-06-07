package com.dap.myapplication;

import android.content.Intent;
import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class MainFragment extends Fragment {

    private static MainFragment mainFragment;
    private MainPageLogoffBinding binding;

    private MainFragment(){

    }

    public static MainFragment newInstance(){
        if (mainFragment == null){
            mainFragment = new MainFragment();
        }
        return mainFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MainPageLogoffBinding.inflate(inflater,container, false);
        binding.btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(),LoginActivity.class);
            startActivity(intent);
        });

        binding.ivMainContent.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(),ArticleActivity.class);
            startActivity(intent);
        });
        return binding.getRoot();
    }
}
