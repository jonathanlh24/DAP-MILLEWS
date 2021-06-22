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
import com.dap.myapplication.databinding.CategoryOlahragaLogoffBinding;
import com.dap.myapplication.databinding.CategoryTechnologyLogoffBinding;
import com.dap.myapplication.databinding.CategoryTravelLogoffBinding;
import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class CategorySportFragment extends Fragment {

    private static CategorySportFragment categorySportFragment;
    private CategoryOlahragaLogoffBinding binding;

    private CategorySportFragment(){

    }

    public static CategorySportFragment newInstance(){
        if (categorySportFragment == null){
            categorySportFragment = new CategorySportFragment();
        }
        return categorySportFragment;
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
        binding = CategoryOlahragaLogoffBinding.inflate(inflater,container, false);
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
        binding.ivMainContentOlahraga.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContent1.getText().toString());
            bundle.putString("header_article",binding.ivMainContentOlahraga.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArtileItaliaEuro2020GroupA));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_Italia2020_groupA));
            bundle.putString("txt_date",getResources().getString(R.string.date_Italia2020_groupA));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaOlahragaBelgiaHarusMenangVsFinlandia.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvOlahragaBelgiaHarusMenang.getText().toString());
            bundle.putString("header_article",binding.ivOlahragaBegiaHarusMenang.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleBelgiaHarusMenangVSFinlandia));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_belgia_harus_menang_lawan_finlandia));
            bundle.putString("txt_date",getResources().getString(R.string.date_belgia_harus_menang_lawan_finlandia));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaOlahragaMaxVerstappen.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvOlahragaMaxVerstappern.getText().toString());
            bundle.putString("header_article",binding.ivOlahragaMaxVerstappen.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleMaxVerstappenF1));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_maxVerstappenF1));
            bundle.putString("txt_date",getResources().getString(R.string.date_maxVerstappenF1));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaOlahragaMarquez.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvOlahraganMarquezMenangisMenang.getText().toString());
            bundle.putString("header_article",binding.ivOlahragaMarquezMenangisMenang.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleMarcMarquez_menangis_menang));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_MarcMarquez_menangis_menang));
            bundle.putString("txt_date",getResources().getString(R.string.date_MarcMarquez_menangis_menang));
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
