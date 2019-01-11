package net.searock.stethoexample;

import okhttp3.OkHttpClient;

public class OkHttpHelper {

    public OkHttpClient initalize(){

        return new OkHttpClient.Builder()
                .build();
    }
}
