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
        binding.ivMainContentPeristiwaBersejarah.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvMainContent1.getText().toString());
            bundle.putString("header_article",binding.ivMainContentPeristiwaBersejarah.getDrawable().getConstantState().toString());
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
        binding.lainnyaBeritaIkanCoelacanth.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvJudulLainnyaIkanCoelacanth.getText().toString());
            bundle.putString("header_article",binding.ivIkanCoelacanth.getDrawable().getConstantState().toString());
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
        binding.lainnyaBeritaJermanPortugal.setOnClickListener(view -> {
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
        binding.lainnyaBeritaWismaAtlet.setOnClickListener(view -> {
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
        binding.lainnyaBeritaRossi.setOnClickListener(view -> {
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

        });binding.lainnyaBeritaSeohyun.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvJudulLainnyaSeohyun.getText().toString());
            bundle.putString("header_article",binding.ivBeritaSoehyun.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.bookmark_content_2));
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
