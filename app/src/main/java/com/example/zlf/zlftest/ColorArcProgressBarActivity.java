package com.example.zlf.zlftest;/**
 * Created by Administrator on 2017/5/26 0026.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * 作者：zhaolifeng
 * 时间：2017/05/26 13:58
 * 描述：
 */
public class ColorArcProgressBarActivity  extends AppCompatActivity {

    ColorArcProgressBar colorArcProgressBar,colorArcProgressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colorarcpb);
        ButterKnife.bind(this);
        colorArcProgressBar = (ColorArcProgressBar) findViewById(R.id.health_bar);
        colorArcProgressBar2 = (ColorArcProgressBar) findViewById(R.id.health_bar2);
        colorArcProgressBar.setMaxValues(1000);
        colorArcProgressBar.setCurrentValues(388);

        colorArcProgressBar.setIsNeedUnit(true);
        colorArcProgressBar.setUnit("38.8%");

        colorArcProgressBar.setIsNeedTitle(true);
        colorArcProgressBar.setTitle("彩虹进度");
        colorArcProgressBar.setIsNeedDial(true);

//        app:back_color="@android:color/darker_gray"
//        app:back_width="10dp"
//        app:front_color1="#FF0000"
//        app:front_color2="#FF7F00"
//        app:front_color3="#FFFF00"
//        app:front_color4="#00FF00"
//        app:front_color5="#00FFFF"
//        app:front_color6="#0000FF"
//        app:front_color7="#8B00FF"
//        app:front_width="13dp"
//        app:is_need_content="true"
//        app:is_need_unit="true"
//        app:max_value="100"
//        app:string_unit=""
//        app:is_need_title="true"
//        app:string_title="今日步数"
//        app:total_engle="270"


        colorArcProgressBar2.setMaxValues(1000);
        colorArcProgressBar2.setCurrentValues(688);

        colorArcProgressBar2.setDiameter(1000);
        colorArcProgressBar2.setStartAngle(150);
        colorArcProgressBar2.setTotal_engle(240);
        colorArcProgressBar2.setIsNeedUnit(true);
        colorArcProgressBar2.setUnit("68.8%");

        colorArcProgressBar2.setIsNeedTitle(true);
        colorArcProgressBar2.setTitle("彩虹进度");
        colorArcProgressBar2.setIsNeedDial(false);
    }
}
