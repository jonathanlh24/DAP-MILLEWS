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
import com.dap.myapplication.databinding.CategoryTechnologyLogoffBinding;
import com.dap.myapplication.databinding.CategoryTravelLogoffBinding;
import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class CategoryTeknologiFragment extends Fragment {

    private static CategoryTeknologiFragment categoryTeknologiFragment;
    private CategoryTechnologyLogoffBinding binding;

    private CategoryTeknologiFragment(){

    }

    public static CategoryTeknologiFragment newInstance(){
        if (categoryTeknologiFragment == null){
            categoryTeknologiFragment = new CategoryTeknologiFragment();
        }
        return categoryTeknologiFragment;
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
        binding = CategoryTechnologyLogoffBinding.inflate(inflater,container, false);
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
        binding.tvGayaHidup.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategoryLifestyleFragment categoryLifestyleFragment = CategoryLifestyleFragment.newInstance();
            categoryLifestyleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categoryLifestyleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.ivMainContentTamagochi.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContentTamagochi.getText().toString());
            bundle.putString("header_article",binding.ivMainContentTamagochi.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleTamagochi));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_tamagochi));
            bundle.putString("txt_date",getResources().getString(R.string.date_tamagochi));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTeknologiFiturWAAntarPlatform.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainCategoryFiturWaAntarPlatform.getText().toString());
            bundle.putString("header_article",binding.ivTeknologiFiturWAAntarPlatform.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleCallnRingWA));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_fiturWA_antarPlatform));
            bundle.putString("txt_date",getResources().getString(R.string.date_fiturWA_antarPlatform));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTeknologiKecelakaanTesla.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvTeknologiTesla.getText().toString());
            bundle.putString("header_article",binding.ivTeknologiTesla.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleKecelakaanTesla));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_kecelakaanTesla));
            bundle.putString("txt_date",getResources().getString(R.string.date_kecelakaanTesla));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTeknologiCallAndRingWa.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainTimeCallAndRingWa.getText().toString());
            bundle.putString("header_article",binding.ivTeknologiCallAndRingWa.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleCallnRingWA));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_call_n_ring_WA));
            bundle.putString("txt_date",getResources().getString(R.string.date_call_n_ring_WA));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaTeknologiKuantum.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvTeknologiKuantum.getText().toString());
            bundle.putString("header_article",binding.ivTeknologiKunatum.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleKuantum));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_kuantum));
            bundle.putString("txt_date",getResources().getString(R.string.date_kuantum));
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
