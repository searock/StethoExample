package net.searock.stethoexample;

import android.app.Application;

public class StethoExampleApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();

            new StethoHelper().initalize(this);
        }
}
