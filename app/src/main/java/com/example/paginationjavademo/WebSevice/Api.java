package com.example.paginationjavademo.WebSevice;

import com.example.paginationjavademo.POJO.StackApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface Api {
    @GET("answers")
    Call<StackApiResponse> getAnswer(@Query("page") int page,@Query("pagesize") int pagesize,@Query("site") String site);
}
