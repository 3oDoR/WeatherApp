package com.example.weatherapp.data.api

import com.example.weatherapp.data.models.ServerResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    @GET("current.json")
    suspend fun getCurrentWeather(
        @Query("key") key: String,
        @Query("q") q: String,
        @Query("aqi") aqi: String
    ): Response<ServerResponse>

    @GET("forecast.json")
    suspend fun getForecastWeather(
        @Query("key") key: String,
        @Query("q") q: String,
        @Query("aqi") aqi: String,
        @Query("alerts") alerts: String
    ): Response<ServerResponse>
}
