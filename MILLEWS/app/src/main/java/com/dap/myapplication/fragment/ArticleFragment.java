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
            binding.txtBeritaTag.setText(getArguments().getString("txt_beritaTag"));
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
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.peristiwa_bersejarah).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.peristiwa_bersejarah));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.ikan_coelacanth).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.ikan_coelacanth));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.jerman_portugal).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.jerman_portugal));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.wisma_atlet).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.wisma_atlet));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.belanda).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.belanda));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.malang).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.malang));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.mentawai).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.mentawai));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.rinjani).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.rinjani));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.nahkoda_italia).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.nahkoda_italia));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.unesco).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.unesco));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.covid_brazil).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.covid_brazil));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.as_kritik_pemilu_iran).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.as_kritik_pemilu_iran));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.pemungutansuara_iran).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.pemungutansuara_iran));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.italia_euro2020).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.italia_euro2020));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.belgia_wajib_menang_vs_finlandia).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.belgia_wajib_menang_vs_finlandia));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.max_verstappen_menang_dramatis).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.max_verstappen_menang_dramatis));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.marquez_menangis_menang).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.marquez_menangis_menang));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.kdb).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.kdb));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.tamagochi).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.tamagochi));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.fitur_chat_wa_antar_platform).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.fitur_chat_wa_antar_platform));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.tesla).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.tesla));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.calling_and_ringing_wa).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.calling_and_ringing_wa));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.teknologi_kuantum).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.teknologi_kuantum));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.yoga_saat_pandemi).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.yoga_saat_pandemi));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.pasang_ring_stlh_serangan_jantung).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.pasang_ring_stlh_serangan_jantung));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.vit_d).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.vit_d));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.kencan_pertama).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.kencan_pertama));
            }
            else if (getArguments().getString("header_article").equals(getResources().getDrawable(R.drawable.alternatif_micin).getConstantState().toString())){
                binding.headerArticle.setImageDrawable(getResources().getDrawable(R.drawable.alternatif_micin));
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
