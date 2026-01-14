package com.fairyprisme.starterstack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.fairyprisme.starterstack.AppFragments.Clock_Clock;
import com.fairyprisme.starterstack.AppFragments.Clock_Stopwatch;


public class StarterStack_Clock extends AppCompatActivity {

    Button btnOpenClock, btnOpenStopWatch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starterstack_clock);

        //Link Button
        btnOpenClock = findViewById(R.id.btnSwitchClock);
        btnOpenStopWatch = findViewById(R.id.btnSwitchStopwatch);

        btnOpenClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new Clock_Clock());
            }
        });
        btnOpenStopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment(new Clock_Stopwatch());
            }
        });


    }
    public void openFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragMain, fragment);
        fragmentTransaction.addToBackStack(null); // optional, allows back navigation
        fragmentTransaction.commit();
    }

}