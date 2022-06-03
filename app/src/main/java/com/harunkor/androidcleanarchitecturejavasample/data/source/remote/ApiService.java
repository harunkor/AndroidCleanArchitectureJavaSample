package com.harunkor.androidcleanarchitecturejavasample.data.source.remote;

import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("current")
    Call<WeatherModel> getWeather(@Query("city") String city, @Query("key") String key);

}
