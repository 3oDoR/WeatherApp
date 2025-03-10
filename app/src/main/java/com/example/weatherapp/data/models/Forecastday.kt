package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class Forecastday(
    @SerializedName("astro")
    val astro: Astro? = null,
    @SerializedName("date")
    val date: String? = null,
    @SerializedName("date_epoch")
    val date_epoch: Int? = null,
    @SerializedName("day")
    val day: Day? = null,
    @SerializedName("hour")
    val hour: List<Hour>? = null
)