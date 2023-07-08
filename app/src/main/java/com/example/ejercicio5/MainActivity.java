package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejercicio5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public ActivityMainBinding binding;
    private AdapterWords adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adapter = new AdapterWords();
        binding.floatingButton.setOnClickListener(v -> {
            adapter.addData("Clicked");
        });


    }
}