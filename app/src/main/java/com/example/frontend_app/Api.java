package com.example.frontend_app;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @POST("signup")
    Call<ResponseBody> register(
            @Query("login") String login,
            @Query("email") String email,
            @Query("password") String password
    );

    @GET("login")
    Call<ResponseBody> authorization(
            @Query("email") String email,
            @Query("password") String password
    );
}

