package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag,container,false);
        Button jobsBooks = view.findViewById(R.id.button);
        Button gatesBooks = view.findViewById(R.id.button2);
        gatesBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gatesLib = new Intent(getActivity(),quotesORbooks_bill.class);
                startActivity(gatesLib);
            }
        });

        jobsBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jobsLib = new Intent(getActivity(),jobsPage.class);
                startActivity(jobsLib);
            }
        });
        return view;
    }

}
