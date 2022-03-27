package com.example.exercise1pam_todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView rTask, rType, rTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        rTask = findViewById(R.id.tvTask);
        rType = findViewById(R.id.tvType);
        rTime = findViewById(R.id.tvTime);

        Bundle bundle = getIntent().getExtras();

        String task = bundle.getString("a");
        String type = bundle.getString("b");
        String time = bundle.getString("c");

        rTask.setText(task);
        rType.setText(type);
        rTime.setText(time);
    }
}