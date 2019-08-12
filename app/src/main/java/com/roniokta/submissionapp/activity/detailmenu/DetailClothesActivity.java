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

public class DetailClothesActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgClothesBadgeDetail, imgPhotoClothesDetail;
    private TextView tvNameClothesDetail, tvInfoClothesDetail;

    public static final String EXTRA_NAME_CLOTHES = "extra_name_clothes";
    public static final String EXTRA_INFO_CLOTHES = "extra_info_clothes";
    public static final String EXTRA_BADGE_CLOTHES = "extra_badge_clothes";
    public static final String EXTRA_SHOP_CLOTHES = "extra_shop_clothes";
    public static final String EXTRA_PHOTO_CLOTHES = "extra_photo_clothes_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_clothes);
        imgClothesBadgeDetail = findViewById(R.id.img_badge_clothes_detail);
        imgPhotoClothesDetail = findViewById(R.id.img_clothes_item_detail);
        tvNameClothesDetail = findViewById(R.id.tv_clothes_name_detail);
        tvInfoClothesDetail = findViewById(R.id.tv_info_clothes);
        ImageButton btnOrderClothes = findViewById(R.id.btn_shop_clothes);
        ImageButton btnBackClothes = findViewById(R.id.btn_back_clothes);

        btnBackClothes.setOnClickListener(this);
        btnOrderClothes.setOnClickListener(this);

        showDetailClothesInfo();
    }

    private void showDetailClothesInfo() {
        String nameClothes = getIntent().getStringExtra(EXTRA_NAME_CLOTHES);
        String infoClothes = getIntent().getStringExtra(EXTRA_INFO_CLOTHES);
        String clothesBadge = getIntent().getStringExtra(EXTRA_BADGE_CLOTHES);
        String clothesPhoto = getIntent().getStringExtra(EXTRA_PHOTO_CLOTHES);

        tvNameClothesDetail.setText(nameClothes);
        tvInfoClothesDetail.setText(infoClothes);
        Glide.with(this).load(clothesBadge).into(imgClothesBadgeDetail);
        Glide.with(this).load(clothesPhoto).into(imgPhotoClothesDetail);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back_clothes:
                onBackPressed();
                finish();
                break;
            case R.id.btn_shop_clothes:
                String shopClothes = getIntent().getStringExtra(EXTRA_SHOP_CLOTHES);
                Intent shopClothesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(shopClothes));
                startActivity(shopClothesIntent);
                break;
        }
    }
}
