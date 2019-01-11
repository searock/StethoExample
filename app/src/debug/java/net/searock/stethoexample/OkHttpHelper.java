package net.searock.stethoexample;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;

public class OkHttpHelper {

    public OkHttpClient initalize(){

        return new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();
    }
}
