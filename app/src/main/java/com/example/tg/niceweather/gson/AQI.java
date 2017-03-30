package com.example.tg.niceweather.gson;

/**
 * Created by tg on 2017/3/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
