package com.example.asus.mydatepicking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;


public class CalendarViewActivity extends AppCompatActivity {
CalendarView calendarview;
TextView calendarview_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);

        calendarview_tv = (TextView) findViewById(R.id.calendarview_tv);
        calendarview = (CalendarView) findViewById(R.id.calendarview_cv);

        calendarview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {

                Toast.makeText(getBaseContext(), "Selected Date is\n\n" + dayOfMonth + " : " + month + " : " + year, Toast.LENGTH_LONG).show();
                calendarview_tv.setText(dayOfMonth+"/"+month+"/"+year);
            }
        });
    }

}
