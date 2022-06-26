package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Latar extends AppCompatActivity {

    ImageView photo;
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latar);
        Bundle covers;
        String n, d;
        int p;

        photo = findViewById(R.id.iv_sejarah);
        detail = findViewById(R.id.tv_detail);

        covers = getIntent().getExtras();
        p = covers.getInt("latarPhoto");
        d = getIntent().getStringExtra("latar");

        photo.setImageResource(p);
        detail.setText(d);
    }
}