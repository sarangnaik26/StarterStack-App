package com.fairyprisme.starterstack;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Counter App
        CardView cardCounter = findViewById(R.id.cardCounterApp);
        cardCounter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StarterStack_Counter.class);
            startActivity(intent);
        });

        //Simple Calculator App
        CardView simpleCalculator = findViewById(R.id.cardSimpleCalculator);
        simpleCalculator.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StarterStack_SimpleCalc.class);
            startActivity(intent);
        });

        //Tic Tac Toe App
        CardView ticTacToe = findViewById(R.id.cardTicTacToe);
        ticTacToe.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StarterStack_TicTacToe.class);
            startActivity(intent);
        });

        //Clcok App
        CardView Clock = findViewById(R.id.cardClock);
        Clock.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StarterStack_Clock.class);
            startActivity(intent);
        });

    }
}