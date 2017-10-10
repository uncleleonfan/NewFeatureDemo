package com.example.leon.newfeaturedemo;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Visibility;

/**
 * Created by Leon on 0010.
 */

public class FadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Fade fade = new Fade(Visibility.MODE_IN);
            fade.setDuration(1000);
            getWindow().setEnterTransition(fade);
        }

    }
}
