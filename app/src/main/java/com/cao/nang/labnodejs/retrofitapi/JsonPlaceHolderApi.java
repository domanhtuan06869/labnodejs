package com.cao.nang.labnodejs.retrofitapi;

import com.cao.nang.labnodejs.Tinh;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    @GET("")
    Call<List<Tinh>> getPosts();

    @GET("/tinh ")
    Call<Integer> tinhPost(
            @Query("soa") int soa,
            @Query("sob") int sob
           );


}

