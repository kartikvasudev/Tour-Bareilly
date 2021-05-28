package com.learning.tourbareilly;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        attractions.add(new Attractions(R.drawable.attractions_dhopa, getString
                (R.string.attraction_dhopa_name), getString(R.string.attraction_dhopa_description)));
        attractions.add(new Attractions(R.drawable.attractions_dargah3, getString
                (R.string.attraction_dargah_name), getString(R.string.attraction_dargah_description)));
        attractions.add(new Attractions(R.drawable.attractions_funcityboond, getString
                (R.string.attraction_funcity_name), getString(R.string.attraction_funcity_description)));
        attractions.add(new Attractions(R.drawable.attractions_st_steven, getString
                (R.string.attraction_steven_name), getString(R.string.attraction_steven_description)));
        attractions.add(new Attractions(R.drawable.attractions_ahichhartra_temple, getString
                (R.string.attraction_ahichartra_name), getString(R.string.attraction_ahichartra_description)));
        attractions.add(new Attractions(R.drawable.attractions_phoenixmall, getString
                (R.string.attraction_phoenix_name), getString(R.string.attraction_phoenix_description)));
        attractions.add(new Attractions(R.drawable.attractions_kargil_chowk, getString
                (R.string.attraction_kargil_name), getString(R.string.attraction_kargil_description)));
        attractions.add(new Attractions(R.drawable.attraction_shri_trivati_nath, getString
                (R.string.attraction_trivati_name), getString(R.string.attraction_trivati_description)));
        return attractions;
    }
}