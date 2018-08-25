package com.coolweather.android.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linsi on 2018/8/21 22:55.
 */
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
