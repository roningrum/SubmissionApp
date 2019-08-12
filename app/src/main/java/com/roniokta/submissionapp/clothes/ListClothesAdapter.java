package com.roniokta.submissionapp.clothes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.roniokta.submissionapp.R;

import java.util.ArrayList;

public class ListClothesAdapter extends RecyclerView.Adapter<ListClothesAdapter.ListClothesViewHolder> {
    private ArrayList<Clothes> clothesList;
    private ListClothesAdapter.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListClothesAdapter(ArrayList<Clothes> clothesList) {
        this.clothesList = clothesList;
    }

    @NonNull
    @Override
    public ListClothesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_clothes, parent, false);
        return new ListClothesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListClothesViewHolder holder, int position) {
        Clothes clothes = clothesList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(clothes.getClothesBadge())
                .apply(new RequestOptions().override(150,100))
                .into(holder.imgClothesItem);
        holder.tvClothesItem.setText(clothes.getNameClothes());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(clothesList.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return clothesList.size();
    }

    class ListClothesViewHolder extends RecyclerView.ViewHolder {
        ImageView imgClothesItem;
        TextView tvClothesItem;

        ListClothesViewHolder(@NonNull View itemView) {
            super(itemView);
            imgClothesItem = itemView.findViewById(R.id.img_item_clothes_badge);
            tvClothesItem = itemView.findViewById(R.id.tv_item_clothes_name);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Clothes data);
    }
}
