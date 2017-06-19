package com.example.zlf.zlftest.testRecycleView.baseadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/**
 * 多布局viewholder
 * Created by hl on 2016/11/24.
 */

public class MultiViewHolder extends RecyclerView.ViewHolder {
    public int viewType = 0;
    public MultiViewHolder(View itemView, int type) {
        super(itemView);

        switch (type) {
            case 3:
                break;
            case 2:
                break;
            case 1:
                break;
            case 0:
                break;
        }
    }
}
