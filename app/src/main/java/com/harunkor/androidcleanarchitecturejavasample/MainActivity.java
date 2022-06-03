package com.harunkor.androidcleanarchitecturejavasample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.harunkor.androidcleanarchitecturejavasample.domain.model.WeatherModel;
import com.harunkor.androidcleanarchitecturejavasample.presentation.WeatherViewModel;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private WeatherViewModel weatherViewModel;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.result);
        weatherViewModel = new ViewModelProvider(this).get(WeatherViewModel.class);
        weatherViewModel.getWeather("istanbul").observe(this, new Observer<WeatherModel>() {
            @Override
            public void onChanged(WeatherModel weatherModel) {
                textView.append(weatherModel.getData().get(0).getWeather().getDescription()+"\n");
                textView.append(weatherModel.getData().get(0).getWeather().getIcon()+"\n");
                textView.append(weatherModel.getData().get(0).getWeather().getCode().toString()+"\n");
                textView.append(weatherModel.getData().get(0).getAppTemp().toString()+"\n");
                textView.append(weatherModel.getData().get(0).getDatetime()+"\n");
                textView.append(weatherModel.getData().get(0).getCityName()+"\n");
                textView.append(weatherModel.getData().get(0).getClouds().toString()+"\n");
                textView.append(weatherModel.getData().get(0).getStation()+"\n");
                textView.append(weatherModel.getData().get(0).getSunrise()+"\n");
                textView.append(weatherModel.getData().get(0).getSunset()+"\n");
                textView.append(weatherModel.getData().get(0).getClouds()+"\n");
                textView.append(weatherModel.getData().get(0).getSolarRad()+"\n");

            }
        });
    }
}