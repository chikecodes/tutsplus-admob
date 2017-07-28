package com.chikeandroid.tutsplus_admob;

import com.google.android.gms.ads.MobileAds;

import android.app.Application;

/**
 * Created by Chike on 7/26/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
    }
}
