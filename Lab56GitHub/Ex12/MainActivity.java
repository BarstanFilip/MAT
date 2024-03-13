package com.example.lab56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int currentActivityIndex = 0;
    private Class<?>[] activities = {MainActivity2.class, MainActivity3.class, MainActivity4.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBack = findViewById(R.id.btnBack);
        Button btnForward = findViewById(R.id.btnForward);
        Button btnI1 = findViewById(R.id.btnI1);
        Button btnI2 = findViewById(R.id.btnI2);
        Button btnI3 = findViewById(R.id.btnI3);

        btnI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity(MainActivity2.class);
            }
        });

        btnI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity(MainActivity3.class);
            }
        });

        btnI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity(MainActivity4.class);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentActivityIndex < activities.length - +1) {
                    currentActivityIndex++;
                    startNextActivity(activities[currentActivityIndex]);
                }
            }
        });
    }

    private void startNextActivity(Class<?> nextActivity) {
        Intent intent = new Intent(MainActivity.this, nextActivity);
        intent.putExtra("currentActivityIndex", currentActivityIndex);
        startActivity(intent);
    }
}
