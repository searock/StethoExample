package net.searock.stethoexample.remote;

import net.searock.stethoexample.OkHttpHelper;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {

    public Retrofit getRetrofit(String url){

        OkHttpClient okHttpClient = new OkHttpHelper().initalize();

        return new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
