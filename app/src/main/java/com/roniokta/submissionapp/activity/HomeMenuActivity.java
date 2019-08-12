package com.roniokta.submissionapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.roniokta.submissionapp.R;
import com.roniokta.submissionapp.activity.categorymenu.GlassesMenuActivity;
import com.roniokta.submissionapp.activity.categorymenu.WatchMenuActivity;
import com.roniokta.submissionapp.activity.categorymenu.ClothesMenuActivity;
import com.roniokta.submissionapp.activity.categorymenu.ShoesMenuActivity;

public class HomeMenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);
        LinearLayout fashionMenu = findViewById(R.id.layout_item_clothes_menu);
        LinearLayout shoesMenu = findViewById(R.id.layout_item_shoes_menu);
        LinearLayout watchMenu = findViewById(R.id.layout_item_watch_menu);
        LinearLayout glassesMenu = findViewById(R.id.layout_item_glasses_menu);

        Toolbar toolbarHome = findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbarHome);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("");
        }

        fashionMenu.setOnClickListener(this);
        shoesMenu.setOnClickListener(this);
        watchMenu.setOnClickListener(this);
        glassesMenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.layout_item_clothes_menu:
                Intent clothesActivityIntent = new Intent(HomeMenuActivity.this, ClothesMenuActivity.class);
                startActivity(clothesActivityIntent);
                break;
            case R.id.layout_item_shoes_menu:
                Intent shoesActivityIntent = new Intent(HomeMenuActivity.this, ShoesMenuActivity.class);
                startActivity(shoesActivityIntent);
                break;
            case R.id.layout_item_watch_menu:
                Intent watchesActivityIntent = new Intent(HomeMenuActivity.this, WatchMenuActivity.class);
                startActivity(watchesActivityIntent);
                break;
            case R.id.layout_item_glasses_menu:
                Intent glassesActivityIntent = new Intent(HomeMenuActivity.this, GlassesMenuActivity.class);
                startActivity(glassesActivityIntent);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu_option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about_app_menu:
                Intent aboutIntent = new Intent(HomeMenuActivity.this, AboutAppActivity.class);
                startActivity(aboutIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
