package com.fairyprisme.starterstack;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Objects;

public class StarterStack_TicTacToe extends AppCompatActivity {
    char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    CardView card1, card2, card3, card4, card5, card6, card7, card8, card9;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    TextView txtXScore, txtOScore;
    boolean statuscard1 = true; boolean statuscard2 = true; boolean statuscard3 = true; boolean statuscard4 = true; boolean statuscard5 = true; boolean statuscard6 = true; boolean statuscard7 = true;boolean statuscard8 = true; boolean statuscard9 = true;

    String User = "x";

    int PlayerXScore = 0;
    int PlayerOScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starterstack_tictactoe);

        // Link CardViews
        card1 = findViewById(R.id.cardAA);
        card2 = findViewById(R.id.cardAB);
        card3 = findViewById(R.id.cardAC);
        card4 = findViewById(R.id.cardBA);
        card5 = findViewById(R.id.cardBB);
        card6 = findViewById(R.id.cardBC);
        card7 = findViewById(R.id.cardCA);
        card8 = findViewById(R.id.cardCB);
        card9 = findViewById(R.id.cardCC);

        // Link ImageViews
        img1 = findViewById(R.id.imgAA);
        img2 = findViewById(R.id.imgAB);
        img3 = findViewById(R.id.imgAC);
        img4 = findViewById(R.id.imgBA);
        img5 = findViewById(R.id.imgBB);
        img6 = findViewById(R.id.imgBC);
        img7 = findViewById(R.id.imgCA);
        img8 = findViewById(R.id.imgCB);
        img9 = findViewById(R.id.imgCC);

        // Link TextView
        txtXScore = findViewById(R.id.txtXScore);
        txtOScore = findViewById(R.id.txtOScore);


        // Set click listeners
        card1.setOnClickListener(v -> onCard1Click());
        card2.setOnClickListener(v -> onCard2Click());
        card3.setOnClickListener(v -> onCard3Click());
        card4.setOnClickListener(v -> onCard4Click());
        card5.setOnClickListener(v -> onCard5Click());
        card6.setOnClickListener(v -> onCard6Click());
        card7.setOnClickListener(v -> onCard7Click());
        card8.setOnClickListener(v -> onCard8Click());
        card9.setOnClickListener(v -> onCard9Click());
    }

    private void onCard1Click() {
        if (statuscard1) {
            img1.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img1.setImageResource(R.drawable.img_src_cross);
                board[0][0] = 'x';
                statuscard1 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img1.setImageResource(R.drawable.img_src_circle);
                board[0][0] = 'o';
                statuscard1 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard2Click() {
        if (statuscard2) {
            img2.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img2.setImageResource(R.drawable.img_src_cross);
                board[0][1] = 'x';
                statuscard2 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img2.setImageResource(R.drawable.img_src_circle);
                board[0][1] = 'o';
                statuscard2 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard3Click() {
        if (statuscard3) {
            img3.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img3.setImageResource(R.drawable.img_src_cross);
                board[0][2] = 'x';
                statuscard3 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img3.setImageResource(R.drawable.img_src_circle);
                board[0][2] = 'o';
                statuscard3 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard4Click() {
        if (statuscard4) {
            img4.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img4.setImageResource(R.drawable.img_src_cross);
                board[1][0] = 'x';
                statuscard4 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img4.setImageResource(R.drawable.img_src_circle);
                board[1][0] = 'o';
                statuscard4 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard5Click() {
        if (statuscard5) {
            img5.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img5.setImageResource(R.drawable.img_src_cross);
                board[1][1] = 'x';
                statuscard5 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img5.setImageResource(R.drawable.img_src_circle);
                board[1][1] = 'o';
                statuscard5 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard6Click() {
        if (statuscard6) {
            img6.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img6.setImageResource(R.drawable.img_src_cross);
                board[1][2] = 'x';
                statuscard6 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img6.setImageResource(R.drawable.img_src_circle);
                board[1][2] = 'o';
                statuscard6 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard7Click() {
        if (statuscard7) {
            img7.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img7.setImageResource(R.drawable.img_src_cross);
                board[2][0] = 'x';
                statuscard7 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img7.setImageResource(R.drawable.img_src_circle);
                board[2][0] = 'o';
                statuscard7 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard8Click() {
        if (statuscard8) {
            img8.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img8.setImageResource(R.drawable.img_src_cross);
                board[2][1] = 'x';
                statuscard8 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img8.setImageResource(R.drawable.img_src_circle);
                board[2][1] = 'o';
                statuscard8 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    private void onCard9Click() {
        if (statuscard9) {
            img9.setVisibility(View.VISIBLE);
            if (Objects.equals(User, "x")) {
                img9.setImageResource(R.drawable.img_src_cross);
                board[2][2] = 'x';
                statuscard9 = false;
                User = "o";
            } else if (Objects.equals(User, "o")) {
                img9.setImageResource(R.drawable.img_src_circle);
                board[2][2] = 'o';
                statuscard9 = false;
                User = "x";
            }
            char c = checkWinner();
            if(c == 'x'){
                PlayerXScore++;
                txtXScore.setText(String.valueOf(PlayerXScore));
                clearBoard();
            } else if (c == 'o') {
                PlayerOScore++;
                txtOScore.setText(String.valueOf(PlayerOScore));
                clearBoard();
            }
            if (isDraw()) {
                clearBoard();
            }
        }
    }

    // Check if the board is full (draw condition)
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // Still empty cells → not a draw
                }
            }
        }
        return true; // No empty cells → draw
    }

    // Check if any player has won
    public char checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0]; // Winner found in row
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i]; // Winner found in column
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0]; // Winner found in main diagonal
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2]; // Winner found in anti-diagonal
        }

        return '-'; // No winner yet
    }

    // Function to clear the board (reset all cells to '-')
    public void clearBoard() {

        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        img5.setVisibility(View.INVISIBLE);
        img6.setVisibility(View.INVISIBLE);
        img7.setVisibility(View.INVISIBLE);
        img8.setVisibility(View.INVISIBLE);
        img9.setVisibility(View.INVISIBLE);

        statuscard1 = true;
        statuscard2 = true;
        statuscard3 = true;
        statuscard4 = true;
        statuscard5 = true;
        statuscard6 = true;
        statuscard7 = true;
        statuscard8 = true;
        statuscard9 = true;



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
}