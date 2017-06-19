package com.example.zlf.zlftest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * 作者：zhaolifeng
 * 时间：2017/05/26 15:35
 * 描述：
 */
public class AppBarLayout_Activity extends AppCompatActivity {
    private Toolbar mToolbar;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appbarlayout_activity);

        initToolbar();
        initViewpager();
    }

    private void initViewpager() {
        FragmentManager fm = getSupportFragmentManager();
        mTabLayout = (TabLayout) findViewById(R.id.appbar_tab_layout);
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab2"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab3"));
        mViewPager = (ViewPager) findViewById(R.id.appbar_viewpager);
        mViewPager.setAdapter(new MyCusAdapter(fm));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("AppbarLayout");
        mToolbar.setNavigationIcon(R.mipmap.back);
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, AppBarLayout_Activity.class));
    }

    class MyCusAdapter extends FragmentPagerAdapter {

        private String tabTitles[] = new String[]{"tab1", "tab2", "tab3"};

        public MyCusAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new AppbarFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

    }
}