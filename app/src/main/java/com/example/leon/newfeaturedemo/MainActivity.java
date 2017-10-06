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
}
