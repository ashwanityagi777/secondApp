package com.example.secondapp;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class HomeFragment extends Fragment {

    AppCompatSpinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        spinner=view.findViewById(R.id.spinner);

        String[] country = {"India","USA","China","Japan","Russia"};
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(getContext(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,country);

        spinner.setAdapter(arrayAdapter);

        return view;
    }
}

