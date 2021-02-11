package com.example.tugas1.recycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas1.R;
import com.example.tugas1.recycleview.models.Buku;

import java.util.ArrayList;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuHold> {

    private Context context;
    private ArrayList<Buku> buku;

    public BukuAdapter(Context context, ArrayList<Buku> buku) {
        this.context = context;
        this.buku = buku;
    }

    @NonNull
    @Override
    public BukuAdapter.BukuHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tampilan, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        BukuHold vh = new BukuHold(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull BukuAdapter.BukuHold holder, int position) {

        holder.judul.setText(buku.get(position).getJudul());
        holder.warna.setText(buku.get(position).getWarna());
        holder.harga.setText(buku.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return buku.size();
    }

    public class BukuHold extends RecyclerView.ViewHolder {
        private TextView judul;
        private TextView warna;
        private TextView harga;
        public BukuHold(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tv2);
            warna = itemView.findViewById(R.id.tv4);
            harga = itemView.findViewById(R.id.tv6);

        }
    }
}
