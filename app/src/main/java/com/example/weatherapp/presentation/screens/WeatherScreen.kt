package com.example.weatherapp.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import com.example.weatherapp.R
import com.example.weatherapp.presentation.ui.theme.MyPink
import com.example.weatherapp.presentation.ui.theme.MyPink20
import com.example.weatherapp.presentation.ui.theme.MyViolet
import com.example.weatherapp.presentation.viewmodel.MainViewModel


@Preview(showBackground = true)
@Composable
fun WeatherScreen(modifier: Modifier = Modifier, vm: MainViewModel = viewModel()) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        MainCard(vm)
        LittleCards(vm)
        HoursWeather(vm)
    }
}


@Preview(showBackground = true)
@Composable
fun MainCard(vm: MainViewModel = viewModel()) {


    Card(
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MyPink20,
        ),
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = vm.location.value,
                    fontSize = 18.sp,
                )
                Icon(
                    painter = painterResource(R.drawable.ic_search),
                    contentDescription = "Icon search"
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = vm.temperature.value,
                        fontSize = 64.sp
                    )
                    Text(
                        modifier = Modifier.padding(bottom = 5.dp),
                        text = vm.feelLikes.value,
                        fontSize = 14.sp
                    )
                }
                AsyncImage(
                    modifier = Modifier.size(46.dp),
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(vm.icon.value)
                        .crossfade(true)
                        .build(),
                    contentDescription = "Icon weather",
                    contentScale = ContentScale.FillHeight
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 25.dp, bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier
                        .size(width = 116.dp, height = 42.dp)
                        .clickable { vm.chooseToday() },
                    colors = CardDefaults.cardColors(
                        containerColor = vm.dateState.value[0],
                        contentColor = MyViolet
                    ),
                ) {
                    Text(
                        modifier = Modifier
                            .size(width = 116.dp, height = 42.dp)
                            .wrapContentHeight(Alignment.CenterVertically),
                        text = "Today",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                    )
                }
                Card(
                    modifier = Modifier
                        .size(width = 116.dp, height = 42.dp)
                        .clickable { vm.chooseTomorrow() },
                    colors = CardDefaults.cardColors(
                        containerColor = vm.dateState.value[1],
                        contentColor = Color.Black
                    ),
                ) {
                    Text(
                        modifier = Modifier
                            .size(width = 116.dp, height = 42.dp)
                            .wrapContentHeight(Alignment.CenterVertically),
                        text = "Tomorrow",
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                    )
                }
                Card(
                    modifier = Modifier.size(width = 116.dp, height = 42.dp).clickable { vm.chooseTheDayAfterTomorrow() },
                    colors = CardDefaults.cardColors(
                        containerColor = vm.dateState.value[2],
                        contentColor = Color.Black
                    ),
                ) {
                    Text(
                        modifier = Modifier
                            .size(width = 116.dp, height = 42.dp)
                            .wrapContentHeight(Alignment.CenterVertically),
                        text = "TDAT",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun LittleCards(vm: MainViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier.size(width = 194.dp, height = 65.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyPink20,
                )
            ) {
                Column(
                    modifier = Modifier.size(width = 194.dp, height = 65.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Wind speed",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = vm.wind_kph.value
                    )
                }
            }
            Card(
                modifier = Modifier.size(width = 194.dp, height = 65.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyPink20,
                )
            ) {
                Column(
                    modifier = Modifier.size(width = 194.dp, height = 65.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Humidity",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = vm.humidity.component1()
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier.size(width = 194.dp, height = 65.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyPink20,
                )
            ) {
                Column(
                    modifier = Modifier.size(width = 194.dp, height = 65.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Pressure",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = vm.pressure_mb.value
                    )
                }
            }
            Card(
                modifier = Modifier.size(width = 194.dp, height = 65.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyPink20,
                )
            ) {
                Column(
                    modifier = Modifier.size(width = 194.dp, height = 65.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "UV Index",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = vm.uvIndex.value
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun HoursWeather(vm: MainViewModel = viewModel()) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        items(count = vm.weatherList.value.size) { item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MyPink20,
                )
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(vm.weatherList.value[item].time.toString())
                    AsyncImage(
                        modifier = Modifier.size(46.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(vm.weatherList.value[item].icon)
                            .crossfade(true)
                            .build(),
                        contentDescription = "Icon weather",
                        contentScale = ContentScale.FillHeight
                    )
                    Text(vm.weatherList.value[item].temp_c.toString())
                }
            }
        }
    }
}