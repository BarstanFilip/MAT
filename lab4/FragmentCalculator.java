package com.example.lab4android;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentCalculator extends Fragment {

    Button btnADD, btnDIV, btnSUB, btnMUL;
    EditText textEditNum1, textEditNum2;
    TextView textViewResults;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        // Initialize views
        textViewResults = view.findViewById(R.id.txtViewResult);
        textEditNum1 = view.findViewById(R.id.editTextNum1);
        textEditNum2 = view.findViewById(R.id.editTextNum2);
        btnADD = view.findViewById(R.id.btnADD);
        btnDIV = view.findViewById(R.id.btnDIV);
        btnSUB = view.findViewById(R.id.btnSUB);
        btnMUL = view.findViewById(R.id.btnMUL);

        // Set click listener for btnADD
        btnADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get numbers from EditText fields
                double num1 = Double.parseDouble(textEditNum1.getText().toString());
                double num2 = Double.parseDouble(textEditNum2.getText().toString());

                // Perform addition
                double result = num1 + num2;

                // Display result in TextView
                textViewResults.setText(String.valueOf(result));
            }
        });

        // Set click listener for btnSUB
        btnSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get numbers from EditText fields
                double num1 = Double.parseDouble(textEditNum1.getText().toString());
                double num2 = Double.parseDouble(textEditNum2.getText().toString());

                // Perform subtraction
                double result = num1 - num2;

                // Display result in TextView
                textViewResults.setText(String.valueOf(result));
            }
        });

        // Set click listener for btnDIV
        btnDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get numbers from EditText fields
                double num1 = Double.parseDouble(textEditNum1.getText().toString());
                double num2 = Double.parseDouble(textEditNum2.getText().toString());

                // Check for division by zero
                if (num2 == 0) {
                    Toast.makeText(getActivity(), "Nu se imparte la 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Perform division
                double result = num1 / num2;

                // Display result in TextView
                textViewResults.setText(String.valueOf(result));
            }
        });

        // Set click listener for btnMUL
        btnMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get numbers from EditText fields
                double num1 = Double.parseDouble(textEditNum1.getText().toString());
                double num2 = Double.parseDouble(textEditNum2.getText().toString());

                // Perform multiplication
                double result = num1 * num2;

                // Display result in TextView
                textViewResults.setText(String.valueOf(result));
            }
        });

        return view;
    }



    // Keep newInstance() method if it's needed for other purposes
    // Remove setContentView() method
}
