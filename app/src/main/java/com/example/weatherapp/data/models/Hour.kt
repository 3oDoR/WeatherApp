package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class Hour(
    @SerializedName("chance_of_rain")
    val chance_of_rain: Int? = null,
    @SerializedName("chance_of_snow")
    val chance_of_snow: Int? = null,
    @SerializedName("cloud")
    val cloud: Int? = null,
    @SerializedName("condition")
    val condition: Condition? = null,
    @SerializedName("dewpoint_c")
    val dewpoint_c: Double? = null,
    @SerializedName("dewpoint_f")
    val dewpoint_f: Double? = null,
    @SerializedName("feelslike_c")
    val feelslike_c: Double? = null,
    @SerializedName("feelslike_f")
    val feelslike_f: Double? = null,
    @SerializedName("gust_kph")
    val gust_kph: Double? = null,
    @SerializedName("gust_mph")
    val gust_mph: Double? = null,
    @SerializedName("heatindex_c")
    val heatindex_c: Double? = null,
    @SerializedName("heatindex_f")
    val heatindex_f: Double? = null,
    @SerializedName("humidity")
    val humidity: Int? = null,
    @SerializedName("is_day")
    val is_day: Int? = null,
    @SerializedName("precip_in")
    val precip_in: Int? = null,
    @SerializedName("precip_mm")
    val precip_mm: Int? = null,
    @SerializedName("pressure_in")
    val pressure_in: Double? = null,
    @SerializedName("pressure_mb")
    val pressure_mb: Int? = null,
    @SerializedName("snow_cm")
    val snow_cm: Int? = null,
    @SerializedName("temp_c")
    val temp_c: Double? = null,
    @SerializedName("temp_f")
    val temp_f: Double? = null,
    @SerializedName("time")
    val time: String? = null,
    @SerializedName("time_epoch")
    val time_epoch: Int? = null,
    @SerializedName("uv")
    val uv: Double? = null,
    @SerializedName("vis_km")
    val vis_km: Int? = null,
    @SerializedName("vis_miles")
    val vis_miles: Int? = null,
    @SerializedName("will_it_rain")
    val will_it_rain: Int? = null,
    @SerializedName("will_it_snow")
    val will_it_snow: Int? = null,
    @SerializedName("wind_degree")
    val wind_degree: Int? = null,
    @SerializedName("wind_dir")
    val wind_dir: String? = null,
    @SerializedName("wind_kph")
    val wind_kph: Double? = null,
    @SerializedName("wind_mph")
    val wind_mph: Double? = null,
    @SerializedName("windchill_c")
    val windchill_c: Double? = null,
    @SerializedName("windchill_f")
    val windchill_f: Double? = null
)