package com.example.tg.niceweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tg on 2017/3/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
