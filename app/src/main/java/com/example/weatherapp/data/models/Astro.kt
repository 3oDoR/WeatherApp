package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class Astro(
    @SerializedName("is_moon_up")
    val is_moon_up: Int? = null,
    @SerializedName("is_sun_up")
    val is_sun_up: Int? = null,
    @SerializedName("moon_illumination")
    val moon_illumination: Int? = null,
    @SerializedName("moon_phase")
    val moon_phase: String? = null,
    @SerializedName("moonrise")
    val moonrise: String? = null,
    @SerializedName("moonset")
    val moonset: String? = null,
    @SerializedName("sunrise")
    val sunrise: String? = null,
    @SerializedName("sunset")
    val sunset: String? = null
)