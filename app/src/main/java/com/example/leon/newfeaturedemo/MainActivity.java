package com.example.leon.newfeaturedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartToolbarActivity(View view) {
        Intent intent = new Intent(this, ToolbarActivity.class);
        startActivity(intent);
    }

    public void onStartCardViewActivity(View view) {
        Intent intent = new Intent(this, CardViewActivity.class);
        startActivity(intent);
    }

    public void onStartRecyclerViewListActivity(View view) {
        Intent intent = new Intent(this, RecyclerViewListActivity.class);
        startActivity(intent);
    }

    public void onStartRecyclerViewGridActivity(View view) {
        Intent intent = new Intent(this, RecyclerViewGridActivity.class);
        startActivity(intent);
    }

    public void onStartRecyclerViewStaggeredGridActivity(View view) {
        Intent intent = new Intent(this, RecyclerViewStaggeredActivity.class);
        startActivity(intent);
    }

    public void onStartFloatingActionButtonActivity(View view) {
        Intent intent = new Intent(this, FloatingActionButtonActivity.class);
        startActivity(intent);
    }

    public void onStartSnackbarActivity(View view) {
        Intent intent = new Intent(this, SnackbarActivity.class);
        startActivity(intent);
    }

    public void onStartCoordinatorLayoutActivity(View view) {
        Intent intent = new Intent(this, CoordinatorLayoutActivity.class);
        startActivity(intent);
    }

    public void onStartAppBarLayoutActivity(View view) {
        Intent intent = new Intent(this, AppBarLayoutActivity.class);
        startActivity(intent);
    }

    public void onStartCollapsingToolbarLayout(View view) {
        Intent intent = new Intent(this, CollapsingToolbarLayoutActivity.class);
        startActivity(intent);
    }

    public void onStartBottomNavigationView(View view) {
        Intent intent = new Intent(this, BottomNavigationViewActivity.class);
        startActivity(intent);
    }

    public void onStartBottomSheetDialog(View view) {
        Intent intent = new Intent(this, BottomSheetDialogActivity.class);
        startActivity(intent);
    }

    public void onStartTextInputLayout(View view) {
        Intent intent = new Intent(this, TextInputLayoutActivity.class);
        startActivity(intent);
    }

    public void onStartSwipeRefreshLayoutActivity(View view) {
        Intent intent = new Intent(this, SwipeRefreshLayoutActivity.class);
        startActivity(intent);
    }

    public void onStartTabLayoutActivity(View view) {
        Intent intent = new Intent(this, TabLayoutActivity.class);
        startActivity(intent);
    }

    public void onStartElevationAndShadows(View view) {
        Intent intent = new Intent(this, ElevationAndShadowsActivity.class);
        startActivity(intent);
    }

    public void onStartRippleActivity(View view) {
        Intent intent = new Intent(this, RippleActivity.class);
        startActivity(intent);
    }
}
