package com.kuliah.wikisejarah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuAdapter extends BaseAdapter {

    Context context;
    String[] dataTulisan;
    int[] gambar;
    LayoutInflater inflater;

    public MenuAdapter(Context context, String[] dataTulisan, int[] gambar) {
        this.context = context;
        this.dataTulisan = dataTulisan;
        this.gambar = gambar;
    }

    @Override
    public int getCount() {
        return dataTulisan.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(inflater==null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(view == null){
            view = inflater.inflate(R.layout.row_item_menu,null);}

        ImageView imageView = view.findViewById(R.id.grid_image);
        TextView textView = view.findViewById(R.id.item_name);

        imageView.setImageResource(gambar[i]);
        textView.setText(dataTulisan[i]);


        return view;
    }
}