package com.example.weatherapp.data.api

import com.example.weatherapp.utils.Util
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



object RetrofitClient {

    var retrofit: WeatherService = Retrofit.Builder()
        .baseUrl(Util.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(WeatherService::class.java)
}