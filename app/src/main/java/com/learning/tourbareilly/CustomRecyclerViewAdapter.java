package com.learning.tourbareilly;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_attraction_name,tv_short_description;
        private ImageView iv_attraction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_attraction_name = itemView.findViewById(R.id.tv_attraction_name);
            tv_short_description = itemView.findViewById(R.id.tv_short_description);
            iv_attraction = itemView.findViewById(R.id.iv_attraction);
        }

        public TextView getTv_attraction_name() {
            return tv_attraction_name;
        }

        public ImageView getIv_attraction() {
            return iv_attraction;
        }

        public TextView getTv_short_description() {
            return tv_short_description;
        }
    }

    private  ArrayList<Attractions> attraction;

    CustomRecyclerViewAdapter(ArrayList<Attractions> attractions)
    {
        attraction = attractions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getIv_attraction().setImageResource(attraction.get(position).getImage());
        holder.getTv_attraction_name().setText(attraction.get(position).getName());
        holder.getTv_short_description().setText(attraction.get(position).getShortDescription());
    }

    @Override
    public int getItemCount() {
        return attraction.size();
    }

}
