package com.roniokta.submissionapp.activity.detailmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.roniokta.submissionapp.R;

public class DetailWatchActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imgWatchesBadgeDetail, imgPhotoWatchesDetail;
    private TextView tvNameWatchesDetail, tvInfoWatchesDetail;
    
    public static final String EXTRA_NAME_WATCHES = "extra_name_watches";
    public static final String EXTRA_INFO_WATCHES = "extra_info_watches";
    public static final String EXTRA_BADGE_WATCHES= "extra_badge_watches";
    public static final String EXTRA_SHOP_WATCHES = "extra_shop_watches";
    public static final String EXTRA_PHOTO_WATCHES = "extra_photo_watches";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_watch);
        imgWatchesBadgeDetail = findViewById(R.id.img_badge_watches_detail);
        imgPhotoWatchesDetail = findViewById(R.id.img_watches_photo_detail);
        tvNameWatchesDetail = findViewById(R.id.tv_watches_name_detail);
        tvInfoWatchesDetail = findViewById(R.id.tv_info_watches);

        ImageButton btnBackWatches = findViewById(R.id.btn_back_watches);
        ImageButton btnShopWatches = findViewById(R.id.btn_shop_watches);
        
        btnBackWatches.setOnClickListener(this);
        btnShopWatches.setOnClickListener(this);
        
        showWatchDetail();
        
        
    }
    private void showWatchDetail() {
        String nameWatches = getIntent().getStringExtra(EXTRA_NAME_WATCHES);
        String infoWatches = getIntent().getStringExtra(EXTRA_INFO_WATCHES);
        String watchesBadge = getIntent().getStringExtra(EXTRA_BADGE_WATCHES);
        String watchesPhoto = getIntent().getStringExtra(EXTRA_PHOTO_WATCHES);

        tvNameWatchesDetail.setText(nameWatches);
        tvInfoWatchesDetail.setText(infoWatches);
        Glide.with(this).load(watchesBadge).into(imgWatchesBadgeDetail);
        Glide.with(this).load(watchesPhoto).into(imgPhotoWatchesDetail);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_back_watches:
                onBackPressed();
                finish();
                break;
            case R.id.btn_shop_watches:
                String shopWatches = getIntent().getStringExtra(EXTRA_SHOP_WATCHES);
                Intent shopWatchesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(shopWatches));
                startActivity(shopWatchesIntent);
                break;
        }
        
    }
}
