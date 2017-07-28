package com.chikeandroid.tutsplus_admob;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Chike on 7/27/2017.
 */

public class NativeExpressAdActivity extends AppCompatActivity {

    NativeExpressAdView mNativeExpressAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_ad);

        mNativeExpressAdView = (NativeExpressAdView) findViewById(R.id.adView);

        AdRequest.Builder adRequestBuilder = new AdRequest.Builder();
        adRequestBuilder.addTestDevice(AdRequest.DEVICE_ID_EMULATOR);

        mNativeExpressAdView.loadAd(adRequestBuilder.build());
    }

    @Override
    public void onResume() {
        super.onResume();
        mNativeExpressAdView.resume();
    }

    @Override
    public void onPause() {
        mNativeExpressAdView.pause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mNativeExpressAdView.destroy();
        super.onDestroy();
    }
}
