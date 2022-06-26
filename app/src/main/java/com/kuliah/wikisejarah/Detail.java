package com.kuliah.wikisejarah;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends Fragment {
    ImageView photo;
    TextView nama, detail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle covers;
        String n, d;
        int p;

        photo = view.findViewById(R.id.iv_sejarah);
        nama = view.findViewById(R.id.tv_sejarah);
        detail = view.findViewById(R.id.tv_detail);

        covers = getActivity().getIntent().getExtras();
        p = covers.getInt("photo");
        n = getActivity().getIntent().getStringExtra("name");
        d = getActivity().getIntent().getStringExtra("detail");

        photo.setImageResource(p);
        nama.setText(n);
        detail.setText(d);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}