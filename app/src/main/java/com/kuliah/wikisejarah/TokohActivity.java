package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class TokohActivity extends AppCompatActivity {
    String name[], detail[];
    int photo[];
    RecyclerView rvtokoh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh);
        rvtokoh = findViewById(R.id.rv_tokoh);

        Bundle b = getIntent().getExtras();
        photo = b.getIntArray("tokohPhoto");
        name = getIntent().getStringArrayExtra("tokoh");
        detail = getIntent().getStringArrayExtra("tokohDetail");

        TokohAdapter tokohAdapter = new TokohAdapter(this, name, photo, detail);
        rvtokoh.setAdapter(tokohAdapter);
        rvtokoh.setLayoutManager(new LinearLayoutManager(this));
    }
}