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

import com.dap.myapplication.databinding.BookmarkBinding;
import com.dap.myapplication.databinding.MainPageLogoffBinding;
import com.dap.myapplication.databinding.MyprofileBinding;
import com.dap.myapplication.databinding.SearchUnfillOffBinding;

public class SearchFragment extends Fragment {

    private static SearchFragment searchFragment;
    private SearchUnfillOffBinding binding;

    private SearchFragment(){

    }

    public static SearchFragment newInstance(){
        if (searchFragment == null){
            searchFragment = new SearchFragment();
        }
        return searchFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = SearchUnfillOffBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }
}
