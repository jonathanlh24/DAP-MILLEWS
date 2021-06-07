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

public class BookmarkFragment extends Fragment {

    private static BookmarkFragment bookmarkFragment;
    private BookmarkBinding binding;

    private BookmarkFragment(){

    }

    public static BookmarkFragment newInstance(){
        if (bookmarkFragment == null){
            bookmarkFragment = new BookmarkFragment();
        }
        return bookmarkFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = BookmarkBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }
}
