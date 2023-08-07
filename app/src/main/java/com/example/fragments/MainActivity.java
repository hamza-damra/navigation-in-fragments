package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_frist, button_second, button_third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_frist = findViewById(R.id.button_first);
        button_second = findViewById(R.id.button_second);
        button_third = findViewById(R.id.button_third);

        button_frist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.first_fragment);
                if(fragment != null)
                {
                    getSupportFragmentManager().beginTransaction().remove(fragment);
                    getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainerView,new FirstFragment());
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, FirstFragment.newInstance("first fragment", Color.RED)).commit();
            }
        });

        button_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, SecondFragment.newInstance("second fragment", Color.BLUE)).commit();

            }
        });

        button_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, ThirdFragment.newInstance("third fragment", Color.BLUE)).commit();

            }
        });



    }
}