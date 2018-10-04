package com.example.asus.mydatepicking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;


public class TimePickerActivity extends AppCompatActivity {
    TextView timepickertv;
    TimePicker timepicker;
    static int hour, minute,a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timepicker = (TimePicker) findViewById(R.id.timepicker_tp);
        timepickertv = (TextView) findViewById(R.id.timepicker_tv);


        final Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);
        a=c.get(Calendar.AM_PM);

        timepickertv.setText(hour+":"+minute+" "+a);

        timepicker.setCurrentHour(hour);
        timepicker.setCurrentMinute(minute);

        TimePicker.OnTimeChangedListener onTimeChangedListener = new TimePicker.OnTimeChangedListener(){

            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getApplicationContext(),
                        "onTimeChanged", Toast.LENGTH_SHORT).show();
                hour=timepicker.getCurrentHour();
                minute = timepicker.getCurrentMinute();
                timepickertv.setText(hour+":"+minute);
            }
        };

        timepicker.setOnTimeChangedListener(onTimeChangedListener);
    }


}
