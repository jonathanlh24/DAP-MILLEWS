package com.dap.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.dap.myapplication.R;
import com.dap.myapplication.databinding.ForgotPasswordFragmentBinding;
import com.dap.myapplication.entity.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ForgotPasswordFragment extends Fragment {

    private ForgotPasswordFragmentBinding forgotPasswordFragmentBinding;
    private static ForgotPasswordFragment forgotPasswordFragment;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    private ForgotPasswordFragment() {

    }

    public static ForgotPasswordFragment newInstance() {
        if (forgotPasswordFragment == null) {
            forgotPasswordFragment = new ForgotPasswordFragment();
        }
        return forgotPasswordFragment;
    }

    @Override
    public void onStart() {
        super.onStart();
        forgotPasswordFragmentBinding.tvEmailForgotPassword.setText("");
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("users");
        forgotPasswordFragmentBinding.btnToLogin.setOnClickListener(v -> {
            if (!forgotPasswordFragmentBinding.tvEmailForgotPassword.getText().toString().trim().equals("")) {
                databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                            if (dataSnapshot.child("email").getValue(String.class).equals(forgotPasswordFragmentBinding.tvEmailForgotPassword.getText().toString())) {
                                Bundle bundle = new Bundle();
                                bundle.putString(User.USER_EMAIL, forgotPasswordFragmentBinding.tvEmailForgotPassword.getText().toString().trim());
                                CheckEmailFragment checkEmailFragment = CheckEmailFragment.newInstance();
                                checkEmailFragment.setArguments(bundle);

                                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                                transaction.replace(R.id.loginContainer, checkEmailFragment);
                                transaction.commit();
                                break;
                            } else {
                                Toast.makeText(getContext(), "Email not found", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            } else {
                Toast.makeText(getContext(), "Please fill all field", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        forgotPasswordFragmentBinding = ForgotPasswordFragmentBinding.inflate(inflater, container, false);
        return forgotPasswordFragmentBinding.getRoot();
    }
}
