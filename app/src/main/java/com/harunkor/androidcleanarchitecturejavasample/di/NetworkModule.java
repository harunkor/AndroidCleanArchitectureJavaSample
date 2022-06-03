package com.harunkor.androidcleanarchitecturejavasample.di;

import static com.harunkor.androidcleanarchitecturejavasample.utils.Constants.BASE_URL;

import com.harunkor.androidcleanarchitecturejavasample.data.repository.WeatherRepositoryImp;
import com.harunkor.androidcleanarchitecturejavasample.data.source.remote.ApiService;
import com.harunkor.androidcleanarchitecturejavasample.domain.repository.WeatherRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@InstallIn(SingletonComponent.class)
@Module
public class NetworkModule {

    @Provides
    @Singleton
    public GsonConverterFactory provideGsonConverterFactory() {
        return GsonConverterFactory.create();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(GsonConverterFactory gsonConverterFactory) {
         return  new Retrofit.Builder()
                 .baseUrl(BASE_URL)
                 .addConverterFactory(gsonConverterFactory)
                 .build();
    }

    @Provides
    @Singleton
    public ApiService provideService(Retrofit retrofit){
        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    public WeatherRepository provideWeatherRepository(ApiService apiService){
        return new WeatherRepositoryImp(apiService);
    }


}
