package com.example.zlf.zlftest.testRecycleView;/**
 * Created by Administrator on 2017/6/17 0017.
 */

import java.io.Serializable;
import java.util.List;

/**
 * 作者：zhaolifeng
 * 时间：2017/06/17 15:28
 * 描述：
 */
public class TestBean implements Serializable{

    public List<String> list;
    public int type;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
