package com.dap.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.dap.myapplication.R;
import com.dap.myapplication.databinding.BookmarkBinding;

public class BookmarkFragment extends Fragment {

    private static BookmarkFragment bookmarkFragment;
    private BookmarkBinding binding;

    private BookmarkFragment(){

    }

    public static BookmarkFragment newInstance(){
        if (bookmarkFragment == null){
            bookmarkFragment = new BookmarkFragment();
        }
        return bookmarkFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = BookmarkBinding.inflate(inflater,container, false);
        binding.bookmarkArticle1.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvBookmarkContent1.getText().toString());
            bundle.putString("header_article",binding.ivBookmarkContent1.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiBookmark1));
            bundle.putString("txt_date", binding.tvBookmarkTime1.getText().toString());
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.bookmarkArticle2.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvBookmarkContent2.getText().toString());
            bundle.putString("header_article",binding.ivBookmarkContent2.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiBookmark2));
            bundle.putString("txt_date", binding.tvBookmarkTime2.getText().toString());
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.bookmarkArticle3.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvBookmarkContent3.getText().toString());
            bundle.putString("header_article",binding.ivBookmarkContent3.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiBookmark3));
            bundle.putString("txt_date", binding.tvBookmarkTime3.getText().toString());
            ArticleFragment articleFragment = ArticleFragment.newInstance();
            articleFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, articleFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.bookmarkArticle4.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("txt_judul", binding.tvBookmarkContent4.getText().toString());
            bundle.putString("header_article",binding.ivBookmarkContent4.getDrawable().getConstantState().toString());
            bundle.putString("txt_isi",getResources().getString(R.string.isiBookmark4));
            bundle.putString("txt_date", binding.tvBookmarkTime4.getText().toString());
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
