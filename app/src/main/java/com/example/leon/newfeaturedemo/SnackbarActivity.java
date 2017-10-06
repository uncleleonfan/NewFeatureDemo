package com.example.leon.newfeaturedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by Leon on 0006.
 */

public class SnackbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
    }

    public void onShowSnackbar(View view) {
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        Snackbar.make(frameLayout, R.string.app_name, 2000)
                .setAction("Action", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackbarActivity.this, "Action Click", Toast.LENGTH_SHORT).show();
                    }
                })
                .setText("Message")
                .show();
    }
}
