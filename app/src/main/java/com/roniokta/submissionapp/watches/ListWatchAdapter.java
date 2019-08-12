package com.roniokta.submissionapp.watches;

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

public class ListWatchAdapter extends RecyclerView.Adapter<ListWatchAdapter.ListWatchViewHolder> {
    private ArrayList<Watches> watchesList;
    private ListWatchAdapter.OnItemClickCallback onItemClickCallback;


    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListWatchAdapter(ArrayList<Watches> watchesList) {
        this.watchesList = watchesList;
    }

    @NonNull
    @Override
    public ListWatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_watches, parent, false);
        return new ListWatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListWatchViewHolder holder, int position) {
        Watches watches = watchesList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(watches.getWatchBadge())
                .apply(new RequestOptions().override(150, 100))
                .into(holder.imgWatchItem);
        holder.tvNameWatchItem.setText(watches.getNameWatch());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(watchesList.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return watchesList.size();
    }

    class ListWatchViewHolder extends RecyclerView.ViewHolder {
        ImageView imgWatchItem;
        TextView tvNameWatchItem;

        ListWatchViewHolder(@NonNull View itemView) {
            super(itemView);
            imgWatchItem = itemView.findViewById(R.id.img_item_watch_badge);
            tvNameWatchItem = itemView.findViewById(R.id.tv_item_watches_name);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Watches data);
    }
}
