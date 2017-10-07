package com.example.leon.newfeaturedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.leon.newfeaturedemo.adapter.RecyclerViewListAdapter;

/**
 * Created by Leon on 0006.
 */

public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerViewListAdapter(this));

    }

    public void onFloatingActionButtonClick(View view) {
        Snackbar.make(findViewById(R.id.coordinator_layout), R.string.app_name, 2000)
                .setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(CoordinatorLayoutActivity.this, "Action Click", Toast.LENGTH_SHORT).show();
                    }
                })
                .setText("Message")
                .show();
    }
}
