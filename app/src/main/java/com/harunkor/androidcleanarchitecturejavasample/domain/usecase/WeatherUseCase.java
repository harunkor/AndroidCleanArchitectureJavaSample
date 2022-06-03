package com.harunkor.androidcleanarchitecturejavasample.domain.usecase;

import static com.harunkor.androidcleanarchitecturejavasample.utils.Constants.KEY_API;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;
import com.harunkor.androidcleanarchitecturejavasample.domain.repository.WeatherRepository;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherUseCase {
    private WeatherRepository weatherRepository;
    private MutableLiveData<WeatherModel> getCurrenWeatherTemp = new MutableLiveData<WeatherModel>();
    public LiveData<WeatherModel> getCurrenWeather = getCurrenWeatherTemp;

    @Inject
    public WeatherUseCase(WeatherRepository weatherRepository){
        this.weatherRepository=weatherRepository;
    }


    public void  getWeather(String city){
        weatherRepository.getCurrent(city,KEY_API).enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
                getCurrenWeatherTemp.setValue(response.body());
            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {

            }
        });

    }


}
