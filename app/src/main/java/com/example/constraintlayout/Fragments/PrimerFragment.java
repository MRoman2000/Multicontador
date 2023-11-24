package com.example.constraintlayout.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.constraintlayout.R;
import com.example.constraintlayout.databinding.FragmentPrimerBinding;


public class PrimerFragment extends Fragment {
    int contador1, contador2, contador3, contador4, contador5;
    private FragmentPrimerBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPrimerBinding.inflate(inflater, container, false);

        View view = binding.getRoot();
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contador5 = 0;
                binding.textView1.setText(String.valueOf(contador1));
                binding.textView2.setText(String.valueOf(contador2));
                binding.textView3.setText(String.valueOf(contador3));
                binding.textView4.setText(String.valueOf(contador4));
               binding.textView5.setText(String.valueOf(contador5));

            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador2++;
               binding.textView2.setText(String.valueOf(contador2));

                int suma = contador2 + contador3 + contador4 + contador5;
                binding.textView1.setText(String.valueOf(suma));

            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador3++;
                binding.textView3.setText(String.valueOf(contador3));

                int suma = contador2 + contador3 + contador4 + contador5;
               binding.textView1.setText(String.valueOf(suma));

            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador4++;
                binding.textView4.setText(String.valueOf(contador4));

                int suma = contador2 + contador3 + contador4 + contador5 ;
                binding.textView1.setText(String.valueOf(suma));

            }
        });
       binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador5++;
               binding.textView5.setText(String.valueOf(contador5));

                int suma = contador2 + contador3 + contador4 + contador5;
               binding.textView1.setText(String.valueOf(suma));

            }
        });
       binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2 = 0;

               binding.textView2.setText(String.valueOf(contador2));
                int suma = contador1 + contador3 + contador4 + contador5 - contador2;
                binding.textView1.setText(String.valueOf(suma));
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contador3 = 0;
                binding.textView3.setText(String.valueOf(contador3));
                int suma = contador1 + contador2 + contador4 + contador5 - contador3;
                binding.textView1.setText(String.valueOf(suma));
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4 = 0;

                binding.textView4.setText(String.valueOf(contador4));
                int suma = contador1 + contador2 + contador3 + contador5 - contador4;
                binding.textView1.setText(String.valueOf(suma));
            }
        });
       binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador5 = 0;

                binding.textView5.setText(String.valueOf(contador5));
                int suma = contador1 + contador2 + contador3 + contador4 - contador5;
               binding.textView1.setText(String.valueOf(suma));
            }
        });


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}