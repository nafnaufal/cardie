package com.kuliah.wikisejarah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Arrays;
import java.util.List;

public class Menu extends Fragment{
    GridView gv;
    String[] list = {"Timeline", "Tokoh", "Latar Belakang", "Wiki", "Lokasi", "Dokumentasi"};
    int[] img = {R.drawable.ic_icon_timeline, R.drawable.ic_icon_tokoh, R.drawable.ic_icon_latar, R.drawable.ic_icon_wiki, R.drawable.ic_map_foreground, R.drawable.ic_dokumentasi_foreground};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu,container,false);
        // Inflate the layout for this fragment
        MenuAdapter gridAdapter = new MenuAdapter(getActivity().getApplicationContext(), list, img);
        gv = rootView.findViewById(R.id.gridView);
        gv.setAdapter(gridAdapter);

        String tok[] = getActivity().getIntent().getStringArrayExtra("tokoh");
        int tokP[] = getActivity().getIntent().getIntArrayExtra("tokohPhoto");
        String tokD[] = getActivity().getIntent().getStringArrayExtra("tokohDetail");
        String tl[] = getActivity().getIntent().getStringArrayExtra("timeline");
        String tlD[] = getActivity().getIntent().getStringArrayExtra("timelineDetail");

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(list[i].equals("Timeline")){
                    Intent intent = new Intent(getActivity(), TimelineActivity.class);
                    intent.putExtra("timeline", tl);
                    intent.putExtra("timelineDetail", tlD);
                    startActivity(intent);
                }
                if(list[i].equals("Tokoh")){
                    Intent intent = new Intent(getActivity(), TokohActivity.class);
                    intent.putExtra("tokoh", tok);
                    intent.putExtra("tokohDetail", tokD);
                    intent.putExtra("tokohPhoto", tokP);
                    startActivity(intent);
                }
                if(list[i].equals("Wiki")){
                    String wiki = getActivity().getIntent().getStringExtra("wiki");
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(wiki));
                    startActivity(intent);
                }

                if(list[i].equals("Latar Belakang")){
                    Bundle b = getActivity().getIntent().getExtras();
                    String lat = getActivity().getIntent().getStringExtra("latar");
                    int latP = b.getInt("latarPhoto");

                    Intent intent = new Intent(getActivity(), Latar.class);
                    intent.putExtra("latar", lat);
                    intent.putExtra("latarPhoto", latP);
                    startActivity(intent);
                }
                if(list[i].equals("Lokasi")){
                    double lat = getActivity().getIntent().getDoubleExtra("lat", 1);
                    double lng = getActivity().getIntent().getDoubleExtra("lng", 1);
                    Intent intent = new Intent(getActivity(), LokasiActivity.class);
                    intent.putExtra("lat", lat);
                    intent.putExtra("lng", lng);
                    startActivity(intent);

                }
                if(list[i].equals("Dokumentasi")){
                    String name = getActivity().getIntent().getStringExtra("name");
                    Intent intent = new Intent(getActivity(), Dokumentasi.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }
}
