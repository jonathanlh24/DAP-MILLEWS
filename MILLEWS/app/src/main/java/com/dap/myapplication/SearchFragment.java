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
import androidx.fragment.app.FragmentTransaction;

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
        binding.searchArticle1.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvRecommend1.getText().toString());
            bundle.putString("header_article",binding.ivRecommend1.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleMie));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.searchArticle2.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvRecommend2.getText().toString());
            bundle.putString("header_article",binding.ivRecommend2.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleDewa));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        return binding.getRoot();
    }
}
