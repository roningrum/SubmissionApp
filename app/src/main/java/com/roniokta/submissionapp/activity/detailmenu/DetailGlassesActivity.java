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

public class DetailGlassesActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imgGlassesBadgeDetail, imgPhotoGlassesDetail;
    private TextView tvNameGlassesDetail, tvInfoGlassesDetail;

    public static final String EXTRA_NAME_GLASSES = "extra_name_glasses";
    public static final String EXTRA_INFO_GLASSES = "extra_info_glasses";
    public static final String EXTRA_BADGE_GLASSES = "extra_badge_glasses";
    public static final String EXTRA_SHOP_GLASSES = "extra_shop_glaases";
    public static final String EXTRA_PHOTO_GLASSES = "extra_photo_glasses";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_glasses);
        imgGlassesBadgeDetail = findViewById(R.id.img_badge_glasses_detail);
        imgPhotoGlassesDetail = findViewById(R.id.img_glasses_item_detail);
        tvNameGlassesDetail = findViewById(R.id.tv_glasses_name_detail);
        tvInfoGlassesDetail = findViewById(R.id.tv_info_glasses);
        ImageButton btnOrderGlasses = findViewById(R.id.btn_shop_glasses);
        ImageButton btnBackGlasses = findViewById(R.id.btn_back_glasses);

        btnOrderGlasses.setOnClickListener(this);
        btnBackGlasses.setOnClickListener(this);

        showDetailGlassesInfo();

    }

    private void showDetailGlassesInfo() {
        String nameGlasses = getIntent().getStringExtra(EXTRA_NAME_GLASSES);
        String infoGlasses = getIntent().getStringExtra(EXTRA_INFO_GLASSES);
        String glassesBadges = getIntent().getStringExtra(EXTRA_BADGE_GLASSES);
        String glassesPhoto = getIntent().getStringExtra(EXTRA_PHOTO_GLASSES);

        tvNameGlassesDetail.setText(nameGlasses);
        tvInfoGlassesDetail.setText(infoGlasses);
        Glide.with(this).load(glassesBadges).into(imgGlassesBadgeDetail);
        Glide.with(this).load(glassesPhoto).into(imgPhotoGlassesDetail);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_back_glasses:
                onBackPressed();
                finish();
                break;
            case R.id.btn_shop_glasses:
                String shopGlasses = getIntent().getStringExtra(EXTRA_SHOP_GLASSES);
                Intent shopGlassesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(shopGlasses));
                startActivity(shopGlassesIntent);
                break;
        }
    }
}
