package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class Day(
    @SerializedName("avghumidity")
    val avghumidity: Int? = null,
    @SerializedName("avgtemp_c")
    val avgtemp_c: Double? = null,
    @SerializedName("avgtemp_f")
    val avgtemp_f: Double? = null,
    @SerializedName("avgvis_km")
    val avgvis_km: Int? = null,
    @SerializedName("avgvis_miles")
    val avgvis_miles: Int? = null,
    @SerializedName("condition")
    val condition: Condition? = null,
    @SerializedName("daily_chance_of_rain")
    val daily_chance_of_rain: Int? = null,
    @SerializedName("daily_chance_of_snow")
    val daily_chance_of_snow: Int? = null,
    @SerializedName("daily_will_it_rain")
    val daily_will_it_rain: Int? = null,
    @SerializedName("daily_will_it_snow")
    val daily_will_it_snow: Int? = null,
    @SerializedName("maxtemp_c")
    val maxtemp_c: Double? = null,
    @SerializedName("maxtemp_f")
    val maxtemp_f: Double? = null,
    @SerializedName("maxwind_kph")
    val maxwind_kph: Double? = null,
    @SerializedName("maxwind_mph")
    val maxwind_mph: Double? = null,
    @SerializedName("mintemp_c")
    val mintemp_c: Double? = null,
    @SerializedName("mintemp_f")
    val mintemp_f: Double? = null,
    @SerializedName("totalprecip_in")
    val totalprecip_in: Int? = null,
    @SerializedName("totalprecip_mm")
    val totalprecip_mm: Int? = null,
    @SerializedName("totalsnow_cm")
    val totalsnow_cm: Int? = null,
    @SerializedName("uv")
    val uv: Double? = null
)