package com.roniokta.submissionapp.activity.categorymenu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.roniokta.submissionapp.R;
import com.roniokta.submissionapp.activity.detailmenu.DetailWatchActivity;
import com.roniokta.submissionapp.watches.ListWatchAdapter;
import com.roniokta.submissionapp.watches.Watches;
import com.roniokta.submissionapp.watches.WatchesData;

import java.util.ArrayList;

public class WatchMenuActivity extends AppCompatActivity {
    private RecyclerView rvWatchList;
    private ArrayList<Watches> watchesList = new ArrayList<>();
    private ProgressBar pbWatchesMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_menu);
        rvWatchList = findViewById(R.id.rv_watch);
        pbWatchesMenu = findViewById(R.id.progress_bar_watch);
        rvWatchList.setHasFixedSize(true);

        Toolbar toolbarWatches = findViewById(R.id.toolbar_watches);
        setSupportActionBar(toolbarWatches);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.watchs_home_menu);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                pbWatchesMenu.setVisibility(View.VISIBLE);
                watchesList.clear();
                watchesList.addAll(WatchesData.getWatchesData());
                showRecyclerWatches();
            }

        }, 2000);

    }

    @Override
    protected void onStop() {
        super.onStop();
        pbWatchesMenu.setVisibility(View.GONE);
    }

    private void showRecyclerWatches() {
        pbWatchesMenu.setVisibility(View.GONE);
        rvWatchList.setLayoutManager(new GridLayoutManager(this, 2));
        ListWatchAdapter listWatchAdapter = new ListWatchAdapter(watchesList);
        rvWatchList.setAdapter(listWatchAdapter);

        listWatchAdapter.setOnItemClickCallback(new ListWatchAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Watches data) {
                showIntentDetailWatches(data);
            }
        });
    }

    private void showIntentDetailWatches(Watches watchesData) {
        Intent moveToWatchDetailIntent = new Intent(WatchMenuActivity.this, DetailWatchActivity.class);
        moveToWatchDetailIntent.putExtra(DetailWatchActivity.EXTRA_NAME_WATCHES, watchesData.getNameWatch());
        moveToWatchDetailIntent.putExtra(DetailWatchActivity.EXTRA_INFO_WATCHES, watchesData.getInfoWatch());
        moveToWatchDetailIntent.putExtra(DetailWatchActivity.EXTRA_BADGE_WATCHES, watchesData.getWatchBadge());
        moveToWatchDetailIntent.putExtra(DetailWatchActivity.EXTRA_SHOP_WATCHES, watchesData.getShopWatch());
        moveToWatchDetailIntent.putExtra(DetailWatchActivity.EXTRA_PHOTO_WATCHES, watchesData.getPhotoWatch());
        startActivity(moveToWatchDetailIntent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
