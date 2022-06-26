package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TimelineActivity extends AppCompatActivity {
    String name[], detail[];
    RecyclerView rvtimeline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        rvtimeline = findViewById(R.id.rv_timeline);

        name = getIntent().getStringArrayExtra("timeline");
        detail = getIntent().getStringArrayExtra("timelineDetail");

        TimelineAdapter timelineAdapter = new TimelineAdapter(this, name, detail);
        rvtimeline.setAdapter(timelineAdapter);
        rvtimeline.setLayoutManager(new LinearLayoutManager(this));
    }
}