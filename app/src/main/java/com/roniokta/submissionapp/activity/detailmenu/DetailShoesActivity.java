package com.roniokta.submissionapp.activity.detailmenu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.roniokta.submissionapp.R;

public class DetailShoesActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgShoesBrandDetail, imgShoesItemDetail;
    private TextView tvNameShoesDetail, tvInfoShoesDeatil;

    public static final String EXTRA_NAME_SHOES = "extra_name_shoes";
    public static final String EXTRA_INFO_SHOES = "extra_info_shoes";
    public static final String EXTRA_BADGE_SHOES = "extra_badges_shoes";
    public static final String EXTRA_SHOP_SHOES = "extra_shop_shoes";
    public static final String EXTRA_PHOTO_SHOES = "extra_photo_shoes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shoes);
        imgShoesBrandDetail = findViewById(R.id.img_shoes_detail);
        imgShoesItemDetail = findViewById(R.id.img_shoes_item_detail);
        tvNameShoesDetail = findViewById(R.id.tv_shoes_name_detail);
        tvInfoShoesDeatil = findViewById(R.id.tv_info_shoes);
        ImageButton btnOrderShoes = findViewById(R.id.btn_shop);
        ImageButton btnBackShoes = findViewById(R.id.btn_back);

        btnOrderShoes.setOnClickListener(this);
        btnBackShoes.setOnClickListener(this);

        showDetailInfo();
    }

    private void showDetailInfo() {
        String name = getIntent().getStringExtra(EXTRA_NAME_SHOES);
        String info = getIntent().getStringExtra(EXTRA_INFO_SHOES);
        String photo_logo = getIntent().getStringExtra(EXTRA_BADGE_SHOES);
        String photo_shoes = getIntent().getStringExtra(EXTRA_PHOTO_SHOES);

        tvNameShoesDetail.setText(name);
        tvInfoShoesDeatil.setText(info);
        Glide.with(this).load(photo_logo).into(imgShoesBrandDetail);
        Glide.with(this).load(photo_shoes).into(imgShoesItemDetail);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                onBackPressed();
                finish();
                break;
            case R.id.btn_shop:
                String shop = getIntent().getStringExtra(EXTRA_SHOP_SHOES);
                Intent shopShoesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(shop));
                startActivity(shopShoesIntent);
                break;
        }

    }
}
