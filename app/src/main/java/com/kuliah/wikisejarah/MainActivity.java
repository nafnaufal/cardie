package com.kuliah.wikisejarah;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSejarah;
    private ArrayList<Sejarah> list = new ArrayList<>();


    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSejarah = findViewById(R.id.rv_sejarah);
        rvSejarah.setHasFixedSize(true);

        list.addAll(SejarahData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvSejarah.setLayoutManager(new LinearLayoutManager(this));
        CardViewSejarahAdapter cardViewHeroAdapter = new CardViewSejarahAdapter(list);
        rvSejarah.setAdapter(cardViewHeroAdapter);

        cardViewHeroAdapter.setOnItemClickCallback(new CardViewSejarahAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sejarah data) {
                showSelectedSejarah(data);
            }
        });
    }

    private void showSelectedSejarah(Sejarah sejarah) {
        i = new Intent(MainActivity.this, MenuActivity.class);
        i.putExtra("photo", sejarah.getPhoto());
        i.putExtra("name", sejarah.getName());
        i.putExtra("detail", sejarah.getDetail());
        i.putExtra("wiki", sejarah.getWiki());
        i.putExtra("tokoh", sejarah.getTokoh());
        i.putExtra("tokohDetail", sejarah.getTokohDetail());
        i.putExtra("tokohPhoto", sejarah.getTokohPhoto());
        i.putExtra("timeline", sejarah.getTimeline());
        i.putExtra("timelineDetail", sejarah.getTimelineDdetail());
        i.putExtra("latar", sejarah.getLatar());
        i.putExtra("latarPhoto", sejarah.getPhotoLatar());
        i.putExtra("lat", sejarah.getLat());
        i.putExtra("lng", sejarah.getLng());
        startActivity(i);
    }
}