package com.example.customtimepickerudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePicker timePicker = findViewById(R.id.time);
        int hr = timePicker.getCurrentHour();
        int min = timePicker.getCurrentMinute();

        Toast.makeText(this, hr + " : " + min, Toast.LENGTH_LONG).show();

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                TextView textView = findViewById(R.id.text);
                textView.setText(hourOfDay + " : " + minute);
            }
        });
    }
}