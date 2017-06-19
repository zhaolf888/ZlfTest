package com.example.zlf.zlftest;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

public class CollapsingToobarActivity extends AppCompatActivity {

    private CollapsingToolbarLayout mCollapsingToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toobar);

        mCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_collaps_toolbar);
        mCollapsingToolbar.setTitle("SmallCheric-->");
        mCollapsingToolbar.setExpandedTitleColor(Color.WHITE);
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context,CollapsingToobarActivity.class));
    }
}
