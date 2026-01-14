package com.fairyprisme.starterstack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StarterStack_SimpleCalc extends AppCompatActivity {
    // Declare UI elements
    EditText input1, input2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starterstack_simplecalc);

        // Initialize objects
        input1 = findViewById(R.id.inpNum1);
        input2 = findViewById(R.id.inpNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        txtResult = findViewById(R.id.txtResult);

        // Set onClick listeners
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                float ans = num1 + num2;
                txtResult.setText(String.valueOf(ans));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                float ans = num1 - num2;
                txtResult.setText(String.valueOf(ans));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                float ans = num1 * num2;
                txtResult.setText(String.valueOf(ans));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(input1.getText().toString());
                float num2 = Float.parseFloat(input2.getText().toString());
                if(num2 != 0){
                    float ans = num1 / num2;
                    txtResult.setText(String.valueOf(ans));
                }
                else{
                    txtResult.setText("Can't Devide By 0");
                }
            }
        });

    }
}