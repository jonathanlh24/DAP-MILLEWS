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
        binding.ivMainContent.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContent1.getText().toString());
            bundle.putString("header_article",binding.ivMainContent.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticlePenemuanBersejarahDunia));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_peristiwa_bersejarah));
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
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_mie));
            bundle.putString("txt_date",getResources().getString(R.string.date_mie));
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
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_dewaKipas));
            bundle.putString("txt_date",getResources().getString(R.string.date_dewaKipas));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.utamaMainEmas.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvUtamaEmas.getText().toString());
            bundle.putString("header_article",binding.ivUtamaEmas.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArtikelEmasMaluku));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_emasMaluku));
            bundle.putString("txt_date",getResources().getString(R.string.date_emasMaluku));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.LLBeritaIkanCoelacanth.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvJudulLainnyaIkanCoelacanth.getText().toString());
            bundle.putString("header_article",binding.ivIkancoelacanth.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleIkanCoelacanth));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_ikanCoelacanth));
            bundle.putString("txt_date",getResources().getString(R.string.date_ikanCoelacanth));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.LLBeritaJermanPortugal.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvJudulLainnyaJermanPortugal.getText().toString());
            bundle.putString("header_article",binding.ivBeritaJermanPortugal.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleJermanVSPortugal));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_JermanVSPortugal));
            bundle.putString("txt_date",getResources().getString(R.string.date_JermanVSPortugal));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.LLBeritaWismaAtlet.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvJudulLainnyaWismaAtlet.getText().toString());
            bundle.putString("header_article",binding.ivBeritaWismaAtlet.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleGemerlapLampuWismaAtlet));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_gemerlapWismaAtlet));
            bundle.putString("txt_date",getResources().getString(R.string.date_gemerlapWismaAtlet));

            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.LLBeritaRossi.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvJudulLainnyaRossi.getText().toString());
            bundle.putString("header_article",binding.ivBeritaRossi.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiArticleRossi));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_rossi));
            bundle.putString("txt_date",getResources().getString(R.string.date_rossi));
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        });binding.LLBeritaSeohyun.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvBookmarkContent1.getText().toString());
            bundle.putString("header_article",binding.ivBookmarkContent1.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiBookmark1));
            bundle.putString("txt_beritaTag",getResources().getString(R.string.beritatag_seohyun));
            bundle.putString("txt_date",getResources().getString(R.string.date_seohyun));
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
