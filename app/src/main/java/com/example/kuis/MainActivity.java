package com.example.kuis;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.ebes),"Pramono Wibowo", "PAPA"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.emak),"Yeni Astuti", "MAMA"));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.aing),"Farhandi Ardi Wibowo", "Anak 1 "));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.apip),"Rafif Ramadani Wibowo", "Anak 2 "));
        keluargaArrayList.add(new Keluarga(getDrawable (R.drawable.acan),"Yusuf Ahsan Wibowo", "Anak 3 "));
    }
}
