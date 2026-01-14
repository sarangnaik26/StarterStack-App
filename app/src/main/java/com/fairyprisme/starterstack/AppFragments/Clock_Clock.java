package com.fairyprisme.starterstack.AppFragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fairyprisme.starterstack.R;
import java.util.Calendar;

public class Clock_Clock extends Fragment {
    private TextView Hour, Minute, Second;
    private Handler handler = new Handler();
    private Runnable runnable;

    public Clock_Clock() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_clock_clock, container, false);

        // Link TextViews
        Hour = view.findViewById(R.id.txtHour);
        Minute = view.findViewById(R.id.txtMin);
        Second = view.findViewById(R.id.txtSec);

        // Define the runnable that updates time every second
        runnable = new Runnable() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY); // 0-23
                int minute = calendar.get(Calendar.MINUTE);    // 0-59
                int second = calendar.get(Calendar.SECOND);    // 0-59

                // Format with leading zeros for digital clock look
                Hour.setText(String.format("%02d", hour));
                Minute.setText(String.format("%02d", minute));
                Second.setText(String.format("%02d", second));


                // Schedule again after 1000ms
                handler.postDelayed(this, 1000);
            }
        };

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // Start updating when fragment is visible
        handler.post(runnable);
    }

    @Override
    public void onPause() {
        super.onPause();
        // Stop updating when fragment is not visible
        handler.removeCallbacks(runnable);
    }
}