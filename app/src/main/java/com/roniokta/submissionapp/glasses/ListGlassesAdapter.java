package com.roniokta.submissionapp.glasses;

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

public class ListGlassesAdapter extends RecyclerView.Adapter<ListGlassesAdapter.ListGlassesViewHolder> {
    private ArrayList<Glasses> glassList;
    private ListGlassesAdapter.OnItemClickCallback onItemClickCallback;

    public ListGlassesAdapter(ArrayList<Glasses> glassList) {
        this.glassList = glassList;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListGlassesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_glasses, parent, false);
        return new ListGlassesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListGlassesViewHolder holder, int position) {
        Glasses glasses = glassList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(glasses.getGlassesBadge())
                .apply(new RequestOptions().override(150,100))
                .into(holder.imgGlassesItem);
        holder.tvGlassesNameItem.setText(glasses.getNameGlasses());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(glassList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return glassList.size();
    }

    class ListGlassesViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGlassesItem;
        TextView tvGlassesNameItem;
        ListGlassesViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGlassesItem = itemView.findViewById(R.id.img_item_glasses_badge);
            tvGlassesNameItem = itemView.findViewById(R.id.tv_item_glasses_name);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Glasses data);
    }
}
