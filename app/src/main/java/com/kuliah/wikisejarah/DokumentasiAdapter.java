package com.kuliah.wikisejarah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DokumentasiAdapter extends RecyclerView.Adapter<DokumentasiAdapter.DokumentasiViewHolder> {

    String link[];
    Context context;

    public DokumentasiAdapter(Context ct, String link[]){
        context = ct;
        this.link = link;
    }

    @NonNull
    @Override
    public DokumentasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_row_dokumentasi, parent, false);
        return new DokumentasiAdapter.DokumentasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DokumentasiViewHolder holder, int position) {
        holder.setFoto(link[position]);
    }

    @Override
    public int getItemCount() {
        return link.length;
    }

    public class DokumentasiViewHolder extends RecyclerView.ViewHolder {
        ImageView n;
        public DokumentasiViewHolder(@NonNull View itemView) {
            super(itemView);
            n = itemView.findViewById(R.id.tv_item_name);
        }
        private void setFoto(String iconUrl){
            Glide.with(itemView.getContext()).load(iconUrl).into(n);
        }
    }
}
