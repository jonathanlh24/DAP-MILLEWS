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
import com.dap.myapplication.databinding.CategoryTravelLogoffBinding;
import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class CategoryTravelFragment extends Fragment {

    private static CategoryTravelFragment categoryTravelFragment;
    private CategoryTravelLogoffBinding binding;

    private CategoryTravelFragment(){

    }

    public static CategoryTravelFragment newInstance(){
        if (categoryTravelFragment == null){
            categoryTravelFragment = new CategoryTravelFragment();
        }
        return categoryTravelFragment;
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
        binding = CategoryTravelLogoffBinding.inflate(inflater,container, false);
        binding.btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), LoginActivity.class);
            startActivity(intent);
        });
        binding.tvHome.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            MainFragment mainFragment = MainFragment.newInstance();
            mainFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, mainFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.tvTravel.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategoryTravelFragment categoryTravelFragment = CategoryTravelFragment.newInstance();
            categoryTravelFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categoryTravelFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.tvInternational.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategoryInternationalFragment categoryInternationalFragment = CategoryInternationalFragment.newInstance();
            categoryInternationalFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categoryInternationalFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.tvSport.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategorySportFragment categorySportFragment = CategorySportFragment.newInstance();
            categorySportFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categorySportFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.tvTechonlogy.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategoryTeknologiFragment categoryTeknologiFragment = CategoryTeknologiFragment.newInstance();
            categoryTeknologiFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categoryTeknologiFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.tvGayaHidup3.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategoryLifestyleFragment categoryLifestyleFragment = CategoryLifestyleFragment.newInstance();
            categoryLifestyleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categoryLifestyleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.ivMainContent.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContent1.getText().toString());
            bundle.putString("header_article",binding.ivMainContent.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleWisataBelanda));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_belanda));
            bundle.putString("txt_date",getResources().getString(R.string.main_time_alt));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTravel1.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvTravelLain1.getText().toString());
            bundle.putString("header_article",binding.ivTravelMalang.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleWisataPantaiMalang));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_Malang));
            bundle.putString("txt_date",getResources().getString(R.string.date_malang));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTravelRinjani.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvTravelLain2.getText().toString());
            bundle.putString("header_article",binding.ivTravelRinjani.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleGunungRinjani));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_rinjani));
            bundle.putString("txt_date",getResources().getString(R.string.date_rinjani));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTravelMentawai.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvTravelLain3.getText().toString());
            bundle.putString("header_article",binding.ivTravelMentawai.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleSelancarMentawai));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_selancarMelawai));
            bundle.putString("txt_date",getResources().getString(R.string.date_selancarMelawai));
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
