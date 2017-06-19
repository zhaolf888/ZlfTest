package com.example.zlf.zlftest.testRecycleView;/**
 * Created by Administrator on 2017/6/17 0017.
 */

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.zlf.zlftest.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler2;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler2;

/**
 * 作者：zhaolifeng
 * 时间：2017/06/17 11:48
 * 描述：
 */
public class TestRecycleViewActivity extends Activity implements PtrHandler2{
    Activity context;
    RecyclerView rvRecyclerview;
    PtrClassicFrameLayout refreshLayout;
    TestAdapter adapter;
    List<String> lisdataString = new ArrayList<>();
    List<TestBean> lisdata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.testrecycleview);
        rvRecyclerview = (RecyclerView) findViewById(R.id.rv_recyclerview);
        refreshLayout = (PtrClassicFrameLayout) findViewById(R.id.refresh_layout);
        refreshLayout.setMode(PtrFrameLayout.Mode.REFRESH);
        refreshLayout.setPtrHandler(this);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(rvRecyclerview.getContext(), 4, GridLayoutManager.VERTICAL, false);
        rvRecyclerview.setLayoutManager(gridLayoutManager);



        TestBean testBean = new TestBean();
        testBean.setType(1);
        lisdataString.add("测试1");
        lisdataString.add("测试2");
        lisdataString.add("测试3");
        lisdataString.add("测试4");
        lisdataString.add("测试5");
        lisdataString.add("测试6");
        lisdataString.add("测试7");
        lisdataString.add("测试8");
        testBean.setList(lisdataString);
        lisdata.add(testBean);
        testBean = new TestBean();
        testBean.setType(2);
        lisdataString.add("测试11");
        lisdataString.add("测试22");
        lisdataString.add("测试33");
        lisdataString.add("测试44");
        lisdataString.add("测试55");
        lisdataString.add("测试66");
        lisdataString.add("测试77");
        lisdataString.add("测试88");
        testBean.setList(lisdataString);
        lisdata.add(testBean);
        testBean = new TestBean();
        testBean.setType(3);
        lisdataString.add("测试111");
        lisdataString.add("测试222");
        lisdataString.add("测试333");
        lisdataString.add("测试444");
        lisdataString.add("测试555");
        lisdataString.add("测试666");
        lisdataString.add("测试777");
        lisdataString.add("测试888");
        testBean.setList(lisdataString);
        lisdata.add(testBean);
        LayoutInflater lif = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(TestAdapter.TYPE1, R.layout.recyclerview_layout);
        hashMap.put(TestAdapter.TYPE2, R.layout.recyclerview_layout);
        hashMap.put(TestAdapter.TYPE3, R.layout.recyclerview_layout);
        adapter = new TestAdapter(context,hashMap,lisdata);






    }
    @Override
    public boolean checkCanDoLoadMore(PtrFrameLayout frame, View content, View footer) {
        return PtrDefaultHandler2.checkContentCanBePulledUp(frame, content, footer);
    }

    @Override
    public void onLoadMoreBegin(PtrFrameLayout frame) {
        Toast.makeText(context,"加载更多",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
        return PtrDefaultHandler2.checkContentCanBePulledDown(frame, content, header);
    }

    @Override
    public void onRefreshBegin(PtrFrameLayout frame) {
        Toast.makeText(context,"刷新",Toast.LENGTH_SHORT).show();
    }
}
