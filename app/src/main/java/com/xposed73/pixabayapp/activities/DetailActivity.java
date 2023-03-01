package com.xposed73.pixabayapp.activities;

import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.xposed73.pixabayapp.R;
import com.xposed73.pixabayapp.databinding.ActivityDetailsBinding;
import com.xposed73.pixabayapp.models.PixabayImage;
import com.xposed73.pixabayapp.viewmodels.PixabayImageViewModel;



public class DetailActivity extends AppCompatActivity {

    ActivityDetailsBinding activityDetailsBinding;
    public final static String PIXABAY_IMAGE = "PIXABAY_IMAGE";
    private PixabayImage image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);
        initImage();
        activityDetailsBinding.setViewmodel(new PixabayImageViewModel(image));
    }

    private void initImage() {
        image = new Gson().fromJson(getIntent().getStringExtra(PIXABAY_IMAGE), PixabayImage.class);
    }
}
