package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Define buttons for the Tic Tac Toe grid
    private Button[][] buttons = new Button[3][3];

    // Track current player
    private boolean playerX = true;

    // TextView to display turn
    private TextView turnTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        buttons[0][0] = findViewById(R.id.a1);
        buttons[0][1] = findViewById(R.id.a2);
        buttons[0][2] = findViewById(R.id.a3);
        buttons[1][0] = findViewById(R.id.b1);
        buttons[1][1] = findViewById(R.id.b2);
        buttons[1][2] = findViewById(R.id.b3);
        buttons[2][0] = findViewById(R.id.c1);
        buttons[2][1] = findViewById(R.id.c2);
        buttons[2][2] = findViewById(R.id.c3);

        // Set click listeners for all buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setOnClickListener(this);
            }
        }

        // Initialize restart button
        Button restartBtn = findViewById(R.id.RestartBtn);
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartGame();
            }
        });

        // Initialize turn TextView
        turnTV = findViewById(R.id.turnTV);
        updateTurn();
    }

    @Override
    public void onClick(View v) {
        // Check if the clicked button is a Tic Tac Toe button
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v == buttons[i][j]) {
                    // Check if the button is empty
                    if (buttons[i][j].getText().toString().isEmpty()) {
                        // Set X or O depending on the current player
                        buttons[i][j].setText(playerX ? "X" : "O");
                        // Toggle player
                        playerX = !playerX;
                        // Update turn
                        updateTurn();
                        // Check for winner
                        checkWinner();
                    }
                    return;
                }
            }
        }
    }

    // Update turn TextView to show current player's turn
    private void updateTurn() {
        turnTV.setText(playerX ? "Turn: X" : "Turn: O");
    }

    // Check if there's a winner
    private void checkWinner() {
        // Check rows for a winner
        for (int i = 0; i < 3; i++) {
            if (!buttons[i][0].getText().toString().isEmpty() &&
                    buttons[i][0].getText().toString().equals(buttons[i][1].getText().toString()) &&
                    buttons[i][0].getText().toString().equals(buttons[i][2].getText().toString())) {
                // Highlight winning row
                highlightWinner(buttons[i][0], buttons[i][1], buttons[i][2]);
                return;
            }
        }

        // Check columns for a winner
        for (int i = 0; i < 3; i++) {
            if (!buttons[0][i].getText().toString().isEmpty() &&
                    buttons[0][i].getText().toString().equals(buttons[1][i].getText().toString()) &&
                    buttons[0][i].getText().toString().equals(buttons[2][i].getText().toString())) {
                // Highlight winning column
                highlightWinner(buttons[0][i], buttons[1][i], buttons[2][i]);
                return;
            }
        }

        // Check main diagonal for a winner
        if (!buttons[0][0].getText().toString().isEmpty() &&
                buttons[0][0].getText().toString().equals(buttons[1][1].getText().toString()) &&
                buttons[0][0].getText().toString().equals(buttons[2][2].getText().toString())) {
            // Highlight main diagonal
            highlightWinner(buttons[0][0], buttons[1][1], buttons[2][2]);
            return;
        }

        // Check secondary diagonal for a winner
        if (!buttons[0][2].getText().toString().isEmpty() &&
                buttons[0][2].getText().toString().equals(buttons[1][1].getText().toString()) &&
                buttons[0][2].getText().toString().equals(buttons[2][0].getText().toString())) {
            // Highlight secondary diagonal
            highlightWinner(buttons[0][2], buttons[1][1], buttons[2][0]);
            return;
        }

        // Check for a draw
        if (isBoardFull()) {
            turnTV.setText("It's a draw!");
        }
    }

    // Helper method to highlight the winning combination
    private void highlightWinner(Button button1, Button button2, Button button3) {
        // Change background color of winning buttons
        button1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        button2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        button3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));

        // Disable all buttons to prevent further moves
        disableAllButtons();
    }

    // Helper method to disable all buttons
    private void disableAllButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
    }

    // Restart the game
    private void restartGame() {
        // Clear the text of all buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }

        // Reset player to X
        playerX = true;

        // Update turn
        updateTurn();
    }

    // Helper method to check if the board is full (draw)
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().toString().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
}
