package com.example.tg.niceweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tg on 2017/3/30.
 */

public class Basic  {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
