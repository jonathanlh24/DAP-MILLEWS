package com.dap.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dap.myapplication.R;
import com.dap.myapplication.databinding.ArticleBinding;

public class ArticleFragment extends Fragment {

    private static ArticleFragment articleFragment;
    private ArticleBinding binding;

    private ArticleFragment(){

    }

    public static ArticleFragment newInstance(){
        if (articleFragment == null){
            articleFragment = new ArticleFragment();
        }
        return articleFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        if(getArguments()!=null){
            binding.txtJudul.setText(getArguments().getString("txt_judul"));
            binding.txtIsi.setText(getArguments().getString("txt_isi"));
            binding.txtDate.setText(getArguments().getString("txt_date"));
            if(getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.mie).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.mie));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.dewa).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.dewa));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.bookmark1).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.bookmark1));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.bookmark2).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.bookmark2));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.bookmark3).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.bookmark3));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.bookmark4).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.bookmark4));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.emas).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.emas));
            }
            else{
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.rossi_));
            }
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = ArticleBinding.inflate(inflater,container, false);

        return binding.getRoot();
    }
}
