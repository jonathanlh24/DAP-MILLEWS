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
import com.dap.myapplication.databinding.EditProfileBinding;
import com.dap.myapplication.databinding.MyprofileBinding;
import com.google.firebase.auth.FirebaseAuth;

public class EditGenderFragment extends Fragment {

    private static EditGenderFragment editGenderFragment;
    private EditGenderBinding binding;
    private FirebaseAuth mAuth;

    private EditGenderFragment(){

    }

    public static EditGenderFragment newInstance(){
        if (editGenderFragment == null){
            editGenderFragment = new EditGenderFragment();
        }
        return editGenderFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = EditGenderBinding.inflate(inflater,container, false);
        binding.btnSubmit.setOnClickListener(view ->{
            Bundle bundle = new Bundle();
            ProfileFragment profileFragment = ProfileFragment.newInstance();
            profileFragment.setArguments(bundle);

            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container, profileFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });
        return binding.getRoot();
    }
}
