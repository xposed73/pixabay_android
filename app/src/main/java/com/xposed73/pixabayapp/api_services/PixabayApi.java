package com.xposed73.pixabayapp.api_services;

import com.xposed73.pixabayapp.models.PixabayImageList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayApi {

    @GET("/api/")
    Call<PixabayImageList> getImageResults(@Query("key") String key, @Query("q") String query, @Query("page") int page, @Query("per_page") int perPage);
}
