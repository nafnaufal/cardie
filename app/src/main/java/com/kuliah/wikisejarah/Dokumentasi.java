package com.kuliah.wikisejarah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Arrays;
import java.util.List;

public class Dokumentasi extends AppCompatActivity {

    RecyclerView rvtimeline;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        rvtimeline = findViewById(R.id.rv_timeline);

        String name = getIntent().getStringExtra("name");

        db.collection("dokumentasi").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(QuerySnapshot documentSnapshots, FirebaseFirestoreException e) {
                if (e != null)
                {

                }

                for (DocumentChange documentChange : documentSnapshots.getDocumentChanges())
                {
                    List<String> sejarahTokoh = (List<String>) documentChange.getDocument().getData().get(name);
                    String link[] = new String[sejarahTokoh.size()];
                    sejarahTokoh.toArray(link);
                    DokumentasiAdapter dokumentasiAdapter = new DokumentasiAdapter( context, link);
                    rvtimeline.setAdapter(dokumentasiAdapter);
                    rvtimeline.setLayoutManager(new LinearLayoutManager(context));
                }
            }
        });


    }
}