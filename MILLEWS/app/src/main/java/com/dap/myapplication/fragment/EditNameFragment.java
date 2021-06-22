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
import com.dap.myapplication.databinding.EditEmailBinding;
import com.dap.myapplication.databinding.EditGenderBinding;
import com.dap.myapplication.databinding.EditNameBinding;
import com.dap.myapplication.databinding.EditProfileBinding;
import com.dap.myapplication.databinding.MyprofileBinding;
import com.google.firebase.auth.FirebaseAuth;

public class EditNameFragment extends Fragment {

    private static EditNameFragment editNameFragment;
    private EditNameBinding binding;
    private FirebaseAuth mAuth;

    private EditNameFragment(){

    }

    public static EditNameFragment newInstance(){
        if (editNameFragment == null){
            editNameFragment = new EditNameFragment();
        }
        return editNameFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = EditNameBinding.inflate(inflater,container, false);
        binding.btnSubmit.setOnClickListener(view ->{
            Bundle bundle = new Bundle();
            EditProfileFragment editProfileFragment = EditProfileFragment.newInstance();
            editProfileFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, editProfileFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        return binding.getRoot();
    }
}
