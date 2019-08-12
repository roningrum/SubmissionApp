package com.roniokta.submissionapp.activity.categorymenu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.roniokta.submissionapp.R;
import com.roniokta.submissionapp.activity.detailmenu.DetailClothesActivity;
import com.roniokta.submissionapp.clothes.Clothes;
import com.roniokta.submissionapp.clothes.ClothesData;
import com.roniokta.submissionapp.clothes.ListClothesAdapter;

import java.util.ArrayList;

public class ClothesMenuActivity extends AppCompatActivity {
    private RecyclerView rvClothes;
    private ArrayList<Clothes> clothesList = new ArrayList<>();
    private ProgressBar progressBarClothes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_menu);
        rvClothes = findViewById(R.id.rv_clothes);
        progressBarClothes = findViewById(R.id.progress_bar_clothes);
        rvClothes.setHasFixedSize(true);


        Toolbar toolbarClothes = findViewById(R.id.toolbar_clothes);
        setSupportActionBar(toolbarClothes);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.clothes_home_menu);
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
                progressBarClothes.setVisibility(View.VISIBLE);
                clothesList.clear();
                clothesList.addAll(ClothesData.getListClothesData());
                showRecyclerClother();
            }

        }, 2000);

    }
    @Override
    protected void onStop() {
        super.onStop();
        progressBarClothes.setVisibility(View.GONE);
    }

    private void showRecyclerClother() {
        progressBarClothes.setVisibility(View.GONE);
        rvClothes.setLayoutManager(new GridLayoutManager(this, 2));
        ListClothesAdapter listShoesAdapter = new ListClothesAdapter(clothesList);
        rvClothes.setAdapter(listShoesAdapter);
        listShoesAdapter.setOnItemClickCallback(new ListClothesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Clothes data) {
                showIntentClothesRecycler(data);
            }
        });
    }

    private void showIntentClothesRecycler(Clothes data) {
        Intent moveToDetailClothesIntent = new Intent(ClothesMenuActivity.this, DetailClothesActivity.class);
        moveToDetailClothesIntent.putExtra(DetailClothesActivity.EXTRA_NAME_CLOTHES, data.getNameClothes());
        moveToDetailClothesIntent.putExtra(DetailClothesActivity.EXTRA_INFO_CLOTHES, data.getInfoClothes());
        moveToDetailClothesIntent.putExtra(DetailClothesActivity.EXTRA_BADGE_CLOTHES, data.getClothesBadge());
        moveToDetailClothesIntent.putExtra(DetailClothesActivity.EXTRA_SHOP_CLOTHES, data.getShopClothes());
        moveToDetailClothesIntent.putExtra(DetailClothesActivity.EXTRA_PHOTO_CLOTHES, data.getPhotoClothes());
        startActivity(moveToDetailClothesIntent);

    }


    @NonNull
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
