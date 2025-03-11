package com.example.weatherapp.presentation.viewmodel

import com.example.weatherapp.data.api.RetrofitClient
import com.example.weatherapp.data.models.ServerResponse
import com.example.weatherapp.utils.Util
import retrofit2.Response

class Repository {

    suspend fun getCurrentWeatherList(city: String): Response<ServerResponse> {
        return RetrofitClient.retrofit.getCurrentWeather(Util.API_KEY, city, "no")
    }

    suspend fun getForecastWeather(city: String): Response<ServerResponse> {
        return RetrofitClient.retrofit.getForecastWeather(Util.API_KEY, city, "no", "no")
    }

}