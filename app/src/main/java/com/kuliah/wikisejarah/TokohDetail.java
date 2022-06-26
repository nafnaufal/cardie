package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TokohDetail extends AppCompatActivity {
    ImageView photo;
    TextView detail, nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokoh_detail);
        Bundle covers;
        String n, d;
        int p;

        photo = findViewById(R.id.iv_sejarah);
        nama = findViewById(R.id.tv_sejarah);
        detail = findViewById(R.id.tv_detail);

        covers = getIntent().getExtras();
        p = covers.getInt("photo");
        n = getIntent().getStringExtra("nama");
        d = getIntent().getStringExtra("detail");

        System.out.println(n);
        System.out.println(d);
        System.out.println(p);

        photo.setImageResource(p);
        nama.setText(n);
        detail.setText(d);
    }
}