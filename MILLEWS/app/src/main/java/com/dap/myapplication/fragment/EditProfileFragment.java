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

import com.dap.myapplication.MainActivity;
import com.dap.myapplication.R;
import com.dap.myapplication.databinding.EditProfileBinding;
import com.dap.myapplication.databinding.MyprofileBinding;
import com.google.firebase.auth.FirebaseAuth;

public class EditProfileFragment extends Fragment {

    private static EditProfileFragment editProfileFragment;
    private EditProfileBinding binding;
    private FirebaseAuth mAuth;

    private EditProfileFragment(){

    }

    public static EditProfileFragment newInstance(){
        if (editProfileFragment == null){
            editProfileFragment = new EditProfileFragment();
        }
        return editProfileFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = EditProfileBinding.inflate(inflater,container, false);
        binding.btnSave.setOnClickListener(view ->{
            Bundle bundle = new Bundle();
            ProfileFragment profileFragment = ProfileFragment.newInstance();
            profileFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, profileFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.etNameMyProfile.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            EditNameFragment editNameFragment = EditNameFragment.newInstance();
            editNameFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, editNameFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.etEditEmail.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            EditEmailFragment editEmailFragment = EditEmailFragment.newInstance();
            editEmailFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, editEmailFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        binding.etGender.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            EditGenderFragment editGenderFragment = EditGenderFragment.newInstance();
            editGenderFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, editGenderFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        /*binding.chgPassword.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            CategoryInternationalFragment categoryInternationalFragment = CategoryInternationalFragment.newInstance();
            categoryInternationalFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, categoryInternationalFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });*/
        return binding.getRoot();
    }
}
