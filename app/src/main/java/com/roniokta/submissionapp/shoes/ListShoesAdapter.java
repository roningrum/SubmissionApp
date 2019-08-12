package com.roniokta.submissionapp.shoes;

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

public class ListShoesAdapter extends RecyclerView.Adapter<ListShoesAdapter.ListShoesViewHolder>{
    private ArrayList<Shoes> listshoess;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListShoesAdapter(ArrayList<Shoes> listshoess) {
        this.listshoess = listshoess;
    }

    @NonNull
    @Override
    public ListShoesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_shoes, parent, false);
        return new ListShoesViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListShoesViewHolder holder, int position) {
        Shoes shoes = listshoess.get(position);
        Glide.with(holder.itemView.getContext())
                .load(shoes.getShoesBadge())
                .apply(new RequestOptions().override(150,100))
                .into(holder.imgShoesItem);
        holder.tvShoesName.setText(shoes.getNameShoes());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listshoess.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listshoess.size();
    }

    class ListShoesViewHolder extends RecyclerView.ViewHolder {
        ImageView imgShoesItem;
        TextView tvShoesName;

        ListShoesViewHolder(@NonNull View itemView) {
            super(itemView);
            tvShoesName = itemView.findViewById(R.id.tv_item_shoes_name);
            imgShoesItem = itemView.findViewById(R.id.img_item_shoes_photo);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Shoes data);
    }
}
