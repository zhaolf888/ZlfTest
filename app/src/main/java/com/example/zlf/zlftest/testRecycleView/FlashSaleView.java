package com.example.zlf.zlftest.testRecycleView;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.example.zlf.zlftest.R;
import com.example.zlf.zlftest.testRecycleView.baseadapter.ItemLineartHolder;


/**
 * Created by Daimhim on 2016/11/2.
 */

public class FlashSaleView extends ItemLineartHolder {

    int type;

    public FlashSaleView(View itemView) {
        super(itemView);
    }

    public FlashSaleView(View itemView, int type) {
        super(itemView);
        this.type = type;
    }

    @Override
    public int getColumnCount() {
        return super.getColumnCount();
    }

    @Override
    protected void initItemView(View view) {
        initView(view);
        ivTitleTop.setVisibility(View.VISIBLE);
        ivTitleTop.setImageResource(R.drawable.loding_icon);
        line.setVisibility(View.GONE);
        rl_title.setOnClickListener(this);
        tv_title_left.setVisibility(View.GONE);
        tv_title_right.setVisibility(View.VISIBLE);
        tv_title_right.setText("更多");
        tv_title_right.setTextColor(ContextCompat.getColor(mContext, android.R.color.black));
        tv_title_right.setCompoundDrawablesWithIntrinsicBounds(null, null, ContextCompat.getDrawable(mContext, R.drawable.clear), null);
        mRecyclerAdapter.setCount(10);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_title: //跳转到

                break;
        }
    }


    @Override
    public int getItemViewType(int position, itemInfoBean itemInfoBean) {
        if (type == 1) {
            if (position < 2) {
                return TYPE_RIGHT_IMG;
            } else {
                return TYPE_UP_IMG;
            }
        } else if (type == 2) {
            if (position < 4) {
                return TYPE_UP_IMG;
            } else {
                return TYPE_RIGHT_IMG;
            }
        } else if (type == 3) {
            if (position < 6) {
                return TYPE_RIGHT_IMG;
            } else {
                return TYPE_UP_IMG;
            }

        }
        return TYPE_UP_IMG;
    }
}