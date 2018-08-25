package com.coolweather.android.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linsi on 2018/8/21.
 */
public class Basic {
    @SerializedName("city") // 注解 将json中的数据解析为注解的字段
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
