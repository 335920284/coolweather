package com.example.dong.coolweather.util;

import android.app.DownloadManager;

import okhttp3.OkHttpClient;

/**
 * Created by dong on 2018/3/5.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
