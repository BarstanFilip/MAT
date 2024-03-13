package com.example.lab56chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText edtTxt1;
    private Button btnSendToChat2;
    private ChatAdapter adapter;
    private List<String> chatMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView1);
        edtTxt1 = findViewById(R.id.edtTxt1);
        btnSendToChat2 = findViewById(R.id.btnSendToChat2);

        chatMessages = new ArrayList<>();
        adapter = new ChatAdapter(chatMessages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Retrieve the message from intent extras
        String receivedMessage = getIntent().getStringExtra("message");
        if (receivedMessage != null) {
            addMessageToRecyclerView1(receivedMessage);
        }

        btnSendToChat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = edtTxt1.getText().toString().trim();
                if (!message.isEmpty()) {
                    // Pass the message as an extra to MainActivity2
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("message", message);
                    startActivity(intent);

                    edtTxt1.setText(""); // Clear the EditText after sending message
                }
            }
        });

        Button btnToChat2 = findViewById(R.id.btnToChat2);
        btnToChat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    // Method to add message to RecyclerView1 in MainActivity
    private void addMessageToRecyclerView1(String message) {
        chatMessages.add(message);
        adapter.notifyDataSetChanged(); // Notify adapter about the new message
    }
}
