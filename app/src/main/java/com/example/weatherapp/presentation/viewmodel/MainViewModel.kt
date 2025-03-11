package com.example.weatherapp.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.models.Card
import com.example.weatherapp.presentation.ui.theme.MyPink
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {
    private val repository = Repository()

    var dateState = mutableStateOf(listOf(MyPink, White, White))


    var location = mutableStateOf("Default")
    var temperature = mutableStateOf("°")
    var condition = mutableStateOf("Default")
    var icon = mutableStateOf("Default")
    var feelLikes = mutableStateOf("°")
    var time = mutableStateOf("Default")
    var dayTemp = mutableStateOf("Default")
    var nightTemp = mutableStateOf("Default")
    var uvIndex = mutableStateOf("Default")
    var pressure_mb = mutableStateOf("Default")
    var wind_kph = mutableStateOf("Default")
    var humidity = mutableStateOf("Default")
    var weatherList = mutableStateOf(emptyList<Card>())

    init {
        viewModelScope.launch {
            val res = repository.getForecastWeather("Saint Petersburg")
            location.value = "${res.body()?.location?.name} ${res.body()?.location?.country}"
            temperature.value = ("${res.body()?.current?.temp_c}°")
            condition.value = res.body()?.current?.condition?.text.toString()
            icon.value = "https://${res.body()?.current?.condition?.icon.toString()}"
            feelLikes.value = "Feels like ${res.body()?.current?.feelslike_c}°"
            time.value = res.body()?.current?.last_updated.toString()
            dayTemp.value = res.body()?.current?.windchill_c.toString()
            nightTemp.value = res.body()?.current?.dewpoint_c.toString()
            uvIndex.value = res.body()?.current?.uv.toString()
            pressure_mb.value = res.body()?.current?.pressure_mb.toString() + " mb"
            wind_kph.value = res.body()?.current?.wind_kph.toString() + " km/h"
            humidity.value = res.body()?.current?.humidity.toString() + "%"

            val list = ArrayList<Card>()
            res.body()?.forecast?.forecastday?.get(0)?.hour?.forEach {
                list.add(Card(
                    it.time,
                    "https:${it.condition?.icon}",
                    "${it.temp_c}°"
                ))
            }
            weatherList.value = list

        }
    }

    fun chooseToday() {
        dateState.value = listOf(MyPink, White, White)
    }
    fun chooseTomorrow() {
        dateState.value = listOf(White, MyPink, White)
    }

    fun chooseTheDayAfterTomorrow() {
        dateState.value = listOf(White, White, MyPink)
    }
}