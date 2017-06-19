package com.example.zlf.zlftest.testRecycleView;/**
 * Created by Administrator on 2017/6/17 0017.
 */

import android.content.Context;

import com.example.zlf.zlftest.testRecycleView.baseadapter.ItemLineartHolder;
import com.zlf.zlfviewutils.MyBaseRecyclerAdapter;

import java.util.HashMap;
import java.util.List;

/**
 * 作者：zhaolifeng
 * 时间：2017/06/17 11:44
 * 描述：
 */
public class TestAdapter extends  MyBaseRecyclerAdapter<TestBean> {
    public TestAdapter(Context context, HashMap<Integer, Integer> layoutIds, List<TestBean> data) {
        super(context, layoutIds, data);
    }

    public static final int TYPE1= 1;//
    public static final int TYPE2 = 2;  //
    public static final int TYPE3 = 3;  //

    @Override
    public int getType(int position) {
        return data.get(position).getType();
    }


    @Override
    protected void onInitViewHolder(MyBaseRecyclerAdapter.InnerBaseViewHolder holder, int viewType) {
        ItemLineartHolder lineartHolder = null;
          holder.getTag();
        switch (viewType) {
            case    TYPE1:
                lineartHolder = new FlashSaleView(holder.itemView,1);
                break;
            case TYPE2:
                lineartHolder = new FlashSaleView(holder.itemView,2);
                break;
            case TYPE3:
                lineartHolder = new FlashSaleView(holder.itemView,3);
            default:
                break;
        }
        holder.setTag(lineartHolder);
    }


    @Override
    public void convert(MyBaseRecyclerAdapter.InnerBaseViewHolder holder, TestBean list, int position, int itemType) {
        ItemLineartHolder tag = (ItemLineartHolder) holder.getTag();
        switch (itemType) {
            case TYPE1://FlashSaleView
            case TYPE2://PreSaleView
            case TYPE3://RushShopView
                tag.onRefresh(list);
                break;
            default:
                break;
        }
    }
}
