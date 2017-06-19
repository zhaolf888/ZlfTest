package com.example.zlf.zlftest.testRecycleView;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/4.
 */
public class itemInfoBean implements Serializable,Comparable<itemInfoBean> {


    public String createTime;
    public String endTime;//抢购结束时间
    public String itemName="栏目名称";//栏目名称
    public String itemId="id";//栏目id
    public String goodsName="商品名称";//商品名称
    public String goodsId="id";//商品id
    public String goodsImg="http://pic.sogou.com/d?query=%CD%BC%C6%AC%B4%F3%C8%AB%CE%A8%C3%C0&st=255&mode=255&did=16#did15";//商品图片
    public String goodsPrice="8.88";//商品价格
    public String goodsUnit="斤";//商品单位
    public String leftTime;//系统时间
    public String sendTime;//发货时间
    public String origin="产地";//产地
    public String isNew="0";//是否新品:0:是；1：否
    public String goodsCate="商品分类";//商品分类
    public String featureId="特色馆id";//特色馆id
    public String featureName="特色馆名称";//特色馆名称
    public String featureSrc;//特色馆图片
    public String featureDesc;//特色馆描述
    public long surplusTime=1000000l;//剩余时间的秒数
    public String imgUrl="http://pic.sogou.com/d?query=%CD%BC%C6%AC%B4%F3%C8%AB%CE%A8%C3%C0&st=255&mode=255&did=16#did15";//图片url
    public String status="0";//0默认1推荐中
    public String goodsSpecCount="99";//商品数量
    public String orderSource="0";//0:1
    public String isConsumer="1"; //0无 1有
    public String defaultSpecName="商品规格";//商品规格
    @Override
    public String toString() {
        return "itemInfoBean{" +
                "createTime='" + createTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemId='" + itemId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", leftTime='" + leftTime + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", origin='" + origin + '\'' +
                ", isNew='" + isNew + '\'' +
                ", goodsCate='" + goodsCate + '\'' +
                ", featureId='" + featureId + '\'' +
                ", featureName='" + featureName + '\'' +
                ", featureSrc='" + featureSrc + '\'' +
                ", featureDesc='" + featureDesc + '\'' +
                ", surplusTime=" + surplusTime +
                ", imgUrl='" + imgUrl + '\'' +
                ", status='" + status + '\'' +
                ", goodsSpecCount='" + goodsSpecCount + '\'' +
                ", orderSource='" + orderSource + '\'' +
                ", isConsumer='" + isConsumer + '\'' +
                ", defaultSpecName='" + defaultSpecName + '\'' +
                '}';
    }

    /**
     * 用于比较内容是否相同的方法，这个方法比toString少了一个“剩余时间”字段
     * @return
     */
    public String toCompareString(){
        return "itemInfoBean{" +
                "createTime='" + createTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemId='" + itemId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", leftTime='" + leftTime + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", origin='" + origin + '\'' +
                ", isNew='" + isNew + '\'' +
                ", goodsCate='" + goodsCate + '\'' +
                ", featureId='" + featureId + '\'' +
                ", featureName='" + featureName + '\'' +
                ", featureSrc='" + featureSrc + '\'' +
                ", featureDesc='" + featureDesc + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", status='" + status + '\'' +
                ", goodsSpecCount='" + goodsSpecCount + '\'' +
                ", orderSource='" + orderSource + '\'' +
                '}';
    }

    @Override
    public int compareTo(itemInfoBean another) {
        return toCompareString().compareTo(another.toCompareString());
    }
}
