package com.ogiwan.myapplication.service

import com.ogiwan.myapplication.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    //http://api.openweathermap.org/data/2.5/weather?q=bingöl&APPID=0fbbd10db61f0a5d06b6b36d3cdcde16

    @GET("data/2.5/weather?&units=metric&APPID=0fbbd10db61f0a5d06b6b36d3cdcde16")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}