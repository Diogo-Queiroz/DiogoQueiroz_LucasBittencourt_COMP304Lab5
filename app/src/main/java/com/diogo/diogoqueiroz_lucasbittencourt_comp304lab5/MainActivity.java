package com.diogo.diogoqueiroz_lucasbittencourt_comp304lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportActionBar().setTitle("Places of Toronto");

        RecyclerView listOfTypesView = findViewById(R.id.list_of_types);
        listOfTypesView.setLayoutManager(new LinearLayoutManager(this));

        String[] types = getResources().getStringArray(R.array.landmark_types);
        TypesAdapter typesAdapter = new TypesAdapter(getApplicationContext(), types, "MainActivity");
        listOfTypesView.setAdapter(typesAdapter);
    }

    private void InitList()
    {
        // todo Create list of POI, need to implement the Class for it as well.
    }
}