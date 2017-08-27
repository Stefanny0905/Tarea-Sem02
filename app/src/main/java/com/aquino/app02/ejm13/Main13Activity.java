package com.aquino.app02.ejm13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.aquino.app02.R;

import java.util.Calendar;

public class Main13Activity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView displayDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        displayDate = (TextView) findViewById(R.id.display_date);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        // current date
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        datePicker.init(year,month,day,  new DatePicker.OnDateChangedListener(){
            @Override
            public void onDateChanged(DatePicker view, int yy, int mm, int dd){
                displayDate.setText("Date: " + dd + "/" + (mm+1) + "/" + yy);
            }
        });

    }

    public void pick(View view){
        String currentDate = "Picked: " + datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getYear();
        displayDate.setText(currentDate);
    }

}
