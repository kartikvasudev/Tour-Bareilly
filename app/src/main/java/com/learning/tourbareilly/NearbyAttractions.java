package com.learning.tourbareilly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class NearbyAttractions extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_attractions);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        ArrayList<Attractions> attractions = getAttractions();
        CustomRecyclerViewAdapter adapter = new CustomRecyclerViewAdapter(attractions);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Attractions> getAttractions() {
        ArrayList<Attractions> attractions = new ArrayList<>();
        for(int i =0;i<10;i++)
        attractions.add(new Attractions(R.drawable.iv_bareilly,"YO","By default, poetry creates a virtual environment in {cache-dir}/virtualenvs ({cache-dir}\\virtualenvs on Windows). You can change the cache-dir value by editing the poetry config. Additionally, you can use the virtualenvs.in-project configuration variable to create virtual environment within your project directory. By default, poetry creates a virtual environment in {cache-dir}/virtualenvs ({cache-dir}\\virtualenvs on Windows). You can change the cache-dir value by editing the poetry config. Additionally, you can use the virtualenvs.in-project configuration variable to create virtual environment within your project directory."));
        return attractions;
    }
}