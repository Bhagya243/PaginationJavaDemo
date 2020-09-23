package com.example.paginationjavademo;

import com.example.paginationjavademo.StackApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface Api {
    @GET("answers")
    public Call<StackApiResponse> getAnswer(@Query("page") int page,@Query("pagesize") int pagesize,@Query("site") String site);
}
