package com.dap.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dap.myapplication.databinding.MyprofileBinding;

public class ProfileFragment extends Fragment {

    private static ProfileFragment profileFragment;
    private MyprofileBinding binding;

    private ProfileFragment(){

    }

    public static ProfileFragment newInstance(){
        if (profileFragment == null){
            profileFragment = new ProfileFragment();
        }
        return profileFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MyprofileBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }
}
