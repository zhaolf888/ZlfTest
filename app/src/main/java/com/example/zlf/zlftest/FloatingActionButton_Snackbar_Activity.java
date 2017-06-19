package com.example.zlf.zlftest;/**
 * Created by Administrator on 2017/5/26 0026.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * 作者：zhaolifeng
 * 时间：2017/05/26 15:18
 * 描述：
 */
public class FloatingActionButton_Snackbar_Activity  extends AppCompatActivity{

    FloatingActionButton fab1,fab2;
    CoordinatorLayout parentView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.floatingactionbutton_activity);
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        parentView = (CoordinatorLayout) findViewById(R.id.parentView);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parentView, "SnackbarClicked", Snackbar.LENGTH_LONG).show();
            }
        });

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(parentView, "SnackbarClicked", Snackbar.LENGTH_SHORT).setAction("Test", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(FloatingActionButton_Snackbar_Activity.this,"Clicked",Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });


    }
}
