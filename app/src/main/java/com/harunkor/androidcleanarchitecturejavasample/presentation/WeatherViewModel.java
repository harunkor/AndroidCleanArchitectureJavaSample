package com.harunkor.androidcleanarchitecturejavasample.presentation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;
import com.harunkor.androidcleanarchitecturejavasample.domain.usecase.WeatherUseCase;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class WeatherViewModel extends ViewModel {

    private WeatherUseCase weatherUseCase;

    @Inject
    public WeatherViewModel(WeatherUseCase weatherUseCase){
        this.weatherUseCase = weatherUseCase;
    }

    public LiveData<WeatherModel> getWeather(String city){
        weatherUseCase.getWeather(city);
        return weatherUseCase.getCurrenWeather;
    }


}
