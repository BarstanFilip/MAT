package com.example.lab56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnBack2 = findViewById(R.id.btnBack2);
        Button btnForward2 =findViewById(R.id.btnForward2);



        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnForward2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the forward activity here if you have one
            }
        });

        }

    }
