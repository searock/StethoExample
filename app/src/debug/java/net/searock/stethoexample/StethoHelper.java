package net.searock.stethoexample;

import android.content.Context;

import com.facebook.stetho.Stetho;

public class StethoHelper {

    public void initalize(Context context){
        Stetho.initializeWithDefaults(context);
    }
}
