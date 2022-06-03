package com.harunkor.androidcleanarchitecturejavasample.data.repository;

import com.harunkor.androidcleanarchitecturejavasample.data.source.remote.ApiService;
import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;
import com.harunkor.androidcleanarchitecturejavasample.domain.repository.WeatherRepository;

import retrofit2.Call;

public class WeatherRepositoryImp implements WeatherRepository {

    private ApiService apiService;

    public WeatherRepositoryImp(ApiService apiService){
        this.apiService = apiService;
    }

    @Override
    public Call<WeatherModel> getCurrent(String city, String key) {
        return apiService.getWeather(city,key);
    }
}
