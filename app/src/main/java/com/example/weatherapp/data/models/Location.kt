package com.example.weatherapp.data.models

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("lat")
    val lat: Double? = null,
    @SerializedName("localtime")
    val localtime: String? = null,
    @SerializedName("localtime_epoch")
    val localtime_epoch: Int? = null,
    @SerializedName("lon")
    val lon: Double? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("region")
    val region: String? = null,
    @SerializedName("tz_id")
    val tz_id: String? = null
)