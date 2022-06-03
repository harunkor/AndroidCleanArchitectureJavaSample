package com.harunkor.androidcleanarchitecturejavasample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;
import com.harunkor.androidcleanarchitecturejavasample.presentation.WeatherViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private WeatherViewModel weatherViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weatherViewModel = new ViewModelProvider(this).get(WeatherViewModel.class);
        weatherViewModel.getWeather("istanbul").observe(this, new Observer<WeatherModel>() {
            @Override
            public void onChanged(WeatherModel weatherModel) {
                Log.v("DGPAYS",weatherModel.getData().get(0).getWeather().getDescription());
                Log.v("DGPAYS",weatherModel.getData().get(0).getWeather().getIcon());
                Log.v("DGPAYS",weatherModel.getData().get(0).getWeather().getCode().toString());
                Log.v("DGPAYS",weatherModel.getData().get(0).getAppTemp().toString());
                Log.v("DGPAYS",weatherModel.getData().get(0).getDatetime());

            }
        });
    }
}