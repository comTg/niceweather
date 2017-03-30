package com.example.tg.niceweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tg on 2017/3/30.
 */

public class Weather {
    public String staus;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
