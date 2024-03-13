package com.example.lab56;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btnGoogle = findViewById(R.id.btnGoogle);
        Button btnBack4 = findViewById(R.id.btnBack4);
        Button btnForward4 = findViewById(R.id.btnForward4);

        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent with the action ACTION_VIEW
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Set the data of the intent to the URL you want to open
                intent.setData(Uri.parse("https://www.google.com"));
                // Start the activity with the intent
                startActivity(intent);
            }
        });

        btnBack4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnForward4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
