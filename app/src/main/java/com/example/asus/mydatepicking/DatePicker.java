package com.example.asus.mydatepicking;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;

public class DatePicker extends AppCompatActivity {
    private static final String TAG ="" ;
    android.widget.DatePicker datepiker;
    TextView tv_datedisplay;
    private int year;
    private int month;
    private int day;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        tv_datedisplay = (TextView) findViewById(R.id.datepicker_tv);
        datepiker = (android.widget.DatePicker) findViewById(R.id.datapicker_dp);

        // datepiker.setSpinnersShown(false);
        // datepiker.setCalendarViewShown(true);

        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        context = getApplicationContext();

        tv_datedisplay.setText(day + "/" + (month+1) + "/" + year);
        String s=String.valueOf(month);
        Log.i(TAG,s);

        datepiker.init(year, month, day,new android.widget.DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        year = datepiker.getYear();
                        month = datepiker.getMonth();
                        day = datepiker.getDayOfMonth();
                        tv_datedisplay.setText(day + "/" + (month+1) + "/" + year);
                    }
                }
        );



    }
}
