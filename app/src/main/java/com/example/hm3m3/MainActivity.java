package com.example.hm3m3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView ;
   private ArrayList<String> names = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        names.add("Medic");
        names.add("Hero");
        names.add("Junior");
        names.add("Pudge");
        names.add("Tiny");
        names.add("Spirit");
        names.add("Night Stalker");
        names.add("Chaos");
        names.add("Boss");
        names.add("Phoenix");
        names.add("Tusk");
        names.add("Alok");
        names.add("Magnus");
        names.add("King");
        NameAdapter adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}