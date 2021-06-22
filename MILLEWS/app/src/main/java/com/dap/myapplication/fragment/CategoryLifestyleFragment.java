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
import com.dap.myapplication.databinding.CategoryGayahidupLogoffBinding;
import com.dap.myapplication.databinding.CategoryInternasionalLogoffBinding;
import com.dap.myapplication.databinding.CategoryOlahragaLogoffBinding;
import com.dap.myapplication.databinding.CategoryTechnologyLogoffBinding;
import com.dap.myapplication.databinding.CategoryTravelLogoffBinding;
import com.dap.myapplication.databinding.MainPageLogoffBinding;

public class CategoryLifestyleFragment extends Fragment {

    private static CategoryLifestyleFragment categoryLifestyleFragment;
    private CategoryGayahidupLogoffBinding binding;

    private CategoryLifestyleFragment(){

    }

    public static CategoryLifestyleFragment newInstance(){
        if (categoryLifestyleFragment == null){
            categoryLifestyleFragment = new CategoryLifestyleFragment();
        }
        return categoryLifestyleFragment;
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
        binding = CategoryGayahidupLogoffBinding.inflate(inflater,container, false);
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
        binding.ivMainContentYogaSaatPandemi.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContentYogaSaatPandemi.getText().toString());
            bundle.putString("header_article",binding.ivMainContentYogaSaatPandemi.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleYoga));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_yoga));
            bundle.putString("txt_date",getResources().getString(R.string.date_yoga));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaGayaHidupPasangRingSetelahSeranganJantung.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvGayaHidupPasangRingSetelahSeranganJantung.getText().toString());
            bundle.putString("header_article",binding.ivGayaHidupPasangRingSetelahSeranganJantung.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticlePasangRingSetelahSeranganJantung));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_pasangRing_setelah_serangan_jantung));
            bundle.putString("txt_date",getResources().getString(R.string.date_pasangRing_setelah_serangan_jantung));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaGayaHidupVitD.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvGayaHidupVitD.getText().toString());
            bundle.putString("header_article",binding.ivGayaHidupVitD.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleVitD));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_vitD));
            bundle.putString("txt_date",getResources().getString(R.string.date_vitD));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.beritaGayaHidupKencanPertama.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvGayaHidupKencanPertama.getText().toString());
            bundle.putString("header_article",binding.ivGayaHidupKencanPertama.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleKencanPertama));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_kencanPertama));
            bundle.putString("txt_date",getResources().getString(R.string.date_kencanPertama));
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
