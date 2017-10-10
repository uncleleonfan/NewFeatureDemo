package com.example.leon.newfeaturedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Leon on 0010.
 */

public class TransitionAnimationActivity extends AppCompatActivity {

    private static final String TAG = "TransitionAnimationActi";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_animation);
    }

    public void onSlide(View view) {
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(this, SlideActivity.class);
        ActivityCompat.startActivity(this, intent, activityOptionsCompat.toBundle());
    }

    public void onFade(View view) {
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle();
        Intent intent = new Intent(this, FadeActivity.class);
        ActivityCompat.startActivity(this, intent, bundle);
    }

    public void onExplode(View view) {
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle();
        Intent intent = new Intent(this, ExplodeActivity.class);
        ActivityCompat.startActivity(this, intent, bundle);
    }

    public void onShareElement(View view) {
        Bundle bundle = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this, view, getString(R.string.red_name))
                .toBundle();
        Intent intent = new Intent(this, ShareElementActivity.class);
        ActivityCompat.startActivity(this, intent, bundle);
    }
}
