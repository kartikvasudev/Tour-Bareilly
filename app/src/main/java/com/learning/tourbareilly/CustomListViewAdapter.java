package com.learning.tourbareilly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class CustomListViewAdapter extends BaseAdapter {
    private ArrayList<Restaurants> mRestaurantList;
    Context mContext;
    CustomListViewAdapter(Context context ,ArrayList<Restaurants> restaurantList) {
        mContext = context;
        mRestaurantList = restaurantList;
    }

    @Override
    public int getCount() {
        return mRestaurantList.size();
    }

    @Override
    public Restaurants getItem(int i) {
        return mRestaurantList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.lv_list_item, viewGroup, false);
        }

        ((TextView) view.findViewById(R.id.tv_restaurant_name))
                .setText(getItem(i).getName());
        ((TextView) view.findViewById(R.id.tv_restaurant_address))
                .setText(getItem(i).getAddress());
        return view;
    }
    }
