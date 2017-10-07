package com.example.leon.newfeaturedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Leon on 0007.
 */

public class BottomSheetDialogActivity extends AppCompatActivity {

    private BottomSheetDialog mBottomSheetDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_dialog);
    }

    public void onShowBottomSheetDialog(View view) {

        mBottomSheetDialog = new BottomSheetDialog(this);
        mBottomSheetDialog.setContentView(R.layout.view_bottom_sheet);
        mBottomSheetDialog.show();

    }

    public void onHelloWorld(View view) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
        mBottomSheetDialog.dismiss();
    }
}
