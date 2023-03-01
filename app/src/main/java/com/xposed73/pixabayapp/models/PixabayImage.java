package com.xposed73.pixabayapp.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;
import com.xposed73.pixabayapp.constants.PixabayImageType;


public class PixabayImage {

    private final int previewHeight;
    private final int likes;
    private final int favorites;
    private final String tags;
    private final int webformatHeight;
    private final long views;
    private final int webformatWidth;
    private final int previewWidth;
    private final int comments;
    private final long downloads;
    private final String pageURL;
    private final String previewURL;
    private final String webformatURL;
    private final int imageWidth;

    @SerializedName("user_id")
    private final long userId;
    private final String user;
    private final PixabayImageType type;
    private final long id;
    private final String userImageURL;
    private final int imageHeight;

    public PixabayImage(int previewHeight,
                        int likes,
                        int favorites,
                        String tags,
                        int webformatHeight,
                        long views,
                        int webformatWidth,
                        int previewWidth,
                        int comments,
                        long downloads,
                        String pageURL,
                        String previewURL,
                        String webformatURL,
                        int imageWidth,
                        long userId,
                        String user,
                        PixabayImageType type,
                        long id,
                        String userImageURL,
                        int imageHeight) {

        this.previewHeight = previewHeight;
        this.likes = likes;
        this.favorites = favorites;
        this.tags = tags;
        this.webformatHeight = webformatHeight;
        this.views = views;
        this.webformatWidth = webformatWidth;
        this.previewWidth = previewWidth;
        this.comments = comments;
        this.downloads = downloads;
        this.pageURL = pageURL;
        this.previewURL = previewURL;
        this.webformatURL = webformatURL;
        this.imageWidth = imageWidth;
        this.userId = userId;
        this.user = user;
        this.type = type;
        this.id = id;
        this.userImageURL = userImageURL;
        this.imageHeight = imageHeight;
    }

    public int getPreviewHeight() {
        return previewHeight;
    }

    public String getLikes() {
        return String.valueOf(likes);
    }

    public String getFavorites() {
        return String.valueOf(favorites);
    }

    public String getTags() {
        if (tags == null) return "";
        if (tags.contains(", ")) {
            String[] splitTags = tags.toUpperCase().split(", ");
            return TextUtils.join(" - ", splitTags);
        } else return tags;
    }

    public int getWebformatHeight() {
        return webformatHeight;
    }

    public long getViews() {
        return views;
    }

    public int getWebformatWidth() {
        return webformatWidth;
    }

    public int getPreviewWidth() {
        return previewWidth;
    }

    public String getComments() {
        return String.valueOf(comments);
    }

    public long getDownloads() {
        return downloads;
    }

    public String getPageURL() {
        return pageURL;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public String getWebformatURL() {
        return webformatURL;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public long getUserId() {
        return userId;
    }

    public String getUser() {
        return "By: " + user;
    }

    public PixabayImageType getType() {
        return type;
    }

    public long getId() {
        return id;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public int getImageHeight() {
        return imageHeight;
    }

}