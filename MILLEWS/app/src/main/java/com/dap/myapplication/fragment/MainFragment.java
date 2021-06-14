package com.dap.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.dap.myapplication.LoginActivity;
import com.dap.myapplication.R;
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

    @Override
    public void onStart() {
        super.onStart();
        if(getArguments()!=null){
            binding.tvProfile.setText("Welcome, "+getArguments().getString("key"));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = MainPageLogoffBinding.inflate(inflater,container, false);
        binding.btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
        });

        binding.ivMainContent.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContent1.getText().toString());
            bundle.putString("header_article",binding.ivMainContent.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleRossi));
            bundle.putString("txt_date",getResources().getString(R.string.main_time_alt));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.utamaMain1.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvUtama1.getText().toString());
            bundle.putString("header_article",binding.ivUtama1.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleMie));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.utamaMain2.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvUtama2.getText().toString());
            bundle.putString("header_article",binding.ivUtama2.getDrawable().getConstantState().toString());
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
