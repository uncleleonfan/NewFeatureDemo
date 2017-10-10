package com.example.leon.newfeaturedemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            Intent intent = new Intent(this, SlideActivity.class);
            startActivity(intent, bundle);
        }
    }
}
