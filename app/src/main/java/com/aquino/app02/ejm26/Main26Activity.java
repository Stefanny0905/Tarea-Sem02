package com.aquino.app02.ejm26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.aquino.app02.R;

public class Main26Activity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView dateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);

        calendarView = (CalendarView) findViewById(R.id.calendarview);
        dateDisplay = (TextView) findViewById(R.id.date_display);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Date: " + i2 + " / " + (i1+1) + " / " + i);
                Toast.makeText(getApplicationContext(), "Selected Date:\n" + "Day = " + i2 + "\n" + "Month = " + (i1+1) + "\n" + "Year = " + i, Toast.LENGTH_LONG).show();
            }
        });
    }
}

