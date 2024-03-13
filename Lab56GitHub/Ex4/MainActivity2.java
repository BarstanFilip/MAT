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

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditText edtTxt2;
    private Button btnSendToChat1;
    private ChatAdapter adapter;
    private List<String> chatMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.RecyclerView2);
        edtTxt2 = findViewById(R.id.edtTxt2);
        btnSendToChat1 = findViewById(R.id.btnSendToChat1);

        chatMessages = new ArrayList<>();
        adapter = new ChatAdapter(chatMessages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Retrieve the message from intent extras
        String receivedMessage = getIntent().getStringExtra("message");
        if (receivedMessage != null) {
            addMessageToRecyclerView2(receivedMessage);
        }

        btnSendToChat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = edtTxt2.getText().toString().trim();
                if (!message.isEmpty()) {
                    // Pass the message as an extra to MainActivity
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    intent.putExtra("message", message);
                    startActivity(intent);

                    edtTxt2.setText(""); // Clear the EditText after sending message
                }
            }
        });

        Button btnToChat1 = findViewById(R.id.btnToChat1);
        btnToChat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // Method to add message to RecyclerView2 in MainActivity2
    private void addMessageToRecyclerView2(String message) {
        chatMessages.add(message);
        adapter.notifyDataSetChanged(); // Notify adapter about the new message
    }
}
