package com.example.dynamicfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.dynamicfragment.databinding.ActivityMainBinding;
import com.example.dynamicfragment.databinding.FragmentQuestionBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);

        binding.killApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

//wartotle