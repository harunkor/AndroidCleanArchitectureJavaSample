package com.harunkor.androidcleanarchitecturejavasample.domain.repository;

import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;

import retrofit2.Call;

public interface WeatherRepository {

    Call<WeatherModel> getCurrent(String city,String key);

}
