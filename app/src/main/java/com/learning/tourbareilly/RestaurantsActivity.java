package com.learning.tourbareilly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    ListView lv_restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        lv_restaurant = findViewById(R.id.lv_restaurant);
        ArrayList<Restaurants> restaurants = makeRestaurantData();
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,restaurants);
        lv_restaurant.setAdapter(adapter);
    }

    private ArrayList<Restaurants> makeRestaurantData() {
        String ddPuram = "DD Puram";
        String civil = "Civil Lines";
        String phoenix = "Phoenix United Mall";
        ArrayList<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants("Boston Bakery and Cafe",ddPuram));
        restaurants.add(new Restaurants("Waffle Affairs",ddPuram));
        restaurants.add(new Restaurants("Dominos Pizza",ddPuram));
        restaurants.add(new Restaurants("Pizza Hut",phoenix));
        restaurants.add(new Restaurants("Yo China",phoenix));
        restaurants.add(new Restaurants("Dhaba Santa Banta",ddPuram));
        restaurants.add(new Restaurants("Chaat Bazaar",ddPuram));
        restaurants.add(new Restaurants("Temptations Bakery",civil));
        restaurants.add(new Restaurants("Belgium Waffle",phoenix));
        restaurants.add(new Restaurants("Downtown 21 Cafe",ddPuram));
        restaurants.add(new Restaurants("Goonj Cafe","Choupla Road"));
        restaurants.add(new Restaurants("Kwality Restaurant",civil));
        restaurants.add(new Restaurants("Crazy Point",civil));
        restaurants.add(new Restaurants("Singh's Grill",civil));
        restaurants.add(new Restaurants("Momo Hut",ddPuram));
        restaurants.add(new Restaurants("Chawlas Restaurant",civil));
        return restaurants;
    }
}