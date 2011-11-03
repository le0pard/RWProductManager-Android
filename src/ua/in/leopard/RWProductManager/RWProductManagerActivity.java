package ua.in.leopard.RWProductManager;

import com.phonegap.*;
import android.os.Bundle;

public class RWProductManagerActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/android/index.html");
    }
}