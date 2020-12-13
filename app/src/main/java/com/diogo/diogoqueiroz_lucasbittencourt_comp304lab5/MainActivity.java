package com.diogo.diogoqueiroz_lucasbittencourt_comp304lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ArrayList<Landmark> landmarks;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitList();

        this.getSupportActionBar().setTitle("Places of Toronto");

        RecyclerView listOfTypesView = findViewById(R.id.list_of_types);
        listOfTypesView.setLayoutManager(new LinearLayoutManager(this));

        String[] types = getResources().getStringArray(R.array.landmark_types);
        TypesAdapter typesAdapter = new TypesAdapter(getApplicationContext(), types, "MainActivity");
        listOfTypesView.setAdapter(typesAdapter);
    }

    private void InitList()
    {
        Landmark duplex = new Landmark(
                "Duplex Avenue", "Type 1", "411 Duplex Avenue, M4R1V2",
                "43.667138","-79.3610495");
        Landmark eastdale = new Landmark(
                "Eastdale Avenue", "Type 2", "90 Eastdale Avenue, M4C5A2",
                "43.667138","-78.65644");
        landmarks.add(duplex);
        landmarks.add(eastdale);
        // todo Create list of POI, need to implement the Class for it as well.
    }
}