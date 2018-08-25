package com.coolweather.android.util;


import android.icu.util.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtils {
    private final static int CONN_TIMEOUT = 10;
    private final static int READ_TIMEOUT = 10;
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
