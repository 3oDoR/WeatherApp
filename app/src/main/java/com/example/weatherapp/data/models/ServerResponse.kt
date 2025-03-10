package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class ServerResponse(
    @SerializedName("current")
    val current: Current? = null,
    @SerializedName("forecast")
    val forecast: Forecast? = null,
    @SerializedName("location")
    val location: Location? = null
)