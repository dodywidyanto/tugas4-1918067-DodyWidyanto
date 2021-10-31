package com.example.pertemuan4_recycler_1918067;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MakananAdapter adapter;
    private ArrayList<Makanan> makananArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MakananAdapter(makananArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan("Nama  :Lays", "Rasa    :rumput laut",
                "Harga  :Rp.5000",R.drawable.lays));
        makananArrayList.add(new Makanan("Nama  :Sukro", "Rasa    :Original",
                "Harga  :Rp.6000",R.drawable.sukro));
        makananArrayList.add(new Makanan("Nama  :Chitato", "Rasa    :Sapi panggang",
                "Harga  :Rp.7000",R.drawable.chitato));
        makananArrayList.add(new Makanan("Nama  :Qtela", "Rasa    :Rumput laut",
                "Harga  :Rp.7000",R.drawable.qtela));
    }
}
