package com.example.zlf.zlftest;/**
 * Created by Administrator on 2017/5/26 0026.
 */

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * 作者：zhaolifeng
 * 时间：2017/05/26 14:04
 * 描述：
 */
public class NavigationViewActivity extends AppCompatActivity {
    NavigationView  mNavigationView;
    DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationview_activity);



        mNavigationView = (NavigationView) findViewById(R.id.navi_all);
        mDrawerLayout= (DrawerLayout) findViewById(R.id.drawer_laout);


        mNavigationView.getHeaderView(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NavigationViewActivity.this,"Pic",Toast.LENGTH_SHORT).show();
            }
        });

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navi_blog:
                        Toast.makeText(NavigationViewActivity.this,"Blog", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_home:
                        Toast.makeText(NavigationViewActivity.this,"Home",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.navi_notify:
                        Toast.makeText(NavigationViewActivity.this,"Notify",Toast.LENGTH_SHORT).show();
                        break;
                }
                item.setChecked(true);
                mDrawerLayout.closeDrawer(Gravity.LEFT);//外层的DrawerLayout
                return false;
            }
        });
    }
}
