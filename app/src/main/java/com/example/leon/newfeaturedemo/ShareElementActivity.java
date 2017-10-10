package com.example.leon.newfeaturedemo;

import android.animation.Animator;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.ArcMotion;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateInterpolator;

/**
 * Created by Leon on 0010.
 */

public class ShareElementActivity extends AppCompatActivity {

    private View mRoot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_element_activity);

        mRoot = findViewById(R.id.root);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setPathMotion(new ArcMotion());
            changeBounds.addListener(mTransitionListener);
            getWindow().setSharedElementEnterTransition(changeBounds);
        }
    }

    private Transition.TransitionListener mTransitionListener = new Transition.TransitionListener() {
        @Override
        public void onTransitionStart(Transition transition) {

        }

        @Override
        public void onTransitionEnd(Transition transition) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                animateRevealShow(mRoot);
            }
        }

        @Override
        public void onTransitionCancel(Transition transition) {

        }

        @Override
        public void onTransitionPause(Transition transition) {

        }

        @Override
        public void onTransitionResume(Transition transition) {

        }
    };


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void animateRevealShow(View viewRoot) {
        int cx = (viewRoot.getLeft() + viewRoot.getRight()) / 2;
        int cy = (viewRoot.getTop() + viewRoot.getBottom()) / 2;
        int finalRadius = Math.max(viewRoot.getWidth(), viewRoot.getHeight());

        Animator anim = ViewAnimationUtils.createCircularReveal(viewRoot, cx, cy, 0, finalRadius);
        viewRoot.setVisibility(View.VISIBLE);
        anim.setDuration(1000);
        anim.setInterpolator(new AccelerateInterpolator());
        anim.start();
    }
}
