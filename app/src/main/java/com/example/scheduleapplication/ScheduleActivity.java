package com.example.scheduleapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        updateUI();
    }

    private void updateUI(){

// The week view has infinite scrolling horizontally. We have to provide the events of a
// month every time the month changes on the week view.
        //mWeekView.setMonthChangeListener(mMonthChangeListener);

// Set long press listener for events.
        //mWeekView.setEventLongPressListener(mEventLongPressListener);
    }
}