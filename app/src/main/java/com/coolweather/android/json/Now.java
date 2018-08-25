package com.coolweather.android.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by linsi on 2018/8/21 22:43.
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
