package com.example.lab4android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCh1, btnCh2, btnCh3, btnCh4, btnCh5, btnAdd, btnDiv, btnMul, btnSub;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = findViewById(R.id.btnADD);
        btnCh1 = findViewById(R.id.btnCh1);
        btnCh2 = findViewById(R.id.btnCh2);
        btnCh3=findViewById(R.id.btnCh3);
        btnCh4 = findViewById(R.id.btnCh4);
        btnCh5 = findViewById(R.id.btnCh5);

        btnCh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentCh1());
            }
        });

        btnCh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentCh2());
            }
        });

        btnCh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentCh3());

            }
        });
        btnCh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentCh4());

            }
        });

        btnCh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new FragmentCalculator());

            }
        });

    }
        private void replaceFragment (Fragment fragment){

         FragmentManager fragmentManager = getSupportFragmentManager();
         FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.frameLayout, fragment);
         fragmentTransaction.commit();
        }
        }


