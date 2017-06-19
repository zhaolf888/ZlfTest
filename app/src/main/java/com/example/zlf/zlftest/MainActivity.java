package com.example.zlf.zlftest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zlf.zlfviewutils.FlowLayout;
import com.zlf.zlfviewutils.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
    }

    Intent intent;
    @OnClick({R.id.bt1,R.id.bt2,R.id.bt3,R.id.bt4,R.id.bt5,R.id.bt6,R.id.bt7,R.id.bt8})
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                intent = new Intent(MainActivity.this,ColorArcProgressBarActivity.class);
                startActivity(intent);
            break;
            case R.id.bt2:
                intent = new Intent(MainActivity.this,NavigationViewActivity.class);
                startActivity(intent);
                break;
            case R.id.bt3:
                intent = new Intent(MainActivity.this,Toolbar_Actrivity.class);
                startActivity(intent);
                break;
            case R.id.bt4:
                intent = new Intent(MainActivity.this,TextInputLayout_Activity.class);
                startActivity(intent);

                break;
            case R.id.bt5:

                intent = new Intent(MainActivity.this,FloatingActionButton_Snackbar_Activity.class);
                startActivity(intent);
                break;
            case R.id.bt6:
                intent = new Intent(MainActivity.this,TabLayout_Activity.class);
                startActivity(intent);
                break;
            case R.id.bt7:
                intent = new Intent(MainActivity.this,AppBarLayout_Activity.class);
                startActivity(intent);
                break;
            case R.id.bt8:
                intent = new Intent(MainActivity.this,CollapsingToobarActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }


}
