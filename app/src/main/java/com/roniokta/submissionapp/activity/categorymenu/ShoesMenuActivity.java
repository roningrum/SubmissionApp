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
import com.roniokta.submissionapp.activity.detailmenu.DetailShoesActivity;
import com.roniokta.submissionapp.shoes.ListShoesAdapter;
import com.roniokta.submissionapp.shoes.ShoesData;
import com.roniokta.submissionapp.shoes.Shoes;

import java.util.ArrayList;

public class ShoesMenuActivity extends AppCompatActivity {
    private RecyclerView rvShoes;
    private ArrayList<Shoes> list = new ArrayList<>();
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes_menu);
        rvShoes = findViewById(R.id.rv_shoes);
        progressBar = findViewById(R.id.progress_bar);

        rvShoes.setHasFixedSize(true);

        Toolbar toolbarShoesMenu = findViewById(R.id.toolbar_shoes);
        setSupportActionBar(toolbarShoesMenu);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(R.string.shoes_home_menu);
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
                progressBar.setVisibility(View.VISIBLE);
                list.clear();
                list.addAll(ShoesData.getListData());
                showRecyclerShoes();
            }

        }, 2000);

    }
    @Override
    protected void onStop() {
        super.onStop();
        progressBar.setVisibility(View.GONE);
        rvShoes.removeAllViews();
    }

    private void showRecyclerShoes() {
        progressBar.setVisibility(View.GONE);
        rvShoes.setLayoutManager(new GridLayoutManager(this, 2));
        ListShoesAdapter listShoesAdapter = new ListShoesAdapter(list);
        rvShoes.setAdapter(listShoesAdapter);

        listShoesAdapter.setOnItemClickCallback(new ListShoesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Shoes data) {
                showIntentDetailShoes(data);
            }
        });
    }

    private void showIntentDetailShoes(Shoes data) {
        Intent moveToDetailIntent = new Intent(ShoesMenuActivity.this, DetailShoesActivity.class);
        moveToDetailIntent.putExtra(DetailShoesActivity.EXTRA_NAME_SHOES, data.getNameShoes());
        moveToDetailIntent.putExtra(DetailShoesActivity.EXTRA_INFO_SHOES, data.getInfoShoes());
        moveToDetailIntent.putExtra(DetailShoesActivity.EXTRA_BADGE_SHOES, data.getShoesBadge());
        moveToDetailIntent.putExtra(DetailShoesActivity.EXTRA_SHOP_SHOES, data.getShopShoes());
        moveToDetailIntent.putExtra(DetailShoesActivity.EXTRA_PHOTO_SHOES, data.getPhotoShoes());
        startActivity(moveToDetailIntent);
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
