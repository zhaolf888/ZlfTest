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

    public List<itemInfoBean> list;
    public int type;
   public String  imgUrl="http://pic.sogou.com/d?query=%CD%BC%C6%AC%B4%F3%C8%AB%CE%A8%C3%C0&st=255&mode=255&did=16#did15";
    public String itemId="cs";
    public String status="1";
    public String itemName="测试";
    public List<itemInfoBean> getList() {
        return list;
    }

    public void setList(List<itemInfoBean> list) {
        this.list = list;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
