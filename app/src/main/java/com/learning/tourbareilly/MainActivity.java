package com.learning.tourbareilly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv_attractions,tv_facts,tv_restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_attractions = (TextView) findViewById(R.id.tv_attractions);
        tv_facts = (TextView) findViewById(R.id.tv_facts);
        tv_restaurants = (TextView) findViewById(R.id.tv_restaurants);

        tv_attractions.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this,NearbyAttractions.class);
            startActivity(in);
        });

        tv_facts.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this,FactsActivity.class);
            startActivity(in);
        });

        tv_restaurants.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this,RestaurantsActivity.class);
            startActivity(in);
        });

    }
}