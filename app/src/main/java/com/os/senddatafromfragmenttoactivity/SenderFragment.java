package com.os.senddatafromfragmenttoactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.os.senddatafromfragmenttoactivity.databinding.FragmentSenderBinding;

public class SenderFragment extends Fragment {

    FragmentSenderBinding binding;
    View view;
    public SenderFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSenderBinding.inflate(inflater,container, false);
        view = binding.getRoot();
        binding.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = binding.etName.getText().toString().trim();
                String userLastName = binding.etLastName.getText().toString().trim();

                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.takeData(userName, userLastName);
            }
        });


        return view;
    }
}