package com.example.heels;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    Button logout;

    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        logout = view.findViewById(R.id.logout);

        preferences = requireActivity().getSharedPreferences(
                "My Prefes",
                Context.MODE_PRIVATE
        );

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = preferences.edit();

                editor.putBoolean("isLoggedIn", false);
                editor.apply();

                Intent intent = new Intent(requireActivity(), LogIn.class);
                startActivity(intent);

                requireActivity().finish();
            }
        });
        return view;
    }
}
