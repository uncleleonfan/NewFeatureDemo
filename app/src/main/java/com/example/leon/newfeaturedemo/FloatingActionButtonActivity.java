package com.example.leon.newfeaturedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Leon on 0006.
 */

public class FloatingActionButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
    }

    public void onFloatingActionButtonClick(View view) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}
