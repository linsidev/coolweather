package com.coolweather.android.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by linsi on 2018/8/21 22:59.
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
