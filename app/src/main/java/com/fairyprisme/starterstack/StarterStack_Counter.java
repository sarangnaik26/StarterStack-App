package com.fairyprisme.starterstack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StarterStack_Counter extends AppCompatActivity {
    int val = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starterstack_counter);

        //objs
        Button btnIncrement;
        Button btnDecrement;
        Button btnReset;
        TextView txtCounter;


//    linking
        btnIncrement = findViewById(R.id.add);
        btnDecrement = findViewById(R.id.subtract);
        btnReset = findViewById(R.id.restart);
        txtCounter = findViewById(R.id.counter);


        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val++;
                setCounterValue(val);
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val--;
                setCounterValue(val);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=0;
                setCounterValue(val);
            }
        });

    }
    private void setCounterValue(int value) {
        TextView txtCounter;
        txtCounter = findViewById(R.id.counter);
        txtCounter.setText(String.valueOf(value));
    }

}