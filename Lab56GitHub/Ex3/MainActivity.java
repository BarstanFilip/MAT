package com.example.lab56ex3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerViewAdapter adapter;
    private ArrayList<Model> modelArrayList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelArrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);

        modelArrayList.add(new Model("Filip", "0775442232", "address1"));
        modelArrayList.add(new Model("Darius", "077544343", "adress2"));
        modelArrayList.add(new Model("Andrei", "07756543232", "address3"));
        modelArrayList.add(new Model("Camelia", "0775474332", "address4"));
        modelArrayList.add(new Model("Maria", "077544534344" ,"addres5"));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new RecyclerViewAdapter(modelArrayList, this);
        recyclerView.setAdapter(adapter);
    }
}