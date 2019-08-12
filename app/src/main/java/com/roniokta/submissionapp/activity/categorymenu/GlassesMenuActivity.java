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

import com.roniokta.submissionapp.activity.detailmenu.DetailGlassesActivity;
import com.roniokta.submissionapp.R;
import com.roniokta.submissionapp.glasses.Glasses;
import com.roniokta.submissionapp.glasses.GlassesData;
import com.roniokta.submissionapp.glasses.ListGlassesAdapter;

import java.util.ArrayList;

public class GlassesMenuActivity extends AppCompatActivity {
    private RecyclerView rvGlassesList;
    private ArrayList<Glasses> glassesList = new ArrayList<>();
    private ProgressBar pbGlassesMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glasses_menu);
        rvGlassesList = findViewById(R.id.rv_glasses);
        pbGlassesMenu = findViewById(R.id.progress_bar_glasses);
        rvGlassesList.setHasFixedSize(true);

        Toolbar toolbarGlasses = findViewById(R.id.toolbar_glasses);
        setSupportActionBar(toolbarGlasses);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.glasses_home_menu);
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
                pbGlassesMenu.setVisibility(View.VISIBLE);
                glassesList.clear();
                glassesList.addAll(GlassesData.getGlassesData());
                showRecyclerGlasses();
            }

        }, 2000);

    }

    private void showRecyclerGlasses() {
        pbGlassesMenu.setVisibility(View.GONE);
        rvGlassesList.setLayoutManager(new GridLayoutManager(this, 2));
        ListGlassesAdapter listGlassesAdapter = new ListGlassesAdapter(glassesList);
        rvGlassesList.setAdapter(listGlassesAdapter);

        listGlassesAdapter.setOnItemClickCallback(new ListGlassesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Glasses data) {
                showIntentDetailGlasses(data);
            }
        });
    }

    private void showIntentDetailGlasses(Glasses data) {
        Intent moveToGlassDetailIntent = new Intent(GlassesMenuActivity.this, DetailGlassesActivity.class);
        moveToGlassDetailIntent.putExtra(DetailGlassesActivity.EXTRA_NAME_GLASSES, data.getNameGlasses());
        moveToGlassDetailIntent.putExtra(DetailGlassesActivity.EXTRA_INFO_GLASSES, data.getInfoGlasses());
        moveToGlassDetailIntent.putExtra(DetailGlassesActivity.EXTRA_BADGE_GLASSES, data.getGlassesBadge());
        moveToGlassDetailIntent.putExtra(DetailGlassesActivity.EXTRA_SHOP_GLASSES, data.getShopGlasses());
        moveToGlassDetailIntent.putExtra(DetailGlassesActivity.EXTRA_PHOTO_GLASSES, data.getPhotoGlasses());
        startActivity(moveToGlassDetailIntent);
    }


    @Override
    protected void onStop() {
        super.onStop();
        pbGlassesMenu.setVisibility(View.GONE);
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
