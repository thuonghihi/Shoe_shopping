package com.example.shoeshopee_customer.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoeshopee_customer.R;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private List<Integer> bannerList;

    public SliderAdapter(List<Integer> bannerList) {
        this.bannerList = bannerList;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.banner_item, parent, false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        int bannerImage = bannerList.get(position);
        holder.bannerImageView.setImageResource(bannerImage);
    }

    @Override
    public int getItemCount() {
        return bannerList.size();
    }

    public static class SliderViewHolder extends RecyclerView.ViewHolder {
        ImageView bannerImageView;

        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            bannerImageView = itemView.findViewById(R.id.bannerImage);
        }
    }
}
