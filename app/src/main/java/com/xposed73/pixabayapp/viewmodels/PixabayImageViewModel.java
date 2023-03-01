package com.xposed73.pixabayapp.viewmodels;

import android.content.Intent;
import androidx.databinding.BaseObservable;
import androidx.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.xposed73.pixabayapp.R;
import com.xposed73.pixabayapp.activities.DetailActivity;
import com.xposed73.pixabayapp.models.PixabayImage;


public class PixabayImageViewModel extends BaseObservable {
    private final PixabayImage pixabayImage;

    public PixabayImageViewModel(PixabayImage pixabayImage) {
        this.pixabayImage = pixabayImage;
    }

    public String getTags() {
        return pixabayImage.getTags();
    }

    public String getImageUrl() {
        return pixabayImage.getPreviewURL();
    }

    public String getHighResImageUrl() {
        return pixabayImage.getWebformatURL();
    }

    public String getLikes() {
        return pixabayImage.getLikes();
    }

    public String getComments() {
        return pixabayImage.getComments();
    }

    public String getFavorites() {
        return pixabayImage.getFavorites();
    }

    public String getUserName() {
        return pixabayImage.getUser();
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .placeholder(R.drawable.ic_image_placeholder)

                .into(view);
    }

    public View.OnClickListener openDetails() {
        return v -> {
            Intent i = new Intent(v.getContext(), DetailActivity.class);
            String serialized = new Gson().toJson(pixabayImage);
            i.putExtra(DetailActivity.PIXABAY_IMAGE, serialized);
            v.getContext().startActivity(i);
        };
    }
}
