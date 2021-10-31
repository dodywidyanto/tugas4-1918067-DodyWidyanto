package com.example.pertemuan4_recycler_1918067;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends
        RecyclerView.Adapter<MakananAdapter.MakananViewHolder>{
    private ArrayList<Makanan> dataList;
    public MakananAdapter(ArrayList<Makanan> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MakananAdapter.MakananViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_makanan, parent, false);
        return new MakananViewHolder(view);
    }
    public void onBindViewHolder(MakananViewHolder holder, int
            position) {
        holder.logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtRasa.setText(dataList.get(position).getRasa());
        holder.txtHarga.setText(dataList.get(position).getHarga());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MakananViewHolder extends
            RecyclerView.ViewHolder{

        private TextView txtNama, txtRasa, txtHarga;
        private ImageView logo;
        public MakananViewHolder(View itemView) {
            super(itemView);
            logo =  (ImageView) itemView.findViewById(R.id.img_logo);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtRasa = (TextView)
                    itemView.findViewById(R.id.txt_rasa);
            txtHarga = (TextView)
                    itemView.findViewById(R.id.txt_harga);
        }
    }
}